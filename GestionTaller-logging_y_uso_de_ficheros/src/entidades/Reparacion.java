package entidades;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Esta clase representa una reparación realizada a un vehículo. Contiene información sobre las piezas instaladas, el trabajo realizado y la garantía de la reparación.
 */
public class Reparacion {


    /**
     * El vehículo al que se realizó la reparación.
     */
    private Vehiculo vehiculo;
    /**
     * La lista de instalaciones de piezas realizadas durante la reparación.
     */
    private List<InstalacionDePieza> instalacionDePiezas;
    /**
     * La lista de trabajos realizados durante la reparación.
     */
    private List<TrabajoRealizado> manosDeObra;
    /**
     * Descripción detallada de la reparación realizada.
     */
    private String descripción;
    /**
     * La fecha en que se realizó la reparación.
     */
    private LocalDateTime fecha;
    /**
     * La fecha de vencimiento de la garantía de la reparación.
     */
    private LocalDateTime fechaGarantia;


    /**
     * Constructor por defecto de la clase Reparacion.
     */
    public Reparacion() {
    }

    /**
     * Constructor de la clase Reparacion.
     *
     * @param vehiculo            El vehículo al que se realizó la reparación.
     * @param instalacionDePiezas La lista de instalaciones de piezas realizadas durante la reparación.
     * @param manosDeObra         La lista de trabajos realizados durante la reparación.
     * @param descripción         Descripción detallada de la reparación realizada.
     * @param fecha               La fecha en que se realizó la reparación.
     * @param fechaGarantia       La fecha de vencimiento de la garantía de la reparación.
     */
    public Reparacion(Vehiculo vehiculo, List<InstalacionDePieza> instalacionDePiezas, List<TrabajoRealizado> manosDeObra, String descripción, LocalDateTime fecha, LocalDateTime fechaGarantia) {
        this.vehiculo = vehiculo;
        this.instalacionDePiezas = instalacionDePiezas;
        this.manosDeObra = manosDeObra;
        this.descripción = descripción;
        this.fecha = fecha;
        this.fechaGarantia = fechaGarantia;
    }

    /**
     * Obtiene el vehículo al que se realizó la reparación.
     *
     * @return El vehículo de la reparación.
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Establece el vehículo al que se realizó la reparación.
     *
     * @param vehiculo El vehículo de la reparación.
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Obtiene la lista de instalaciones de piezas realizadas durante la reparación.
     *
     * @return La lista de instalaciones de piezas.
     */
    public List<InstalacionDePieza> getInstalacionDePiezas() {
        return instalacionDePiezas;
    }

    /**
     * Establece la lista de instalaciones de piezas realizadas durante la reparación.
     *
     * @param instalacionDePiezas La lista de instalaciones de piezas.
     */
    public void setInstalacionDePiezas(List<InstalacionDePieza> instalacionDePiezas) {
        this.instalacionDePiezas = instalacionDePiezas;
    }

    /**
     * Obtiene la lista de trabajos realizados durante la reparación.
     *
     * @return La lista de trabajos realizados.
     */
    public List<TrabajoRealizado> getManosDeObra() {
        return manosDeObra;
    }

    /**
     * Establece la lista de trabajos realizados durante la reparación.
     *
     * @param manosDeObra La lista de trabajos realizados.
     */
    public void setManosDeObra(List<TrabajoRealizado> manosDeObra) {
        this.manosDeObra = manosDeObra;
    }

    /**
     * Obtiene la descripción detallada de la reparación realizada.
     *
     * @return La descripción de la reparación.
     */
    public String getDescripción() {
        return descripción;
    }

    /**
     * Establece la descripción detallada de la reparación realizada.
     *
     * @param descripción La descripción de la reparación.
     */
    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    /**
     * Obtiene la fecha en que se realizó la reparación.
     *
     * @return La fecha de la reparación.
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha en que se realizó la reparación.
     *
     * @param fecha La fecha de la reparación.
     */
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene la fecha de vencimiento de la garantía de la reparación.
     *
     * @return La fecha de vencimiento de la garantía.
     */
    public LocalDateTime getFechaGarantia() {
        return fechaGarantia;
    }

    /**
     * Establece la fecha de vencimiento de la garantía de la reparación.
     *
     * @param fechaGarantia La fecha de vencimiento de la garantía.
     */
    public void setFechaGarantia(LocalDateTime fechaGarantia) {
        this.fechaGarantia = fechaGarantia;
    }
}
