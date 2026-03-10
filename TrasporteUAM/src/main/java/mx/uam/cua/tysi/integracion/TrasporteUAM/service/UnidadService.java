package mx.uam.cua.tysi.integracion.TrasporteUAM.service;


import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.UnidadDTO;
import java.util.List;

public interface UnidadService {
    UnidadDTO create(UnidadDTO dto);
    List<UnidadDTO> getAll();
    UnidadDTO getById(Integer id);
    UnidadDTO update(Integer id, UnidadDTO dto);
    void delete(Integer id);
}