package mx.uam.cua.tysi.integracion.TrasporteUAM.controller;


import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.UnidadDTO;
import mx.uam.cua.tysi.integracion.TrasporteUAM.service.UnidadService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UnidadController {

    private final UnidadService unidadService;

    public UnidadController(UnidadService unidadService) {
        this.unidadService = unidadService;
    }

    @PostMapping("/unidades")
    public UnidadDTO create(@RequestBody UnidadDTO dto) {
        return unidadService.create(dto);
    }

    @GetMapping("/unidades")
    public List<UnidadDTO> getAll() {
        return unidadService.getAll();
    }

    @GetMapping("/unidades/{id}")
    public UnidadDTO getById(@PathVariable Integer id) {
        return unidadService.getById(id);
    }

    @PatchMapping("/unidades/{id}")
    public UnidadDTO update(@PathVariable Integer id, @RequestBody UnidadDTO dto) {
        return unidadService.update(id, dto);
    }

    @DeleteMapping("/unidades/{id}")
    public void delete(@PathVariable Integer id) {
        unidadService.delete(id);
    }
}