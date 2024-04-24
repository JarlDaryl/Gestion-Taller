package entidades;

/**
 * Esta clase representa un servicio ofrecido en el catálogo de servicios.
 * Contiene información sobre la descripción del servicio, su precio por unidad y su precio por hora.
 */
public class Servicio {

    /**
     * La descripción del servicio.
     */
    private String descripcion;
    /**
     * El precio por unidad del servicio.
     */
    private float precioUnidad;
    /**
     * El precio por hora del servicio.
     */
    private float precioHora;

    /**
     * Constructor por defecto de la clase Servicio.
     */
    public Servicio() {
    }

    /**
     * Constructor de la clase Servicio.
     *
     * @param descripcion  La descripción del servicio.
     * @param precioUnidad El precio por unidad del servicio.
     * @param precioHora   El precio por hora del servicio.
     */
    public Servicio(String descripcion, float precioUnidad, float precioHora) {
        this.descripcion = descripcion;
        this.precioUnidad = precioUnidad;
        this.precioHora = precioHora;
    }

    /**
     * Obtiene la descripción del servicio.
     *
     * @return La descripción del servicio.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del servicio.
     *
     * @param descripcion La descripción del servicio.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el precio por unidad del servicio.
     *
     * @return El precio por unidad del servicio.
     */
    public float getPrecioUnidad() {
        return precioUnidad;
    }

    /**
     * Establece el precio por unidad del servicio.
     *
     * @param precioUnidad El precio por unidad del servicio.
     */
    public void setPrecioUnidad(float precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    /**
     * Obtiene el precio por hora del servicio.
     *
     * @return El precio por hora del servicio.
     */
    public float getPrecioHora() {
        return precioHora;
    }

    /**
     * Establece el precio por hora del servicio.
     *
     * @param precioHora El precio por hora del servicio.
     */
    public void setPrecioHora(float precioHora) {
        this.precioHora = precioHora;
    }
}
