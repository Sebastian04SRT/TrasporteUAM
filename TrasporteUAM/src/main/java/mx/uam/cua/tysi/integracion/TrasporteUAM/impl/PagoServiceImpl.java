package mx.uam.cua.tysi.integracion.TrasporteUAM.impl;

import mx.uam.cua.tysi.integracion.TrasporteUAM.dto.PagoDTO;
import mx.uam.cua.tysi.integracion.TrasporteUAM.entity.Pago;
import mx.uam.cua.tysi.integracion.TrasporteUAM.repository.PagoRepository;
import mx.uam.cua.tysi.integracion.TrasporteUAM.service.PagoService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PagoServiceImpl implements PagoService {

    private final PagoRepository pagoRepository;

    public PagoServiceImpl(PagoRepository pagoRepository) {
        this.pagoRepository = pagoRepository;
    }

    @Override
    public PagoDTO create(PagoDTO dto) {
        Pago entity = new Pago();
        entity.setMatriculaEstudiante(dto.getMatriculaEstudiante());
        entity.setMonto(dto.getMonto());
        entity.setFechaPago(dto.getFechaPago());
        entity.setMetodoPago(dto.getMetodoPago());
        entity.setPeriodo(dto.getPeriodo());

        Pago saved = pagoRepository.save(entity);
        dto.setIdPago(saved.getIdPago());
        return dto;
    }

    @Override
    public List<PagoDTO> getAll() {
        List<Pago> lista = pagoRepository.findAll();
        List<PagoDTO> resultado = new ArrayList<>();

        for (Pago entity : lista) {
            PagoDTO dto = new PagoDTO();
            dto.setIdPago(entity.getIdPago());
            dto.setMatriculaEstudiante(entity.getMatriculaEstudiante());
            dto.setMonto(entity.getMonto());
            dto.setFechaPago(entity.getFechaPago());
            dto.setMetodoPago(entity.getMetodoPago());
            dto.setPeriodo(entity.getPeriodo());
            resultado.add(dto);
        }
        return resultado;
    }

    @Override
    public PagoDTO getById(Integer id) {
        Optional<Pago> optional = pagoRepository.findById(id);
        if (optional.isEmpty()) return null;

        Pago entity = optional.get();
        PagoDTO dto = new PagoDTO();
        dto.setIdPago(entity.getIdPago());
        dto.setMatriculaEstudiante(entity.getMatriculaEstudiante());
        dto.setMonto(entity.getMonto());
        dto.setFechaPago(entity.getFechaPago());
        dto.setMetodoPago(entity.getMetodoPago());
        dto.setPeriodo(entity.getPeriodo());
        return dto;
    }

    @Override
    public PagoDTO update(Integer id, PagoDTO dto) {
        Optional<Pago> optional = pagoRepository.findById(id);
        if (optional.isEmpty()) return null;

        Pago entity = optional.get();
        if (dto.getMatriculaEstudiante() != null) entity.setMatriculaEstudiante(dto.getMatriculaEstudiante());
        if (dto.getMonto() != null) entity.setMonto(dto.getMonto());
        if (dto.getFechaPago() != null) entity.setFechaPago(dto.getFechaPago());
        if (dto.getMetodoPago() != null) entity.setMetodoPago(dto.getMetodoPago());
        if (dto.getPeriodo() != null) entity.setPeriodo(dto.getPeriodo());

        Pago updated = pagoRepository.save(entity);
        PagoDTO resultado = new PagoDTO();
        resultado.setIdPago(updated.getIdPago());
        resultado.setMatriculaEstudiante(updated.getMatriculaEstudiante());
        resultado.setMonto(updated.getMonto());
        resultado.setFechaPago(updated.getFechaPago());
        resultado.setMetodoPago(updated.getMetodoPago());
        resultado.setPeriodo(updated.getPeriodo());
        return resultado;
    }

    @Override
    public void delete(Integer id) {
        pagoRepository.deleteById(id);
    }
}