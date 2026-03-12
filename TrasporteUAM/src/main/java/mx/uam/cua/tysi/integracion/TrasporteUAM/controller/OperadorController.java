package mx.uam.cua.tysi.integracion.TrasporteUAM.controller;



import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.OperadorDTO;
import mx.uam.cua.tysi.integracion.TrasporteUAM.service.OperadorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class OperadorController {

    private final OperadorService operadorService;

    public OperadorController(OperadorService operadorService) {
        this.operadorService = operadorService;
    }

    @PostMapping("/operadores")
    public OperadorDTO create(@RequestBody OperadorDTO dto) {
        return operadorService.create(dto);
    }

    @GetMapping("/operadores")
    public List<OperadorDTO> getAll() {
        return operadorService.getAll();
    }

    @GetMapping("/operadores/{matricula}")
    public OperadorDTO getById(@PathVariable String matricula) {
        return operadorService.getById(matricula);
    }

    @PatchMapping("/operadores/{matricula}")
    public OperadorDTO update(@PathVariable String matricula, @RequestBody OperadorDTO dto) {
        return operadorService.update(matricula, dto);
    }

    @DeleteMapping("/operadores/{matricula}")
    public void delete(@PathVariable String matricula) {
        operadorService.delete(matricula);
    }
}