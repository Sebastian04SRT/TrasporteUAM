package mx.uam.cua.tysi.integracion.TrasporteUAM.impl;


import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.EstudianteDTO;
import mx.uam.cua.tysi.integracion.TrasporteUAM.entity.Estudiante;
import mx.uam.cua.tysi.integracion.TrasporteUAM.repository.EstudianteRepository;
import mx.uam.cua.tysi.integracion.TrasporteUAM.service.EstudianteService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    private final EstudianteRepository estudianteRepository;

    public EstudianteServiceImpl(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public EstudianteDTO create(EstudianteDTO dto) {
        Estudiante entity = new Estudiante();
        entity.setMatricula(dto.getMatricula());
        entity.setIdUniversidad(dto.getIdUniversidad());
        entity.setNombre(dto.getNombre());
        entity.setCarrera(dto.getCarrera());
        entity.setSemestre(dto.getSemestre());
        entity.setTelefono(dto.getTelefono());
        entity.setDireccion(dto.getDireccion());
        entity.setEstatus(dto.getEstatus());

        estudianteRepository.save(entity);
        return dto;
    }

    @Override
    public List<EstudianteDTO> getAll() {
        List<Estudiante> lista = estudianteRepository.findAll();
        List<EstudianteDTO> resultado = new ArrayList<>();

        for (Estudiante entity : lista) {
            EstudianteDTO dto = new EstudianteDTO();
            dto.setMatricula(entity.getMatricula());
            dto.setIdUniversidad(entity.getIdUniversidad());
            dto.setNombre(entity.getNombre());
            dto.setCarrera(entity.getCarrera());
            dto.setSemestre(entity.getSemestre());
            dto.setTelefono(entity.getTelefono());
            dto.setDireccion(entity.getDireccion());
            dto.setEstatus(entity.getEstatus());
            resultado.add(dto);
        }
        return resultado;
    }

    @Override
    public EstudianteDTO getById(String matricula) {
        Optional<Estudiante> optional = estudianteRepository.findById(matricula);
        if (optional.isEmpty()) return null;

        Estudiante entity = optional.get();
        EstudianteDTO dto = new EstudianteDTO();
        dto.setMatricula(entity.getMatricula());
        dto.setIdUniversidad(entity.getIdUniversidad());
        dto.setNombre(entity.getNombre());
        dto.setCarrera(entity.getCarrera());
        dto.setSemestre(entity.getSemestre());
        dto.setTelefono(entity.getTelefono());
        dto.setDireccion(entity.getDireccion());
        dto.setEstatus(entity.getEstatus());
        return dto;
    }

    @Override
    public EstudianteDTO update(String matricula, EstudianteDTO dto) {
        Optional<Estudiante> optional = estudianteRepository.findById(matricula);
        if (optional.isEmpty()) return null;

        Estudiante entity = optional.get();
        if (dto.getNombre() != null) entity.setNombre(dto.getNombre());
        if (dto.getCarrera() != null) entity.setCarrera(dto.getCarrera());
        if (dto.getSemestre() != 0) entity.setSemestre(dto.getSemestre());
        if (dto.getTelefono() != null) entity.setTelefono(dto.getTelefono());
        if (dto.getDireccion() != null) entity.setDireccion(dto.getDireccion());
        if (dto.getEstatus() != null) entity.setEstatus(dto.getEstatus());

        Estudiante updated = estudianteRepository.save(entity);
        EstudianteDTO resultado = new EstudianteDTO();
        resultado.setMatricula(updated.getMatricula());
        resultado.setIdUniversidad(updated.getIdUniversidad());
        resultado.setNombre(updated.getNombre());
        resultado.setCarrera(updated.getCarrera());
        resultado.setSemestre(updated.getSemestre());
        resultado.setTelefono(updated.getTelefono());
        resultado.setDireccion(updated.getDireccion());
        resultado.setEstatus(updated.getEstatus());
        return resultado;
    }

    @Override
    public void delete(String matricula) {
        estudianteRepository.deleteById(matricula);
    }
}