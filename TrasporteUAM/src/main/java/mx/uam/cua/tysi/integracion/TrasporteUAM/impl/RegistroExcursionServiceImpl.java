package mx.uam.cua.tysi.integracion.TrasporteUAM.impl;


import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.RegistroExcursionDTO;
import mx.uam.cua.tysi.integracion.TrasporteUAM.entity.RegistroExcursion;
import mx.uam.cua.tysi.integracion.TrasporteUAM.repository.RegistroExcursionRepository;
import mx.uam.cua.tysi.integracion.TrasporteUAM.service.RegistroExcursionService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RegistroExcursionServiceImpl implements RegistroExcursionService {

    private final RegistroExcursionRepository registroExcursionRepository;

    public RegistroExcursionServiceImpl(RegistroExcursionRepository registroExcursionRepository) {
        this.registroExcursionRepository = registroExcursionRepository;
    }

    @Override
    public RegistroExcursionDTO create(RegistroExcursionDTO dto) {
        RegistroExcursion entity = new RegistroExcursion();
        entity.setIdExcursion(dto.getIdExcursion());
        entity.setMatriculaEstudiante(dto.getMatriculaEstudiante());
        entity.setEstado(dto.getEstado());

        RegistroExcursion saved = registroExcursionRepository.save(entity);
        dto.setIdRegExcursion(saved.getIdRegExcursion());
        return dto;
    }

    @Override
    public List<RegistroExcursionDTO> getAll() {
        List<RegistroExcursion> lista = registroExcursionRepository.findAll();
        List<RegistroExcursionDTO> resultado = new ArrayList<>();

        for (RegistroExcursion entity : lista) {
            RegistroExcursionDTO dto = new RegistroExcursionDTO();
            dto.setIdRegExcursion(entity.getIdRegExcursion());
            dto.setIdExcursion(entity.getIdExcursion());
            dto.setMatriculaEstudiante(entity.getMatriculaEstudiante());
            dto.setEstado(entity.getEstado());
            resultado.add(dto);
        }
        return resultado;
    }

    @Override
    public RegistroExcursionDTO getById(Integer id) {
        Optional<RegistroExcursion> optional = registroExcursionRepository.findById(id);
        if (optional.isEmpty()) return null;

        RegistroExcursion entity = optional.get();
        RegistroExcursionDTO dto = new RegistroExcursionDTO();
        dto.setIdRegExcursion(entity.getIdRegExcursion());
        dto.setIdExcursion(entity.getIdExcursion());
        dto.setMatriculaEstudiante(entity.getMatriculaEstudiante());
        dto.setEstado(entity.getEstado());
        return dto;
    }

    @Override
    public RegistroExcursionDTO update(Integer id, RegistroExcursionDTO dto) {
        Optional<RegistroExcursion> optional = registroExcursionRepository.findById(id);
        if (optional.isEmpty()) return null;

        RegistroExcursion entity = optional.get();
        if (dto.getIdExcursion() != 0) entity.setIdExcursion(dto.getIdExcursion());
        if (dto.getMatriculaEstudiante() != null) entity.setMatriculaEstudiante(dto.getMatriculaEstudiante());
        if (dto.getEstado() != null) entity.setEstado(dto.getEstado());

        RegistroExcursion updated = registroExcursionRepository.save(entity);
        RegistroExcursionDTO resultado = new RegistroExcursionDTO();
        resultado.setIdRegExcursion(updated.getIdRegExcursion());
        resultado.setIdExcursion(updated.getIdExcursion());
        resultado.setMatriculaEstudiante(updated.getMatriculaEstudiante());
        resultado.setEstado(updated.getEstado());
        return resultado;
    }

    @Override
    public void delete(Integer id) {
        registroExcursionRepository.deleteById(id);
    }
}