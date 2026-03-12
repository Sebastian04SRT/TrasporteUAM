package mx.uam.cua.tysi.integracion.TrasporteUAM.impl;


import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.ExcursionEscolarDTO;
import mx.uam.cua.tysi.integracion.TrasporteUAM.entity.ExcursionEscolar;
import mx.uam.cua.tysi.integracion.TrasporteUAM.repository.ExcursionEscolarRepository;
import mx.uam.cua.tysi.integracion.TrasporteUAM.service.ExcursionEscolarService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ExcursionEscolarServiceImpl implements ExcursionEscolarService {

    private final ExcursionEscolarRepository excursionEscolarRepository;

    public ExcursionEscolarServiceImpl(ExcursionEscolarRepository excursionEscolarRepository) {
        this.excursionEscolarRepository = excursionEscolarRepository;
    }

    @Override
    public ExcursionEscolarDTO create(ExcursionEscolarDTO dto) {
        ExcursionEscolar entity = new ExcursionEscolar();
        entity.setIdUniversidad(dto.getIdUniversidad());
        entity.setIdUnidad(dto.getIdUnidad());
        entity.setMatriculaOperador(dto.getMatriculaOperador());
        entity.setNombre(dto.getNombre());
        entity.setDestino(dto.getDestino());
        entity.setFecha(dto.getFecha());
        entity.setHoraSalida(dto.getHoraSalida());
        entity.setHoraRegreso(dto.getHoraRegreso());
        entity.setCosto(dto.getCosto());
        entity.setCupoMaximo(dto.getCupoMaximo());
        entity.setEstado(dto.getEstado());

        ExcursionEscolar saved = excursionEscolarRepository.save(entity);
        dto.setIdExcursion(saved.getIdExcursion());
        return dto;
    }

    @Override
    public List<ExcursionEscolarDTO> getAll() {
        List<ExcursionEscolar> lista = excursionEscolarRepository.findAll();
        List<ExcursionEscolarDTO> resultado = new ArrayList<>();

        for (ExcursionEscolar entity : lista) {
            ExcursionEscolarDTO dto = new ExcursionEscolarDTO();
            dto.setIdExcursion(entity.getIdExcursion());
            dto.setIdUniversidad(entity.getIdUniversidad());
            dto.setIdUnidad(entity.getIdUnidad());
            dto.setMatriculaOperador(entity.getMatriculaOperador());
            dto.setNombre(entity.getNombre());
            dto.setDestino(entity.getDestino());
            dto.setFecha(entity.getFecha());
            dto.setHoraSalida(entity.getHoraSalida());
            dto.setHoraRegreso(entity.getHoraRegreso());
            dto.setCosto(entity.getCosto());
            dto.setCupoMaximo(entity.getCupoMaximo());
            dto.setEstado(entity.getEstado());
            resultado.add(dto);
        }
        return resultado;
    }

    @Override
    public ExcursionEscolarDTO getById(Integer id) {
        Optional<ExcursionEscolar> optional = excursionEscolarRepository.findById(id);
        if (optional.isEmpty()) return null;

        ExcursionEscolar entity = optional.get();
        ExcursionEscolarDTO dto = new ExcursionEscolarDTO();
        dto.setIdExcursion(entity.getIdExcursion());
        dto.setIdUniversidad(entity.getIdUniversidad());
        dto.setIdUnidad(entity.getIdUnidad());
        dto.setMatriculaOperador(entity.getMatriculaOperador());
        dto.setNombre(entity.getNombre());
        dto.setDestino(entity.getDestino());
        dto.setFecha(entity.getFecha());
        dto.setHoraSalida(entity.getHoraSalida());
        dto.setHoraRegreso(entity.getHoraRegreso());
        dto.setCosto(entity.getCosto());
        dto.setCupoMaximo(entity.getCupoMaximo());
        dto.setEstado(entity.getEstado());
        return dto;
    }

    @Override
    public ExcursionEscolarDTO update(Integer id, ExcursionEscolarDTO dto) {
        Optional<ExcursionEscolar> optional = excursionEscolarRepository.findById(id);
        if (optional.isEmpty()) return null;

        ExcursionEscolar entity = optional.get();
        if (dto.getIdUniversidad() != 0) entity.setIdUniversidad(dto.getIdUniversidad());
        if (dto.getIdUnidad() != 0) entity.setIdUnidad(dto.getIdUnidad());
        if (dto.getMatriculaOperador() != null) entity.setMatriculaOperador(dto.getMatriculaOperador());
        if (dto.getNombre() != null) entity.setNombre(dto.getNombre());
        if (dto.getDestino() != null) entity.setDestino(dto.getDestino());
        if (dto.getFecha() != null) entity.setFecha(dto.getFecha());
        if (dto.getHoraSalida() != null) entity.setHoraSalida(dto.getHoraSalida());
        if (dto.getHoraRegreso() != null) entity.setHoraRegreso(dto.getHoraRegreso());
        if (dto.getCosto() != null) entity.setCosto(dto.getCosto());
        if (dto.getCupoMaximo() != 0) entity.setCupoMaximo(dto.getCupoMaximo());
        if (dto.getEstado() != null) entity.setEstado(dto.getEstado());

        ExcursionEscolar updated = excursionEscolarRepository.save(entity);
        ExcursionEscolarDTO resultado = new ExcursionEscolarDTO();
        resultado.setIdExcursion(updated.getIdExcursion());
        resultado.setIdUniversidad(updated.getIdUniversidad());
        resultado.setIdUnidad(updated.getIdUnidad());
        resultado.setMatriculaOperador(updated.getMatriculaOperador());
        resultado.setNombre(updated.getNombre());
        resultado.setDestino(updated.getDestino());
        resultado.setFecha(updated.getFecha());
        resultado.setHoraSalida(updated.getHoraSalida());
        resultado.setHoraRegreso(updated.getHoraRegreso());
        resultado.setCosto(updated.getCosto());
        resultado.setCupoMaximo(updated.getCupoMaximo());
        resultado.setEstado(updated.getEstado());
        return resultado;
    }

    @Override
    public void delete(Integer id) {
        excursionEscolarRepository.deleteById(id);
    }
}