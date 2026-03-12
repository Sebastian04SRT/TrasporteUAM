package mx.uam.cua.tysi.integracion.TrasporteUAM.controller;

import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.ViajeDTO;
import mx.uam.cua.tysi.integracion.TrasporteUAM.service.ViajeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ViajeController {

    private final ViajeService viajeService;

    public ViajeController(ViajeService viajeService) {
        this.viajeService = viajeService;
    }

    @PostMapping("/viajes")
    public ViajeDTO create(@RequestBody ViajeDTO dto) {
        return viajeService.create(dto);
    }

    @GetMapping("/viajes")
    public List<ViajeDTO> getAll() {
        return viajeService.getAll();
    }

    @GetMapping("/viajes/{id}")
    public ViajeDTO getById(@PathVariable Integer id) {
        return viajeService.getById(id);
    }

    @PatchMapping("/viajes/{id}")
    public ViajeDTO update(@PathVariable Integer id, @RequestBody ViajeDTO dto) {
        return viajeService.update(id, dto);
    }

    @DeleteMapping("/viajes/{id}")
    public void delete(@PathVariable Integer id) {
        viajeService.delete(id);
    }
}