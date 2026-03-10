package mx.uam.cua.tysi.integracion.TrasporteUAM.service;

import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.RegistroExcursionDTO;
import java.util.List;

public interface RegistroExcursionService {
    RegistroExcursionDTO create(RegistroExcursionDTO dto);
    List<RegistroExcursionDTO> getAll();
    RegistroExcursionDTO getById(Integer id);
    RegistroExcursionDTO update(Integer id, RegistroExcursionDTO dto);
    void delete(Integer id);
}