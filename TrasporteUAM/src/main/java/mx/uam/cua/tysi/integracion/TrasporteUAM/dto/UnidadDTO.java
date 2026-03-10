package mx.uam.cua.tysi.integracion.TrasporteUAM.dto;

import mx.uam.cua.tysi.integracion.TrasporteUAM.entity.Unidad.EstadoUnidad;

public class UnidadDTO {
    private int idUnidad;
    private String numeroEconomico;
    private String placas;
    private String modelo;
    private int capacidad;
    private EstadoUnidad estado;

    public int getIdUnidad() { return idUnidad; }
    public void setIdUnidad(int idUnidad) { this.idUnidad = idUnidad; }

    public String getNumeroEconomico() { return numeroEconomico; }
    public void setNumeroEconomico(String numeroEconomico) { this.numeroEconomico = numeroEconomico; }

    public String getPlacas() { return placas; }
    public void setPlacas(String placas) { this.placas = placas; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public EstadoUnidad getEstado() { return estado; }
    public void setEstado(EstadoUnidad estado) { this.estado = estado; }
}