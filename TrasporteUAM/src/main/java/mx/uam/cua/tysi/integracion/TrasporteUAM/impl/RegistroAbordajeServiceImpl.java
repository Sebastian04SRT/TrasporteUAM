package mx.uam.cua.tysi.integracion.TrasporteUAM.impl;

import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.RegistroAbordajeDTO;
import mx.uam.cua.tysi.integracion.TrasporteUAM.entity.RegistroAbordaje;
import mx.uam.cua.tysi.integracion.TrasporteUAM.repository.RegistroAbordajeRepository;
import mx.uam.cua.tysi.integracion.TrasporteUAM.service.RegistroAbordajeService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RegistroAbordajeServiceImpl implements RegistroAbordajeService {

    private final RegistroAbordajeRepository registroAbordajeRepository;

    public RegistroAbordajeServiceImpl(RegistroAbordajeRepository registroAbordajeRepository) {
        this.registroAbordajeRepository = registroAbordajeRepository;
    }

    @Override
    public RegistroAbordajeDTO create(RegistroAbordajeDTO dto) {
        RegistroAbordaje entity = new RegistroAbordaje();
        entity.setMatriculaEstudiante(dto.getMatriculaEstudiante());
        entity.setIdViaje(dto.getIdViaje());
        entity.setEstado(dto.getEstado());

        RegistroAbordaje saved = registroAbordajeRepository.save(entity);
        dto.setIdRegistro(saved.getIdRegistro());
        return dto;
    }

    @Override
    public List<RegistroAbordajeDTO> getAll() {
        List<RegistroAbordaje> lista = registroAbordajeRepository.findAll();
        List<RegistroAbordajeDTO> resultado = new ArrayList<>();

        for (RegistroAbordaje entity : lista) {
            RegistroAbordajeDTO dto = new RegistroAbordajeDTO();
            dto.setIdRegistro(entity.getIdRegistro());
            dto.setMatriculaEstudiante(entity.getMatriculaEstudiante());
            dto.setIdViaje(entity.getIdViaje());
            dto.setEstado(entity.getEstado());
            resultado.add(dto);
        }
        return resultado;
    }

    @Override
    public RegistroAbordajeDTO getById(Integer id) {
        Optional<RegistroAbordaje> optional = registroAbordajeRepository.findById(id);
        if (optional.isEmpty()) return null;

        RegistroAbordaje entity = optional.get();
        RegistroAbordajeDTO dto = new RegistroAbordajeDTO();
        dto.setIdRegistro(entity.getIdRegistro());
        dto.setMatriculaEstudiante(entity.getMatriculaEstudiante());
        dto.setIdViaje(entity.getIdViaje());
        dto.setEstado(entity.getEstado());
        return dto;
    }

    @Override
    public RegistroAbordajeDTO update(Integer id, RegistroAbordajeDTO dto) {
        Optional<RegistroAbordaje> optional = registroAbordajeRepository.findById(id);
        if (optional.isEmpty()) return null;

        RegistroAbordaje entity = optional.get();
        if (dto.getMatriculaEstudiante() != null) entity.setMatriculaEstudiante(dto.getMatriculaEstudiante());
        if (dto.getIdViaje() != 0) entity.setIdViaje(dto.getIdViaje());
        if (dto.getEstado() != null) entity.setEstado(dto.getEstado());

        RegistroAbordaje updated = registroAbordajeRepository.save(entity);
        RegistroAbordajeDTO resultado = new RegistroAbordajeDTO();
        resultado.setIdRegistro(updated.getIdRegistro());
        resultado.setMatriculaEstudiante(updated.getMatriculaEstudiante());
        resultado.setIdViaje(updated.getIdViaje());
        resultado.setEstado(updated.getEstado());
        return resultado;
    }

    @Override
    public void delete(Integer id) {
        registroAbordajeRepository.deleteById(id);
    }
}
