package mx.uam.cua.tysi.integracion.TrasporteUAM.controller;

import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.EstudianteDTO;
import mx.uam.cua.tysi.integracion.TrasporteUAM.service.EstudianteService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EstudianteController {

    private final EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @PostMapping("/estudiantes")
    public EstudianteDTO create(@RequestBody EstudianteDTO dto) {
        return estudianteService.create(dto);
    }

    @GetMapping("/estudiantes")
    public List<EstudianteDTO> getAll() {
        return estudianteService.getAll();
    }

    @GetMapping("/estudiantes/{matricula}")
    public EstudianteDTO getById(@PathVariable String matricula) {
        return estudianteService.getById(matricula);
    }

    @PatchMapping("/estudiantes/{matricula}")
    public EstudianteDTO update(@PathVariable String matricula, @RequestBody EstudianteDTO dto) {
        return estudianteService.update(matricula, dto);
    }

    @DeleteMapping("/estudiantes/{matricula}")
    public void delete(@PathVariable String matricula) {
        estudianteService.delete(matricula);
    }
}