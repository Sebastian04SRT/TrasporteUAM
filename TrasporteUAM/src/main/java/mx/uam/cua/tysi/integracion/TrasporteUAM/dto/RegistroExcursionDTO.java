package mx.uam.cua.tysi.integracion.TrasporteUAM.dto;


import mx.uam.cua.tysi.integracion.TrasporteUAM.entity.RegistroExcursion.EstadoRegistro;

public class RegistroExcursionDTO {
    private int idRegExcursion;
    private int idExcursion;
    private String matriculaEstudiante;
    private EstadoRegistro estado;

    public int getIdRegExcursion() { return idRegExcursion; }
    public void setIdRegExcursion(int idRegExcursion) { this.idRegExcursion = idRegExcursion; }

    public int getIdExcursion() { return idExcursion; }
    public void setIdExcursion(int idExcursion) { this.idExcursion = idExcursion; }

    public String getMatriculaEstudiante() { return matriculaEstudiante; }
    public void setMatriculaEstudiante(String matriculaEstudiante) { this.matriculaEstudiante = matriculaEstudiante; }

    public EstadoRegistro getEstado() { return estado; }
    public void setEstado(EstadoRegistro estado) { this.estado = estado; }
}