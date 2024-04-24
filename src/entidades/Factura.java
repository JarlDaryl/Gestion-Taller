package entidades;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Esta clase representa una Factura. Contiene información sobre las transacciones comerciales entre la empresa y los clientes.
 */
public class Factura {

    /**
     * Indica el estado de pago de la factura.
     */
    boolean estadoPago;
    /**
     * El importe total de la factura.
     */
    float importe;

    /**
     * El código único que identifica a la factura.
     */
    String codigoFactura;

    /**
     * La fecha y hora en que se emitió la factura.
     */
    LocalDateTime fechaFactura;
    /**
     * La fecha de vencimiento de la factura.
     */
    LocalDateTime fechaVencimiento;

    /**
     * El cliente al que se emite la factura.
     */
    Cliente cliente;
    /**
     * El empleado que emitió la factura.
     */
    Empleado empleado;

    /**
     * Los trabajos realizados que se detallan en la factura.
     */
    List<TrabajoRealizado> trabajosRealizados;


    /**
     * Constructor por defecto de la clase Factura.
     */
    public Factura() {
    }

    /**
     * Constructor de la clase Factura.
     *
     * @param estadoPago         Indica el estado de pago de la factura.
     * @param importe            El importe total de la factura.
     * @param codigoFactura      El código único que identifica a la factura.
     * @param fechaFactura       La fecha y hora en que se emitió la factura.
     * @param fechaVencimiento   La fecha de vencimiento de la factura.
     * @param cliente            El cliente al que se emite la factura.
     * @param empleado           El empleado que emitió la factura.
     * @param trabajosRealizados Los trabajos realizados que se detallan en la factura.
     */
    public Factura(boolean estadoPago, float importe, String codigoFactura, LocalDateTime fechaFactura, LocalDateTime fechaVencimiento, Cliente cliente, Empleado empleado, List<TrabajoRealizado> trabajosRealizados) {
        this.estadoPago = estadoPago;
        this.importe = importe;
        this.codigoFactura = codigoFactura;
        this.fechaFactura = fechaFactura;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.empleado = empleado;
        this.trabajosRealizados = trabajosRealizados;
    }

    /**
     * Indica si la factura está pagada o no.
     *
     * @return true si la factura está pagada, false en caso contrario.
     */
    public boolean isEstadoPago() {
        return estadoPago;
    }

    /**
     * Establece el estado de pago de la factura.
     *
     * @param estadoPago true si la factura está pagada, false en caso contrario.
     */
    public void setEstadoPago(boolean estadoPago) {
        this.estadoPago = estadoPago;
    }

    /**
     * Obtiene el importe total de la factura.
     *
     * @return El importe total de la factura.
     */
    public float getImporte() {
        return importe;
    }

    /**
     * Establece el importe total de la factura.
     *
     * @param importe El importe total de la factura.
     */
    public void setImporte(float importe) {
        this.importe = importe;
    }

    /**
     * Obtiene el código único que identifica a la factura.
     *
     * @return El código único de la factura.
     */
    public String getCodigoFactura() {
        return codigoFactura;
    }

    /**
     * Establece el código único que identifica a la factura.
     *
     * @param codigoFactura El código único de la factura.
     */
    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    /**
     * Obtiene la fecha y hora en que se emitió la factura.
     *
     * @return La fecha y hora de emisión de la factura.
     */
    public LocalDateTime getFechaFactura() {
        return fechaFactura;
    }

    /**
     * Establece la fecha y hora en que se emitió la factura.
     *
     * @param fechaFactura La fecha y hora de emisión de la factura.
     */
    public void setFechaFactura(LocalDateTime fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    /**
     * Obtiene la fecha de vencimiento de la factura.
     *
     * @return La fecha de vencimiento de la factura.
     */
    public LocalDateTime getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Establece la fecha de vencimiento de la factura.
     *
     * @param fechaVencimiento La fecha de vencimiento de la factura.
     */
    public void setFechaVencimiento(LocalDateTime fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * Obtiene el cliente al que se emite la factura.
     *
     * @return El cliente al que se emite la factura.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Establece el cliente al que se emite la factura.
     *
     * @param cliente El cliente al que se emite la factura.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene el empleado que emitió la factura.
     *
     * @return El empleado que emitió la factura.
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * Establece el empleado que emitió la factura.
     *
     * @param empleado El empleado que emitió la factura.
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * Obtiene la lista de trabajos realizados que se detallan en la factura.
     *
     * @return La lista de trabajos realizados.
     */
    public List<TrabajoRealizado> getTrabajosRealizados() {
        return trabajosRealizados;
    }

    /**
     * Establece la lista de trabajos realizados que se detallan en la factura.
     *
     * @param trabajosRealizados La lista de trabajos realizados.
     */
    public void setTrabajosRealizados(List<TrabajoRealizado> trabajosRealizados) {
        this.trabajosRealizados = trabajosRealizados;
    }
}
