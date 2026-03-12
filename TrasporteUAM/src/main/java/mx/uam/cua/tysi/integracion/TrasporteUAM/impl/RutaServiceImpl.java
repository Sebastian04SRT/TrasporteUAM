package mx.uam.cua.tysi.integracion.TrasporteUAM.impl;


import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.RutaDTO;
import mx.uam.cua.tysi.integracion.TrasporteUAM.entity.Ruta;
import mx.uam.cua.tysi.integracion.TrasporteUAM.repository.RutaRepository;
import mx.uam.cua.tysi.integracion.TrasporteUAM.service.RutaService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RutaServiceImpl implements RutaService {

    private final RutaRepository rutaRepository;

    public RutaServiceImpl(RutaRepository rutaRepository) {
        this.rutaRepository = rutaRepository;
    }

    @Override
    public RutaDTO create(RutaDTO dto) {
        Ruta entity = new Ruta();
        entity.setNombreRuta(dto.getNombreRuta());
        entity.setOrigen(dto.getOrigen());
        entity.setDestino(dto.getDestino());

        Ruta saved = rutaRepository.save(entity);
        dto.setIdRuta(saved.getIdRuta());
        return dto;
    }

    @Override
    public List<RutaDTO> getAll() {
        List<Ruta> lista = rutaRepository.findAll();
        List<RutaDTO> resultado = new ArrayList<>();

        for (Ruta entity : lista) {
            RutaDTO dto = new RutaDTO();
            dto.setIdRuta(entity.getIdRuta());
            dto.setNombreRuta(entity.getNombreRuta());
            dto.setOrigen(entity.getOrigen());
            dto.setDestino(entity.getDestino());
            resultado.add(dto);
        }
        return resultado;
    }

    @Override
    public RutaDTO getById(Integer id) {
        Optional<Ruta> optional = rutaRepository.findById(id);
        if (optional.isEmpty()) return null;

        Ruta entity = optional.get();
        RutaDTO dto = new RutaDTO();
        dto.setIdRuta(entity.getIdRuta());
        dto.setNombreRuta(entity.getNombreRuta());
        dto.setOrigen(entity.getOrigen());
        dto.setDestino(entity.getDestino());
        return dto;
    }

    @Override
    public RutaDTO update(Integer id, RutaDTO dto) {
        Optional<Ruta> optional = rutaRepository.findById(id);
        if (optional.isEmpty()) return null;

        Ruta entity = optional.get();
        if (dto.getNombreRuta() != null) entity.setNombreRuta(dto.getNombreRuta());
        if (dto.getOrigen() != null) entity.setOrigen(dto.getOrigen());
        if (dto.getDestino() != null) entity.setDestino(dto.getDestino());

        Ruta updated = rutaRepository.save(entity);
        RutaDTO resultado = new RutaDTO();
        resultado.setIdRuta(updated.getIdRuta());
        resultado.setNombreRuta(updated.getNombreRuta());
        resultado.setOrigen(updated.getOrigen());
        resultado.setDestino(updated.getDestino());
        return resultado;
    }

    @Override
    public void delete(Integer id) {
        rutaRepository.deleteById(id);
    }
}