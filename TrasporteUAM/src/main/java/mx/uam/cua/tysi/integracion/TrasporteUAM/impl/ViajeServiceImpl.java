package mx.uam.cua.tysi.integracion.TrasporteUAM.impl;


import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.ViajeDTO;
import mx.uam.cua.tysi.integracion.TrasporteUAM.entity.Viaje;
import mx.uam.cua.tysi.integracion.TrasporteUAM.repository.ViajeRepository;
import mx.uam.cua.tysi.integracion.TrasporteUAM.service.ViajeService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ViajeServiceImpl implements ViajeService {

    private final ViajeRepository viajeRepository;

    public ViajeServiceImpl(ViajeRepository viajeRepository) {
        this.viajeRepository = viajeRepository;
    }

    @Override
    public ViajeDTO create(ViajeDTO dto) {
        Viaje entity = new Viaje();
        entity.setIdRuta(dto.getIdRuta());
        entity.setIdUnidad(dto.getIdUnidad());
        entity.setMatriculaOperador(dto.getMatriculaOperador());
        entity.setFecha(dto.getFecha());
        entity.setHorarioSalida(dto.getHorarioSalida());
        entity.setHorarioLlegada(dto.getHorarioLlegada());

        Viaje saved = viajeRepository.save(entity);
        dto.setIdViaje(saved.getIdViaje());
        return dto;
    }

    @Override
    public List<ViajeDTO> getAll() {
        List<Viaje> lista = viajeRepository.findAll();
        List<ViajeDTO> resultado = new ArrayList<>();

        for (Viaje entity : lista) {
            ViajeDTO dto = new ViajeDTO();
            dto.setIdViaje(entity.getIdViaje());
            dto.setIdRuta(entity.getIdRuta());
            dto.setIdUnidad(entity.getIdUnidad());
            dto.setMatriculaOperador(entity.getMatriculaOperador());
            dto.setFecha(entity.getFecha());
            dto.setHorarioSalida(entity.getHorarioSalida());
            dto.setHorarioLlegada(entity.getHorarioLlegada());
            resultado.add(dto);
        }
        return resultado;
    }

    @Override
    public ViajeDTO getById(Integer id) {
        Optional<Viaje> optional = viajeRepository.findById(id);
        if (optional.isEmpty()) return null;

        Viaje entity = optional.get();
        ViajeDTO dto = new ViajeDTO();
        dto.setIdViaje(entity.getIdViaje());
        dto.setIdRuta(entity.getIdRuta());
        dto.setIdUnidad(entity.getIdUnidad());
        dto.setMatriculaOperador(entity.getMatriculaOperador());
        dto.setFecha(entity.getFecha());
        dto.setHorarioSalida(entity.getHorarioSalida());
        dto.setHorarioLlegada(entity.getHorarioLlegada());
        return dto;
    }

    @Override
    public ViajeDTO update(Integer id, ViajeDTO dto) {
        Optional<Viaje> optional = viajeRepository.findById(id);
        if (optional.isEmpty()) return null;

        Viaje entity = optional.get();
        if (dto.getIdRuta() != 0) entity.setIdRuta(dto.getIdRuta());
        if (dto.getIdUnidad() != 0) entity.setIdUnidad(dto.getIdUnidad());
        if (dto.getMatriculaOperador() != null) entity.setMatriculaOperador(dto.getMatriculaOperador());
        if (dto.getFecha() != null) entity.setFecha(dto.getFecha());
        if (dto.getHorarioSalida() != null) entity.setHorarioSalida(dto.getHorarioSalida());
        if (dto.getHorarioLlegada() != null) entity.setHorarioLlegada(dto.getHorarioLlegada());

        Viaje updated = viajeRepository.save(entity);
        ViajeDTO resultado = new ViajeDTO();
        resultado.setIdViaje(updated.getIdViaje());
        resultado.setIdRuta(updated.getIdRuta());
        resultado.setIdUnidad(updated.getIdUnidad());
        resultado.setMatriculaOperador(updated.getMatriculaOperador());
        resultado.setFecha(updated.getFecha());
        resultado.setHorarioSalida(updated.getHorarioSalida());
        resultado.setHorarioLlegada(updated.getHorarioLlegada());
        return resultado;
    }

    @Override
    public void delete(Integer id) {
        viajeRepository.deleteById(id);
    }
}