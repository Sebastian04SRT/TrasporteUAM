package mx.uam.cua.tysi.integracion.TrasporteUAM.controller;


import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.RegistroAbordajeDTO;
import mx.uam.cua.tysi.integracion.TrasporteUAM.service.RegistroAbordajeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class RegistroAbordajeController {

    private final RegistroAbordajeService registroAbordajeService;

    public RegistroAbordajeController(RegistroAbordajeService registroAbordajeService) {
        this.registroAbordajeService = registroAbordajeService;
    }

    @PostMapping("/registros-abordaje")
    public RegistroAbordajeDTO create(@RequestBody RegistroAbordajeDTO dto) {
        return registroAbordajeService.create(dto);
    }

    @GetMapping("/registros-abordaje")
    public List<RegistroAbordajeDTO> getAll() {
        return registroAbordajeService.getAll();
    }

    @GetMapping("/registros-abordaje/{id}")
    public RegistroAbordajeDTO getById(@PathVariable Integer id) {
        return registroAbordajeService.getById(id);
    }

    @PatchMapping("/registros-abordaje/{id}")
    public RegistroAbordajeDTO update(@PathVariable Integer id, @RequestBody RegistroAbordajeDTO dto) {
        return registroAbordajeService.update(id, dto);
    }

    @DeleteMapping("/registros-abordaje/{id}")
    public void delete(@PathVariable Integer id) {
        registroAbordajeService.delete(id);
    }
}