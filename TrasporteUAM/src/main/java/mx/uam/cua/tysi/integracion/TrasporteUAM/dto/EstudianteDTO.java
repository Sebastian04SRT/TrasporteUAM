package mx.uam.cua.tysi.integracion.TrasporteUAM.dto;



import mx.uam.cua.tysi.integracion.TrasporteUAM.entity.Estudiante.EstatusEstudiante;

public class EstudianteDTO {
    private String matricula;
    private int idUniversidad;
    private String nombre;
    private String carrera;
    private int semestre;
    private String telefono;
    private String direccion;
    private EstatusEstudiante estatus;

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