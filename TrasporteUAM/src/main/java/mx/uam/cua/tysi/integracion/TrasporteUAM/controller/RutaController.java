package mx.uam.cua.tysi.integracion.TrasporteUAM.controller;


import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.RutaDTO;
import mx.uam.cua.tysi.integracion.TrasporteUAM.service.RutaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class RutaController {

    private final RutaService rutaService;

    public RutaController(RutaService rutaService) {
        this.rutaService = rutaService;
    }

    @PostMapping("/rutas")
    public RutaDTO create(@RequestBody RutaDTO dto) {
        return rutaService.create(dto);
    }

    @GetMapping("/rutas")
    public List<RutaDTO> getAll() {
        return rutaService.getAll();
    }

    @GetMapping("/rutas/{id}")
    public RutaDTO getById(@PathVariable Integer id) {
        return rutaService.getById(id);
    }

    @PatchMapping("/rutas/{id}")
    public RutaDTO update(@PathVariable Integer id, @RequestBody RutaDTO dto) {
        return rutaService.update(id, dto);
    }

    @DeleteMapping("/rutas/{id}")
    public void delete(@PathVariable Integer id) {
        rutaService.delete(id);
    }
}