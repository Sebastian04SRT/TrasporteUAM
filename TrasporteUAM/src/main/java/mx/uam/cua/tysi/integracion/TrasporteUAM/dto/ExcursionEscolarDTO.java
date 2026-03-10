package mx.uam.cua.tysi.integracion.TrasporteUAM.dto;


import mx.uam.cua.tysi.integracion.TrasporteUAM.entity.ExcursionEscolar.EstadoExcursion;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class ExcursionEscolarDTO {
    private int idExcursion;
    private int idUniversidad;
    private int idUnidad;
    private String matriculaOperador;
    private String nombre;
    private String destino;
    private LocalDate fecha;
    private LocalTime horaSalida;
    private LocalTime horaRegreso;
    private BigDecimal costo;
    private int cupoMaximo;
    private EstadoExcursion estado;

    public int getIdExcursion() { return idExcursion; }
    public void setIdExcursion(int idExcursion) { this.idExcursion = idExcursion; }

    public int getIdUniversidad() { return idUniversidad; }
    public void setIdUniversidad(int idUniversidad) { this.idUniversidad = idUniversidad; }

    public int getIdUnidad() { return idUnidad; }
    public void setIdUnidad(int idUnidad) { this.idUnidad = idUnidad; }

    public String getMatriculaOperador() { return matriculaOperador; }
    public void setMatriculaOperador(String matriculaOperador) { this.matriculaOperador = matriculaOperador; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public LocalTime getHoraSalida() { return horaSalida; }
    public void setHoraSalida(LocalTime horaSalida) { this.horaSalida = horaSalida; }

    public LocalTime getHoraRegreso() { return horaRegreso; }
    public void setHoraRegreso(LocalTime horaRegreso) { this.horaRegreso = horaRegreso; }

    public BigDecimal getCosto() { return costo; }
    public void setCosto(BigDecimal costo) { this.costo = costo; }

    public int getCupoMaximo() { return cupoMaximo; }
    public void setCupoMaximo(int cupoMaximo) { this.cupoMaximo = cupoMaximo; }

    public EstadoExcursion getEstado() { return estado; }
    public void setEstado(EstadoExcursion estado) { this.estado = estado; }
}