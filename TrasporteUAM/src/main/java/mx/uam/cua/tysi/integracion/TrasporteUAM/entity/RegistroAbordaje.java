package mx.uam.cua.tysi.integracion.TrasporteUAM.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "registro_abordaje")
public class RegistroAbordaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRegistro;

    @Column(length = 20)
    private String matriculaEstudiante;

    private int idViaje;

    @Enumerated(EnumType.STRING)
    private EstadoAbordaje estado;

    public enum EstadoAbordaje { PENDIENTE, ABORDADO, AUSENTE }

    public int getIdRegistro() { return idRegistro; }
    public void setIdRegistro(int idRegistro) { this.idRegistro = idRegistro; }

    public String getMatriculaEstudiante() { return matriculaEstudiante; }
    public void setMatriculaEstudiante(String matriculaEstudiante) { this.matriculaEstudiante = matriculaEstudiante; }

    public int getIdViaje() { return idViaje; }
    public void setIdViaje(int idViaje) { this.idViaje = idViaje; }

    public EstadoAbordaje getEstado() { return estado; }
    public void setEstado(EstadoAbordaje estado) { this.estado = estado; }
}