package mx.uam.cua.tysi.integracion.TrasporteUAM.service;



import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.UniversidadDTO;
import java.util.List;

public interface UniversidadService {
    UniversidadDTO create(UniversidadDTO dto);
    List<UniversidadDTO> getAll();
    UniversidadDTO getById(Integer id);
    UniversidadDTO update(Integer id, UniversidadDTO dto);
    void delete(Integer id);
}