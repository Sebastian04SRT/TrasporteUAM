package mx.uam.cua.tysi.integracion.TrasporteUAM.controller;


import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.RegistroExcursionDTO;
import mx.uam.cua.tysi.integracion.TrasporteUAM.service.RegistroExcursionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class RegistroExcursionController {

    private final RegistroExcursionService registroExcursionService;

    public RegistroExcursionController(RegistroExcursionService registroExcursionService) {
        this.registroExcursionService = registroExcursionService;
    }

    @PostMapping("/registros-excursion")
    public RegistroExcursionDTO create(@RequestBody RegistroExcursionDTO dto) {
        return registroExcursionService.create(dto);
    }

    @GetMapping("/registros-excursion")
    public List<RegistroExcursionDTO> getAll() {
        return registroExcursionService.getAll();
    }

    @GetMapping("/registros-excursion/{id}")
    public RegistroExcursionDTO getById(@PathVariable Integer id) {
        return registroExcursionService.getById(id);
    }

    @PatchMapping("/registros-excursion/{id}")
    public RegistroExcursionDTO update(@PathVariable Integer id, @RequestBody RegistroExcursionDTO dto) {
        return registroExcursionService.update(id, dto);
    }

    @DeleteMapping("/registros-excursion/{id}")
    public void delete(@PathVariable Integer id) {
        registroExcursionService.delete(id);
    }
}