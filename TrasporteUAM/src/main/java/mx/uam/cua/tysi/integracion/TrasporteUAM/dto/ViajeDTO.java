package mx.uam.cua.tysi.integracion.TrasporteUAM.dto;


import java.time.LocalDate;
import java.time.LocalTime;

public class ViajeDTO {
    private int idViaje;
    private int idRuta;
    private int idUnidad;
    private String matriculaOperador;
    private LocalDate fecha;
    private LocalTime horarioSalida;
    private LocalTime horarioLlegada;

    public int getIdViaje() { return idViaje; }
    public void setIdViaje(int idViaje) { this.idViaje = idViaje; }

    public int getIdRuta() { return idRuta; }
    public void setIdRuta(int idRuta) { this.idRuta = idRuta; }

    public int getIdUnidad() { return idUnidad; }
    public void setIdUnidad(int idUnidad) { this.idUnidad = idUnidad; }

    public String getMatriculaOperador() { return matriculaOperador; }
    public void setMatriculaOperador(String matriculaOperador) { this.matriculaOperador = matriculaOperador; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public LocalTime getHorarioSalida() { return horarioSalida; }
    public void setHorarioSalida(LocalTime horarioSalida) { this.horarioSalida = horarioSalida; }

    public LocalTime getHorarioLlegada() { return horarioLlegada; }
    public void setHorarioLlegada(LocalTime horarioLlegada) { this.horarioLlegada = horarioLlegada; }
}