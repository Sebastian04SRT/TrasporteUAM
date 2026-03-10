package mx.uam.cua.tysi.integracion.TrasporteUAM.dto;

public class RutaDTO {
    private int idRuta;
    private String nombreRuta;
    private String origen;
    private String destino;

    public int getIdRuta() { return idRuta; }
    public void setIdRuta(int idRuta) { this.idRuta = idRuta; }

    public String getNombreRuta() { return nombreRuta; }
    public void setNombreRuta(String nombreRuta) { this.nombreRuta = nombreRuta; }

    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }
}