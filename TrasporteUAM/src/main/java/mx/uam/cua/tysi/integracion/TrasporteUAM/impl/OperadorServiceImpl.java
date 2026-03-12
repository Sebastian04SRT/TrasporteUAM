package mx.uam.cua.tysi.integracion.TrasporteUAM.impl;


import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.OperadorDTO;
import mx.uam.cua.tysi.integracion.TrasporteUAM.entity.Operador;
import mx.uam.cua.tysi.integracion.TrasporteUAM.repository.OperadorRepository;
import mx.uam.cua.tysi.integracion.TrasporteUAM.service.OperadorService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OperadorServiceImpl implements OperadorService {

    private final OperadorRepository operadorRepository;

    public OperadorServiceImpl(OperadorRepository operadorRepository) {
        this.operadorRepository = operadorRepository;
    }

    @Override
    public OperadorDTO create(OperadorDTO dto) {
        Operador entity = new Operador();
        entity.setMatricula(dto.getMatricula());
        entity.setNombre(dto.getNombre());
        entity.setTelefono(dto.getTelefono());
        entity.setEstado(dto.getEstado());

        operadorRepository.save(entity);
        return dto;
    }

    @Override
    public List<OperadorDTO> getAll() {
        List<Operador> lista = operadorRepository.findAll();
        List<OperadorDTO> resultado = new ArrayList<>();

        for (Operador entity : lista) {
            OperadorDTO dto = new OperadorDTO();
            dto.setMatricula(entity.getMatricula());
            dto.setNombre(entity.getNombre());
            dto.setTelefono(entity.getTelefono());
            dto.setEstado(entity.getEstado());
            resultado.add(dto);
        }
        return resultado;
    }

    @Override
    public OperadorDTO getById(String matricula) {
        Optional<Operador> optional = operadorRepository.findById(matricula);
        if (optional.isEmpty()) return null;

        Operador entity = optional.get();
        OperadorDTO dto = new OperadorDTO();
        dto.setMatricula(entity.getMatricula());
        dto.setNombre(entity.getNombre());
        dto.setTelefono(entity.getTelefono());
        dto.setEstado(entity.getEstado());
        return dto;
    }

    @Override
    public OperadorDTO update(String matricula, OperadorDTO dto) {
        Optional<Operador> optional = operadorRepository.findById(matricula);
        if (optional.isEmpty()) return null;

        Operador entity = optional.get();
        if (dto.getNombre() != null) entity.setNombre(dto.getNombre());
        if (dto.getTelefono() != null) entity.setTelefono(dto.getTelefono());
        if (dto.getEstado() != null) entity.setEstado(dto.getEstado());

        Operador updated = operadorRepository.save(entity);
        OperadorDTO resultado = new OperadorDTO();
        resultado.setMatricula(updated.getMatricula());
        resultado.setNombre(updated.getNombre());
        resultado.setTelefono(updated.getTelefono());
        resultado.setEstado(updated.getEstado());
        return resultado;
    }

    @Override
    public void delete(String matricula) {
        operadorRepository.deleteById(matricula);
    }
}