package mx.uam.cua.tysi.integracion.TrasporteUAM.entity;



import jakarta.persistence.*;

@Entity
@Table(name = "universidad")
public class Universidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUniversidad;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(length = 255)
    private String direccion;

    @Column(length = 20)
    private String telefono;

    public int getIdUniversidad() { return idUniversidad; }
    public void setIdUniversidad(int idUniversidad) { this.idUniversidad = idUniversidad; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}