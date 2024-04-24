package entidades;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Esta clase representa un Albarán. Un albarán, también conocido como nota de entrega, es un documento mercantil que acredita la entrega de un pedido. Para el comprador, este documento es fundamental ya que le permite verificar que lo que ha recibido coincide con lo que solicitó y también le facilita la comprobación con la facturación del pedido en el futuro, especialmente si esta factura es emitida posteriormente.
 */
public class Albaran {

    /**
     * El número único que identifica al albarán.
     */
    String numeroAlbaran;
    /**
     * La fecha y hora en que se realizó la entrega del pedido asociado al albarán.
     */
    LocalDateTime fechaEntrega;
    /**
     * Las piezas entregadas que se relacionan con este albarán.
     */
    List<Pieza> piezas;
    /**
     * El proveedor que realizó la entrega.
     */
    Proveedor proveedor;
    /**
     * La factura asociada a este albarán, si es que ya ha sido generada.
     */
    Factura factura;

    /**
     * Constructor por defecto de la clase Albaran.
     */
    public Albaran() {
    }

    /**
     * Constructor de la clase Albaran.
     *
     * @param numeroAlbaran El número único que identifica al albarán.
     * @param fechaEntrega  La fecha y hora en que se realizó la entrega del pedido asociado al albarán.
     * @param piezas        Las piezas entregadas que se relacionan con este albarán.
     * @param proveedor     El proveedor que realizó la entrega.
     * @param factura       La factura asociada a este albarán, si es que ya ha sido generada.
     */
    public Albaran(String numeroAlbaran, LocalDateTime fechaEntrega, List<Pieza> piezas, Proveedor proveedor, Factura factura) {
        this.numeroAlbaran = numeroAlbaran;
        this.fechaEntrega = fechaEntrega;
        this.piezas = piezas;
        this.proveedor = proveedor;
        this.factura = factura;
    }

    /**
     * Obtiene el número único que identifica al albarán.
     *
     * @return El número único del albarán.
     */
    public String getNumeroAlbaran() {
        return numeroAlbaran;
    }

    /**
     * Establece el número único que identifica al albarán.
     *
     * @param numeroAlbaran El número único del albarán.
     */
    public void setNumeroAlbaran(String numeroAlbaran) {
        this.numeroAlbaran = numeroAlbaran;
    }

    /**
     * Obtiene la fecha y hora en que se realizó la entrega del pedido asociado al albarán.
     *
     * @return La fecha y hora de entrega del pedido.
     */
    public LocalDateTime getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Establece la fecha y hora en que se realizó la entrega del pedido asociado al albarán.
     *
     * @param fechaEntrega La fecha y hora de entrega del pedido.
     */
    public void setFechaEntrega(LocalDateTime fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    /**
     * Obtiene la lista de piezas entregadas relacionadas con este albarán.
     *
     * @return La lista de piezas entregadas.
     */
    public List<Pieza> getPiezas() {
        return piezas;
    }

    /**
     * Establece la lista de piezas entregadas relacionadas con este albarán.
     *
     * @param piezas La lista de piezas entregadas.
     */
    public void setPiezas(List<Pieza> piezas) {
        this.piezas = piezas;
    }

    /**
     * Obtiene el proveedor que realizó la entrega.
     *
     * @return El proveedor que realizó la entrega.
     */
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * Establece el proveedor que realizó la entrega.
     *
     * @param proveedor El proveedor que realizó la entrega.
     */
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * Obtiene la factura asociada a este albarán, si es que ya ha sido generada.
     *
     * @return La factura asociada al albarán.
     */
    public Factura getFactura() {
        return factura;
    }

    /**
     * Establece la factura asociada a este albarán.
     *
     * @param factura La factura asociada al albarán.
     */
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
}
