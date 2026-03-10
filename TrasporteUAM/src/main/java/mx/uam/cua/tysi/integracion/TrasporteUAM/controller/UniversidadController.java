package mx.uam.cua.tysi.integracion.TrasporteUAM.controller;


import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.UniversidadDTO;
import mx.uam.cua.tysi.integracion.TrasporteUAM.service.UniversidadService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UniversidadController {

    private final UniversidadService universidadService;

    public UniversidadController(UniversidadService universidadService) {
        this.universidadService = universidadService;
    }

    @PostMapping("/universidades")
    public UniversidadDTO create(@RequestBody UniversidadDTO dto) {
        return universidadService.create(dto);
    }

    @GetMapping("/universidades")
    public List<UniversidadDTO> getAll() {
        return universidadService.getAll();
    }

    @GetMapping("/universidades/{id}")
    public UniversidadDTO getById(@PathVariable Integer id) {
        return universidadService.getById(id);
    }

    @PatchMapping("/universidades/{id}")
    public UniversidadDTO update(@PathVariable Integer id, @RequestBody UniversidadDTO dto) {
        return universidadService.update(id, dto);
    }

    @DeleteMapping("/universidades/{id}")
    public void delete(@PathVariable Integer id) {
        universidadService.delete(id);
    }
}