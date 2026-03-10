package mx.uam.cua.tysi.integracion.TrasporteUAM.dto;


import mx.uam.cua.tysi.integracion.TrasporteUAM.entity.RegistroAbordaje.EstadoAbordaje;

public class RegistroAbordajeDTO {
    private int idRegistro;
    private String matriculaEstudiante;
    private int idViaje;
    private EstadoAbordaje estado;

    public int getIdRegistro() { return idRegistro; }
    public void setIdRegistro(int idRegistro) { this.idRegistro = idRegistro; }

    public String getMatriculaEstudiante() { return matriculaEstudiante; }
    public void setMatriculaEstudiante(String matriculaEstudiante) { this.matriculaEstudiante = matriculaEstudiante; }

    public int getIdViaje() { return idViaje; }
    public void setIdViaje(int idViaje) { this.idViaje = idViaje; }

    public EstadoAbordaje getEstado() { return estado; }
    public void setEstado(EstadoAbordaje estado) { this.estado = estado; }
}