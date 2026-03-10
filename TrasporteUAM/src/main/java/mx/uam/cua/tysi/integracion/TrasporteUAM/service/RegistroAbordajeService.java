package mx.uam.cua.tysi.integracion.TrasporteUAM.service;

import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.RegistroAbordajeDTO;
import java.util.List;

public interface RegistroAbordajeService {
    RegistroAbordajeDTO create(RegistroAbordajeDTO dto);
    List<RegistroAbordajeDTO> getAll();
    RegistroAbordajeDTO getById(Integer id);
    RegistroAbordajeDTO update(Integer id, RegistroAbordajeDTO dto);
    void delete(Integer id);
}