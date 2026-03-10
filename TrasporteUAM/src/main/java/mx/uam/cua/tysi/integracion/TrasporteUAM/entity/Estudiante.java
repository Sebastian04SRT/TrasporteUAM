package mx.uam.cua.tysi.integracion.TrasporteUAM.entity;



import jakarta.persistence.*;

@Entity
@Table(name = "estudiante")
public class Estudiante {

    @Id
    @Column(length = 20)
    private String matricula;

    @Column(nullable = false)
    private int idUniversidad;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(length = 100)
    private String carrera;

    private int semestre;

    @Column(length = 20)
    private String telefono;

    @Column(length = 255)
    private String direccion;

    @Enumerated(EnumType.STRING)
    private EstatusEstudiante estatus;

    public enum EstatusEstudiante { ACTIVO, INACTIVO, SUSPENDIDO }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public int getIdUniversidad() { return idUniversidad; }
    public void setIdUniversidad(int idUniversidad) { this.idUniversidad = idUniversidad; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public int getSemestre() { return semestre; }
    public void setSemestre(int semestre) { this.semestre = semestre; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public EstatusEstudiante getEstatus() { return estatus; }
    public void setEstatus(EstatusEstudiante estatus) { this.estatus = estatus; }
}