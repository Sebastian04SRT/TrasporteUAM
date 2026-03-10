package mx.uam.cua.tysi.integracion.TrasporteUAM.impl;


import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.UniversidadDTO;
import mx.uam.cua.tysi.integracion.TrasporteUAM.entity.Universidad;
import mx.uam.cua.tysi.integracion.TrasporteUAM.repository.UniversidadRepository;
import mx.uam.cua.tysi.integracion.TrasporteUAM.service.UniversidadService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UniversidadServiceImpl implements UniversidadService {

    private final UniversidadRepository universidadRepository;

    public UniversidadServiceImpl(UniversidadRepository universidadRepository) {
        this.universidadRepository = universidadRepository;
    }

    // ✅ CREATE
    @Override
    public UniversidadDTO create(UniversidadDTO dto) {
        Universidad entity = new Universidad();
        entity.setNombre(dto.getNombre());
        entity.setDireccion(dto.getDireccion());
        entity.setTelefono(dto.getTelefono());

        Universidad saved = universidadRepository.save(entity);
        dto.setIdUniversidad(saved.getIdUniversidad());
        return dto;
    }

    // ✅ GET ALL
    @Override
    public List<UniversidadDTO> getAll() {
        List<Universidad> lista = universidadRepository.findAll();
        List<UniversidadDTO> resultado = new ArrayList<>();

        for (Universidad entity : lista) {
            UniversidadDTO dto = new UniversidadDTO();
            dto.setIdUniversidad(entity.getIdUniversidad());
            dto.setNombre(entity.getNombre());
            dto.setDireccion(entity.getDireccion());
            dto.setTelefono(entity.getTelefono());
            resultado.add(dto);
        }
        return resultado;
    }

    // ✅ GET BY ID
    @Override
    public UniversidadDTO getById(Integer id) {
        Optional<Universidad> optional = universidadRepository.findById(id);
        if (optional.isEmpty()) return null;

        Universidad entity = optional.get();
        UniversidadDTO dto = new UniversidadDTO();
        dto.setIdUniversidad(entity.getIdUniversidad());
        dto.setNombre(entity.getNombre());
        dto.setDireccion(entity.getDireccion());
        dto.setTelefono(entity.getTelefono());
        return dto;
    }

    // ✅ UPDATE
    @Override
    public UniversidadDTO update(Integer id, UniversidadDTO dto) {
        Optional<Universidad> optional = universidadRepository.findById(id);
        if (optional.isEmpty()) return null;

        Universidad entity = optional.get();
        if (dto.getNombre() != null) entity.setNombre(dto.getNombre());
        if (dto.getDireccion() != null) entity.setDireccion(dto.getDireccion());
        if (dto.getTelefono() != null) entity.setTelefono(dto.getTelefono());

        Universidad updated = universidadRepository.save(entity);
        UniversidadDTO resultado = new UniversidadDTO();
        resultado.setIdUniversidad(updated.getIdUniversidad());
        resultado.setNombre(updated.getNombre());
        resultado.setDireccion(updated.getDireccion());
        resultado.setTelefono(updated.getTelefono());
        return resultado;
    }

    // ✅ DELETE
    @Override
    public void delete(Integer id) {
        universidadRepository.deleteById(id);
    }
}