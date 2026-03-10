package mx.uam.cua.tysi.integracion.TrasporteUAM.service;

import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.PagoDTO;
import java.util.List;

public interface PagoService {
    PagoDTO create(PagoDTO dto);
    List<PagoDTO> getAll();
    PagoDTO getById(Integer id);
    PagoDTO update(Integer id, PagoDTO dto);
    void delete(Integer id);
}