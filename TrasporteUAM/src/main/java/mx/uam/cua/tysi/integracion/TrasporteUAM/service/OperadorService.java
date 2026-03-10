package mx.uam.cua.tysi.integracion.TrasporteUAM.service;

import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.OperadorDTO;
import java.util.List;
public interface OperadorService {
    OperadorDTO create(OperadorDTO dto);
    List<OperadorDTO> getAll();
    OperadorDTO getById(String matricula);
    OperadorDTO update(String matricula, OperadorDTO dto);
    void delete(String matricula);
}
