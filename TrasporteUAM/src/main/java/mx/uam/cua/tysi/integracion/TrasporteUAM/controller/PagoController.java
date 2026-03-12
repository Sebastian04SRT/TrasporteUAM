package mx.uam.cua.tysi.integracion.TrasporteUAM.controller;

import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.PagoDTO;
import mx.uam.cua.tysi.integracion.TrasporteUAM.service.PagoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PagoController {

    private final PagoService pagoService;

    public PagoController(PagoService pagoService) {
        this.pagoService = pagoService;
    }

    @PostMapping("/pagos")
    public PagoDTO create(@RequestBody PagoDTO dto) {
        return pagoService.create(dto);
    }

    @GetMapping("/pagos")
    public List<PagoDTO> getAll() {
        return pagoService.getAll();
    }

    @GetMapping("/pagos/{id}")
    public PagoDTO getById(@PathVariable Integer id) {
        return pagoService.getById(id);
    }

    @PatchMapping("/pagos/{id}")
    public PagoDTO update(@PathVariable Integer id, @RequestBody PagoDTO dto) {
        return pagoService.update(id, dto);
    }

    @DeleteMapping("/pagos/{id}")
    public void delete(@PathVariable Integer id) {
        pagoService.delete(id);
    }
}