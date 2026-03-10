package mx.uam.cua.tysi.integracion.TrasporteUAM.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "operador")
public class Operador {

    @Id
    @Column(length = 30)
    private String matricula;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(length = 20)
    private String telefono;

    @Enumerated(EnumType.STRING)
    private EstadoOperador estado;

    public enum EstadoOperador { ACTIVO, INACTIVO, SUSPENDIDO }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public EstadoOperador getEstado() { return estado; }
    public void setEstado(EstadoOperador estado) { this.estado = estado; }
}