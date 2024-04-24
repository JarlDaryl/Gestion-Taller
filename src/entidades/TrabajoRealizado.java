package entidades;

import java.time.LocalDateTime;

/**
 * Esta clase representa un trabajo realizado en el taller. Contiene información sobre el servicio realizado,
 * las fechas de inicio y fin, las fechas de garantía para revisión, montaje y pieza,
 * y el empleado que realizó el trabajo.
 */
public class TrabajoRealizado {

    /**
     * El servicio realizado.
     */
    Servicio servicio;
    /**
     * La fecha de inicio del trabajo.
     */
    LocalDateTime fechaInicio;
    /**
     * La fecha de fin del trabajo.
     */
    LocalDateTime fechaFin;
    /**
     * La fecha de garantía para revisión.
     */
    LocalDateTime fechaGarantiaDeRevision;
    /**
     * La fecha de garantía para montaje.
     */
    LocalDateTime fechaGarantiaMontaje;
    /**
     * La fecha de garantía para la pieza.
     */
    LocalDateTime fechaGarantiaPieza;
    /**
     * El empleado que realizó el trabajo.
     */
    Empleado empleado;


    /**
     * Constructor por defecto de la clase TrabajoRealizado.
     */
    public TrabajoRealizado() {
    }

    /**
     * Constructor de la clase TrabajoRealizado.
     *
     * @param servicio                El servicio realizado.
     * @param fechaInicio             La fecha de inicio del trabajo.
     * @param fechaFin                La fecha de fin del trabajo.
     * @param fechaGarantiaDeRevision La fecha de garantía para revisión.
     * @param fechaGarantiaMontaje    La fecha de garantía para montaje.
     * @param fechaGarantiaPieza      La fecha de garantía para la pieza.
     * @param empleado                El empleado que realizó el trabajo.
     */
    public TrabajoRealizado(Servicio servicio, LocalDateTime fechaInicio, LocalDateTime fechaFin, LocalDateTime fechaGarantiaDeRevision, LocalDateTime fechaGarantiaMontaje, LocalDateTime fechaGarantiaPieza, Empleado empleado) {
        this.servicio = servicio;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaGarantiaDeRevision = fechaGarantiaDeRevision;
        this.fechaGarantiaMontaje = fechaGarantiaMontaje;
        this.fechaGarantiaPieza = fechaGarantiaPieza;
        this.empleado = empleado;
    }

    /**
     * Obtiene el servicio realizado.
     *
     * @return El servicio realizado.
     */
    public Servicio getServicio() {
        return servicio;
    }

    /**
     * Establece el servicio realizado.
     *
     * @param servicio El servicio realizado.
     */
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    /**
     * Obtiene la fecha de inicio del trabajo.
     *
     * @return La fecha de inicio del trabajo.
     */
    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Establece la fecha de inicio del trabajo.
     *
     * @param fechaInicio La fecha de inicio del trabajo.
     */
    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * Obtiene la fecha de fin del trabajo.
     *
     * @return La fecha de fin del trabajo.
     */
    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    /**
     * Establece la fecha de fin del trabajo.
     *
     * @param fechaFin La fecha de fin del trabajo.
     */
    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * Obtiene la fecha de garantía para revisión.
     *
     * @return La fecha de garantía para revisión.
     */
    public LocalDateTime getFechaGarantiaDeRevision() {
        return fechaGarantiaDeRevision;
    }

    /**
     * Establece la fecha de garantía para revisión.
     *
     * @param fechaGarantiaDeRevision La fecha de garantía para revisión.
     */
    public void setFechaGarantiaDeRevision(LocalDateTime fechaGarantiaDeRevision) {
        this.fechaGarantiaDeRevision = fechaGarantiaDeRevision;
    }

    /**
     * Obtiene la fecha de garantía para montaje.
     *
     * @return La fecha de garantía para montaje.
     */
    public LocalDateTime getFechaGarantiaMontaje() {
        return fechaGarantiaMontaje;
    }

    /**
     * Establece la fecha de garantía para montaje.
     *
     * @param fechaGarantiaMontaje La fecha de garantía para montaje.
     */
    public void setFechaGarantiaMontaje(LocalDateTime fechaGarantiaMontaje) {
        this.fechaGarantiaMontaje = fechaGarantiaMontaje;
    }

    /**
     * Obtiene la fecha de garantía para la pieza.
     *
     * @return La fecha de garantía para la pieza.
     */
    public LocalDateTime getFechaGarantiaPieza() {
        return fechaGarantiaPieza;
    }

    /**
     * Establece la fecha de garantía para la pieza.
     *
     * @param fechaGarantiaPieza La fecha de garantía para la pieza.
     */
    public void setFechaGarantiaPieza(LocalDateTime fechaGarantiaPieza) {
        this.fechaGarantiaPieza = fechaGarantiaPieza;
    }

    /**
     * Obtiene el empleado que realizó el trabajo.
     *
     * @return El empleado que realizó el trabajo.
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * Establece el empleado que realizó el trabajo.
     *
     * @param empleado El empleado que realizó el trabajo.
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
