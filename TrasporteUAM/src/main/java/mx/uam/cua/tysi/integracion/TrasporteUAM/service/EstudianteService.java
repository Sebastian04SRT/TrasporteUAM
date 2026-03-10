package mx.uam.cua.tysi.integracion.TrasporteUAM.service;



import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.EstudianteDTO;
import java.util.List;

public interface EstudianteService {
    EstudianteDTO create(EstudianteDTO dto);
    List<EstudianteDTO> getAll();
    EstudianteDTO getById(String matricula);
    EstudianteDTO update(String matricula, EstudianteDTO dto);
    void delete(String matricula);
}