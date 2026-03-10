package mx.uam.cua.tysi.integracion.TrasporteUAM.dto;

import mx.uam.cua.tysi.integracion.TrasporteUAM.entity.Operador.EstadoOperador;

public class OperadorDTO {
    private String matricula;
    private String nombre;
    private String telefono;
    private EstadoOperador estado;

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public EstadoOperador getEstado() { return estado; }
    public void setEstado(EstadoOperador estado) { this.estado = estado; }
}
