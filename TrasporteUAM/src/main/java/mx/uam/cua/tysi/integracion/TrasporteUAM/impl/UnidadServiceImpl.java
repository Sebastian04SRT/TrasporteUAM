package mx.uam.cua.tysi.integracion.TrasporteUAM.impl;



import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.UnidadDTO;
import mx.uam.cua.tysi.integracion.TrasporteUAM.entity.Unidad;
import mx.uam.cua.tysi.integracion.TrasporteUAM.repository.UnidadRepository;
import mx.uam.cua.tysi.integracion.TrasporteUAM.service.UnidadService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UnidadServiceImpl implements UnidadService {

    private final UnidadRepository unidadRepository;

    public UnidadServiceImpl(UnidadRepository unidadRepository) {
        this.unidadRepository = unidadRepository;
    }

    @Override
    public UnidadDTO create(UnidadDTO dto) {
        Unidad entity = new Unidad();
        entity.setNumeroEconomico(dto.getNumeroEconomico());
        entity.setPlacas(dto.getPlacas());
        entity.setModelo(dto.getModelo());
        entity.setCapacidad(dto.getCapacidad());
        entity.setEstado(dto.getEstado());

        Unidad saved = unidadRepository.save(entity);
        dto.setIdUnidad(saved.getIdUnidad());
        return dto;
    }

    @Override
    public List<UnidadDTO> getAll() {
        List<Unidad> lista = unidadRepository.findAll();
        List<UnidadDTO> resultado = new ArrayList<>();

        for (Unidad entity : lista) {
            UnidadDTO dto = new UnidadDTO();
            dto.setIdUnidad(entity.getIdUnidad());
            dto.setNumeroEconomico(entity.getNumeroEconomico());
            dto.setPlacas(entity.getPlacas());
            dto.setModelo(entity.getModelo());
            dto.setCapacidad(entity.getCapacidad());
            dto.setEstado(entity.getEstado());
            resultado.add(dto);
        }
        return resultado;
    }

    @Override
    public UnidadDTO getById(Integer id) {
        Optional<Unidad> optional = unidadRepository.findById(id);
        if (optional.isEmpty()) return null;

        Unidad entity = optional.get();
        UnidadDTO dto = new UnidadDTO();
        dto.setIdUnidad(entity.getIdUnidad());
        dto.setNumeroEconomico(entity.getNumeroEconomico());
        dto.setPlacas(entity.getPlacas());
        dto.setModelo(entity.getModelo());
        dto.setCapacidad(entity.getCapacidad());
        dto.setEstado(entity.getEstado());
        return dto;
    }

    @Override
    public UnidadDTO update(Integer id, UnidadDTO dto) {
        Optional<Unidad> optional = unidadRepository.findById(id);
        if (optional.isEmpty()) return null;

        Unidad entity = optional.get();
        if (dto.getNumeroEconomico() != null) entity.setNumeroEconomico(dto.getNumeroEconomico());
        if (dto.getPlacas() != null) entity.setPlacas(dto.getPlacas());
        if (dto.getModelo() != null) entity.setModelo(dto.getModelo());
        if (dto.getCapacidad() != 0) entity.setCapacidad(dto.getCapacidad());
        if (dto.getEstado() != null) entity.setEstado(dto.getEstado());

        Unidad updated = unidadRepository.save(entity);
        UnidadDTO resultado = new UnidadDTO();
        resultado.setIdUnidad(updated.getIdUnidad());
        resultado.setNumeroEconomico(updated.getNumeroEconomico());
        resultado.setPlacas(updated.getPlacas());
        resultado.setModelo(updated.getModelo());
        resultado.setCapacidad(updated.getCapacidad());
        resultado.setEstado(updated.getEstado());
        return resultado;
    }

    @Override
    public void delete(Integer id) {
        unidadRepository.deleteById(id);
    }
}