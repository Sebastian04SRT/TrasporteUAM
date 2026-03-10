package mx.uam.cua.tysi.integracion.TrasporteUAM.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "registro_excursion")
public class RegistroExcursion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRegExcursion;

    private int idExcursion;

    @Column(length = 20)
    private String matriculaEstudiante;

    @Enumerated(EnumType.STRING)
    private EstadoRegistro estado;

    public enum EstadoRegistro { INSCRITO, CANCELADO, ASISTIO }

    public int getIdRegExcursion() { return idRegExcursion; }
    public void setIdRegExcursion(int idRegExcursion) { this.idRegExcursion = idRegExcursion; }

    public int getIdExcursion() { return idExcursion; }
    public void setIdExcursion(int idExcursion) { this.idExcursion = idExcursion; }

    public String getMatriculaEstudiante() { return matriculaEstudiante; }
    public void setMatriculaEstudiante(String matriculaEstudiante) { this.matriculaEstudiante = matriculaEstudiante; }

    public EstadoRegistro getEstado() { return estado; }
    public void setEstado(EstadoRegistro estado) { this.estado = estado; }
}