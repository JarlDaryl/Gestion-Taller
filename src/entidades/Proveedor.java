package entidades;

/**
 * Esta clase representa un Proveedor. Contiene información sobre una empresa o persona que suministra productos o servicios a la empresa.
 */
public class Proveedor {

    /**
     * El código único que identifica al proveedor.
     */
    String codigoProveedor;
    /**
     * El nombre del proveedor.
     */
    String nombre;
    /**
     * La dirección del proveedor.
     */
    String direccion;
    /**
     * El número de teléfono del proveedor.
     */
    String telefono;

    /**
     * Constructor por defecto de la clase Proveedor.
     */
    public Proveedor() {
    }

    /**
     * Constructor de la clase Proveedor.
     *
     * @param codigoProveedor El código único que identifica al proveedor.
     * @param nombre          El nombre del proveedor.
     * @param direccion       La dirección del proveedor.
     * @param telefono        El número de teléfono del proveedor.
     */
    public Proveedor(String codigoProveedor, String nombre, String direccion, String telefono) {
        this.codigoProveedor = codigoProveedor;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     * Obtiene el código único que identifica al proveedor.
     *
     * @return El código único del proveedor.
     */
    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    /**
     * Establece el código único que identifica al proveedor.
     *
     * @param codigoProveedor El código único del proveedor.
     */
    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    /**
     * Obtiene el nombre del proveedor.
     *
     * @return El nombre del proveedor.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del proveedor.
     *
     * @param nombre El nombre del proveedor.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la dirección del proveedor.
     *
     * @return La dirección del proveedor.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del proveedor.
     *
     * @param direccion La dirección del proveedor.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el número de teléfono del proveedor.
     *
     * @return El número de teléfono del proveedor.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del proveedor.
     *
     * @param telefono El número de teléfono del proveedor.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
