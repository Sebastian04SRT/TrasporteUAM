package mx.uam.cua.tysi.integracion.TrasporteUAM.service;

import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.RutaDTO;
import java.util.List;
public interface RutaService {
    RutaDTO create(RutaDTO dto);

    List<RutaDTO> getAll();

    RutaDTO getById(Integer id);

    RutaDTO update(Integer id, RutaDTO dto);

    void delete(Integer id);
}