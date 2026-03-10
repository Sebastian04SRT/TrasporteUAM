package mx.uam.cua.tysi.integracion.TrasporteUAM.dto;


import mx.uam.cua.tysi.integracion.TrasporteUAM.entity.Pago.MetodoPago;
import java.math.BigDecimal;
import java.time.LocalDate;

public class PagoDTO {
    private int idPago;
    private String matriculaEstudiante;
    private BigDecimal monto;
    private LocalDate fechaPago;
    private MetodoPago metodoPago;
    private String periodo;

    public int getIdPago() { return idPago; }
    public void setIdPago(int idPago) { this.idPago = idPago; }

    public String getMatriculaEstudiante() { return matriculaEstudiante; }
    public void setMatriculaEstudiante(String matriculaEstudiante) { this.matriculaEstudiante = matriculaEstudiante; }

    public BigDecimal getMonto() { return monto; }
    public void setMonto(BigDecimal monto) { this.monto = monto; }

    public LocalDate getFechaPago() { return fechaPago; }
    public void setFechaPago(LocalDate fechaPago) { this.fechaPago = fechaPago; }

    public MetodoPago getMetodoPago() { return metodoPago; }
    public void setMetodoPago(MetodoPago metodoPago) { this.metodoPago = metodoPago; }

    public String getPeriodo() { return periodo; }
    public void setPeriodo(String periodo) { this.periodo = periodo; }
}