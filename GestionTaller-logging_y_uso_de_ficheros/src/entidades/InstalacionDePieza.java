package entidades;

import java.time.LocalDateTime;

/**
 * Esta clase representa una Instalación de Pieza. Contiene información sobre la instalación de una pieza en un determinado momento.
 */
public class InstalacionDePieza {

    /**
     * La pieza que ha sido instalada.
     */
    Pieza pieza;
    /**
     * La fecha y hora en que se realizó la instalación.
     */
    LocalDateTime fechaInstalacion;
    /**
     * La fecha de vencimiento de la garantía asociada a la instalación de la pieza.
     */
    LocalDateTime fechaGarantia;

    /**
     * Constructor por defecto de la clase InstalacionDePieza.
     */
    public InstalacionDePieza() {
    }

    /**
     * Constructor de la clase InstalacionDePieza.
     *
     * @param pieza            La pieza que ha sido instalada.
     * @param fechaInstalacion La fecha y hora en que se realizó la instalación.
     * @param fechaGarantia    La fecha de vencimiento de la garantía asociada a la instalación de la pieza.
     */
    public InstalacionDePieza(Pieza pieza, LocalDateTime fechaInstalacion, LocalDateTime fechaGarantia) {
        this.pieza = pieza;
        this.fechaInstalacion = fechaInstalacion;
        this.fechaGarantia = fechaGarantia;
    }

    /**
     * Obtiene la pieza que ha sido instalada.
     *
     * @return La pieza instalada.
     */
    public Pieza getPieza() {
        return pieza;
    }

    /**
     * Establece la pieza que ha sido instalada.
     *
     * @param pieza La pieza instalada.
     */
    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    /**
     * Obtiene la fecha y hora en que se realizó la instalación.
     *
     * @return La fecha y hora de instalación.
     */
    public LocalDateTime getFechaInstalacion() {
        return fechaInstalacion;
    }

    /**
     * Establece la fecha y hora en que se realizó la instalación.
     *
     * @param fechaInstalacion La fecha y hora de instalación.
     */
    public void setFechaInstalacion(LocalDateTime fechaInstalacion) {
        this.fechaInstalacion = fechaInstalacion;
    }

    /**
     * Obtiene la fecha de vencimiento de la garantía asociada a la instalación de la pieza.
     *
     * @return La fecha de vencimiento de la garantía.
     */
    public LocalDateTime getFechaGarantia() {
        return fechaGarantia;
    }

    /**
     * Establece la fecha de vencimiento de la garantía asociada a la instalación de la pieza.
     *
     * @param fechaGarantia La fecha de vencimiento de la garantía.
     */
    public void setFechaGarantia(LocalDateTime fechaGarantia) {
        this.fechaGarantia = fechaGarantia;
    }
}
