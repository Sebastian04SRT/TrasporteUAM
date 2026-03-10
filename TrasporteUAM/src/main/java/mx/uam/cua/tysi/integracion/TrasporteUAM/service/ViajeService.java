package mx.uam.cua.tysi.integracion.TrasporteUAM.service;

import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.ViajeDTO;
import java.util.List;

public interface ViajeService {
    ViajeDTO create(ViajeDTO dto);
    List<ViajeDTO> getAll();
    ViajeDTO getById(Integer id);
    ViajeDTO update(Integer id, ViajeDTO dto);
    void delete(Integer id);
}