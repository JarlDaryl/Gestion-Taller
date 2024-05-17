package entidades;

/**
 * Esta clase representa una Pieza. Contiene información sobre una pieza de repuesto utilizada en el mantenimiento o reparación de vehículos.
 */
public class Pieza {

    /**
     * El código único que identifica a la pieza.
     */
    String codigoDePieza;
    /**
     * La marca de la pieza.
     */
    String marca;
    /**
     * La descripción de la pieza.
     */
    String descripción;
    /**
     * Indica si la pieza tiene garantía del fabricante.
     */
    boolean garantiaFabricante;
    /**
     * Indica si la pieza tiene garantía de montaje.
     */
    boolean garantiaMontaje;

    /**
     * Constructor por defecto de la clase Pieza.
     */
    public Pieza() {
    }

    /**
     * Constructor de la clase Pieza.
     *
     * @param codigoDePieza      El código único que identifica a la pieza.
     * @param marca              La marca de la pieza.
     * @param descripción        La descripción de la pieza.
     * @param garantiaFabricante Indica si la pieza tiene garantía del fabricante.
     * @param garantiaMontaje    Indica si la pieza tiene garantía de montaje.
     */
    public Pieza(String codigoDePieza, String marca, String descripción, boolean garantiaFabricante, boolean garantiaMontaje) {
        this.codigoDePieza = codigoDePieza;
        this.marca = marca;
        this.descripción = descripción;
        this.garantiaFabricante = garantiaFabricante;
        this.garantiaMontaje = garantiaMontaje;
    }

    /**
     * Obtiene el código único que identifica a la pieza.
     *
     * @return El código único de la pieza.
     */
    public String getCodigoDePieza() {
        return codigoDePieza;
    }

    /**
     * Establece el código único que identifica a la pieza.
     *
     * @param codigoDePieza El código único de la pieza.
     */
    public void setCodigoDePieza(String codigoDePieza) {
        this.codigoDePieza = codigoDePieza;
    }

    /**
     * Obtiene la marca de la pieza.
     *
     * @return La marca de la pieza.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca de la pieza.
     *
     * @param marca La marca de la pieza.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene la descripción de la pieza.
     *
     * @return La descripción de la pieza.
     */
    public String getDescripción() {
        return descripción;
    }

    /**
     * Establece la descripción de la pieza.
     *
     * @param descripción La descripción de la pieza.
     */
    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    /**
     * Indica si la pieza tiene garantía del fabricante.
     *
     * @return true si la pieza tiene garantía del fabricante, false en caso contrario.
     */
    public boolean isGarantiaFabricante() {
        return garantiaFabricante;
    }

    /**
     * Establece si la pieza tiene garantía del fabricante.
     *
     * @param garantiaFabricante true si la pieza tiene garantía del fabricante, false en caso contrario.
     */
    public void setGarantiaFabricante(boolean garantiaFabricante) {
        this.garantiaFabricante = garantiaFabricante;
    }

    /**
     * Indica si la pieza tiene garantía de montaje.
     *
     * @return true si la pieza tiene garantía de montaje, false en caso contrario.
     */
    public boolean isGarantiaMontaje() {
        return garantiaMontaje;
    }

    /**
     * Establece si la pieza tiene garantía de montaje.
     *
     * @param garantiaMontaje true si la pieza tiene garantía de montaje, false en caso contrario.
     */
    public void setGarantiaMontaje(boolean garantiaMontaje) {
        this.garantiaMontaje = garantiaMontaje;
    }
}
