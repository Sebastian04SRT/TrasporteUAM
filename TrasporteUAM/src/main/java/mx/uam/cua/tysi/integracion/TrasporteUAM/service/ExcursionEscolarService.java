package mx.uam.cua.tysi.integracion.TrasporteUAM.service;

import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.ExcursionEscolarDTO;
import java.util.List;

public interface ExcursionEscolarService {
    ExcursionEscolarDTO create(ExcursionEscolarDTO dto);
    List<ExcursionEscolarDTO> getAll();
    ExcursionEscolarDTO getById(Integer id);
    ExcursionEscolarDTO update(Integer id, ExcursionEscolarDTO dto);
    void delete(Integer id);
}