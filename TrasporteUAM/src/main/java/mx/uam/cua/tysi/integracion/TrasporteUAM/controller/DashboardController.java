package mx.uam.cua.tysi.integracion.TrasporteUAM.controller;

import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.DashboardDTO;
import mx.uam.cua.tysi.integracion.TrasporteUAM.service.DashboardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dashboard")
@CrossOrigin(origins = "*")
public class DashboardController {
    private final DashboardService dashboardService;
    public DashboardController(DashboardService dashboardService) { this.dashboardService = dashboardService; }

    @GetMapping("/ocio")
    public ResponseEntity<DashboardDTO> getDatosOcio(
            @RequestParam(defaultValue = "goku") String db,
            @RequestParam(defaultValue = "Liverpool") String equipo,
            @RequestParam(defaultValue = "foto") String gato) {
        return ResponseEntity.ok(dashboardService.obtenerDatos(db, equipo, gato));
    }
}