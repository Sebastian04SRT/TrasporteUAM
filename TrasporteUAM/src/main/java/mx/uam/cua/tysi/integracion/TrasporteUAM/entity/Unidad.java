package mx.uam.cua.tysi.integracion.TrasporteUAM.entity;



import jakarta.persistence.*;

@Entity
@Table(name = "unidad")
public class Unidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUnidad;

    @Column(nullable = false, length = 20)
    private String numeroEconomico;

    @Column(length = 15)
    private String placas;

    @Column(length = 50)
    private String modelo;

    private int capacidad;

    @Enumerated(EnumType.STRING)
    private EstadoUnidad estado;

    public enum EstadoUnidad { ACTIVA, INACTIVA, MANTENIMIENTO }

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