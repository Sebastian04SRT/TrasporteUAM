package mx.uam.cua.tysi.integracion.TrasporteUAM.controller;



import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.ExcursionEscolarDTO;
import mx.uam.cua.tysi.integracion.TrasporteUAM.service.ExcursionEscolarService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ExcursionEscolarController {

    private final ExcursionEscolarService excursionEscolarService;

    public ExcursionEscolarController(ExcursionEscolarService excursionEscolarService) {
        this.excursionEscolarService = excursionEscolarService;
    }

    @PostMapping("/excursiones")
    public ExcursionEscolarDTO create(@RequestBody ExcursionEscolarDTO dto) {
        return excursionEscolarService.create(dto);
    }

    @GetMapping("/excursiones")
    public List<ExcursionEscolarDTO> getAll() {
        return excursionEscolarService.getAll();
    }

    @GetMapping("/excursiones/{id}")
    public ExcursionEscolarDTO getById(@PathVariable Integer id) {
        return excursionEscolarService.getById(id);
    }

    @PatchMapping("/excursiones/{id}")
    public ExcursionEscolarDTO update(@PathVariable Integer id, @RequestBody ExcursionEscolarDTO dto) {
        return excursionEscolarService.update(id, dto);
    }

    @DeleteMapping("/excursiones/{id}")
    public void delete(@PathVariable Integer id) {
        excursionEscolarService.delete(id);
    }
}