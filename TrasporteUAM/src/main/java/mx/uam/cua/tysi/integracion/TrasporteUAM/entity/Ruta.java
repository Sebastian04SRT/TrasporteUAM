package mx.uam.cua.tysi.integracion.TrasporteUAM.entity;



import jakarta.persistence.*;

@Entity
@Table(name = "ruta")
public class Ruta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRuta;

    @Column(nullable = false, length = 100)
    private String nombreRuta;

    @Column(length = 100)
    private String origen;

    @Column(length = 100)
    private String destino;

    public int getIdRuta() { return idRuta; }
    public void setIdRuta(int idRuta) { this.idRuta = idRuta; }

    public String getNombreRuta() { return nombreRuta; }
    public void setNombreRuta(String nombreRuta) { this.nombreRuta = nombreRuta; }

    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }
}