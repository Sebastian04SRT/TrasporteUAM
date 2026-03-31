package mx.uam.cua.tysi.integracion.TrasporteUAM.service;

import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.DashboardDTO;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DashboardService {
    private final RestTemplate restTemplate;
    public DashboardService(RestTemplate restTemplate) { this.restTemplate = restTemplate; }

    public DashboardDTO obtenerDatos(String nombrePersonaje, String nombreEquipo, String tipoGato) {
        // 1. GATOS: Usamos CATAAS (Cats as a Service) que es más directa para fotos/gifs
        String gatoImgUrl = "https://cataas.com/cat";
        if ("gif".equalsIgnoreCase(tipoGato)) {
            gatoImgUrl = "https://cataas.com/cat/gif";
        }
        // Truco para que la imagen siempre cambie y no se quede en caché
        gatoImgUrl += "?cache=" + System.currentTimeMillis();

        // 2. DRAGON BALL: Buscamos por nombre
        String dbNombre = "No encontrado", dbRaza = "-", dbKi = "-", dbImgUrl = "";
        try {
            JsonNode dbNode = restTemplate.getForObject("https://dragonball-api.com/api/characters?name=" + nombrePersonaje, JsonNode.class);
            if (dbNode != null && dbNode.isArray() && !dbNode.isEmpty()) {
                JsonNode pj = dbNode.get(0);
                dbNombre = pj.get("name").asText();
                dbRaza = pj.get("race").asText();
                dbKi = pj.get("ki").asText();
                dbImgUrl = pj.get("image").asText();
            }
        } catch(Exception e) {}

        // 3. FÚTBOL: Usamos una API de escudos que no falla (creada por fans para GitHub)
        // Buscamos el nombre del equipo para intentar adivinar su logo
        String eqBusqueda = nombreEquipo.toLowerCase().replace(" ", "-");
        String futLogoUrl = "https://raw.githubusercontent.com/luukhopman/football-logos/master/logos/clubs/england/" + eqBusqueda + ".png";

        // Si no es de Inglaterra o no lo encuentra, usamos este respaldo de Wikipedia
        String futNombre = nombreEquipo;
        String futEstadio = "Estadio Principal";
        String futPais = "Consultando...";

        // Intentamos obtener datos reales de TheSportsDB pero con respaldo de imagen seguro
        try {
            JsonNode futNode = restTemplate.getForObject("https://www.thesportsdb.com/api/v1/json/3/searchteams.php?t=" + nombreEquipo, JsonNode.class);
            if (futNode != null && futNode.has("teams") && !futNode.get("teams").isNull()) {
                JsonNode team = futNode.get("teams").get(0);
                futNombre = team.get("strTeam").asText();
                futPais = team.get("strCountry").asText();
                // Si la API trae logo, lo usamos, si no, nos quedamos con el de GitHub
                if(team.has("strTeamBadge")) {
                    futLogoUrl = team.get("strTeamBadge").asText().replace("http://", "https://");
                }
            }
        } catch(Exception e) {}

        return new DashboardDTO(gatoImgUrl, dbNombre, dbRaza, dbKi, dbImgUrl, futNombre, futEstadio, "-", futPais, "N/A", futLogoUrl);
    }
}