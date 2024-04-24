package entidades;

import java.util.List;

/**
 * Esta clase representa a un Empleado. Contiene información relacionada con los empleados de la empresa.
 */
public class Empleado extends Usuario {

    /**
     * El código único que identifica al empleado.
     */
    String codigoEmpleado;
    /**
     * El nombre del empleado.
     */
    String nombre;
    /**
     * La dirección del empleado.
     */
    String direccion;
    /**
     * El número de identificación del empleado (por ejemplo, DNI).
     */
    String dni;
    /**
     * La categoría o cargo del empleado en la empresa.
     */
    String categoria;


    /**
     * Constructor por defecto de la clase Empleado.
     */
    public Empleado() {

    }

    /**
     * Constructor de la clase Empleado.
     *
     * @param codigoEmpleado El código único que identifica al empleado.
     * @param nombre         El nombre del empleado.
     * @param direccion      La dirección del empleado.
     * @param dni            El número de identificación del empleado (por ejemplo, DNI).
     * @param categoria      La categoría o cargo del empleado en la empresa.
     */
    public Empleado(String codigoEmpleado, String nombre, String direccion, String dni, String categoria) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
        this.categoria = categoria;
    }

    /**
     * Obtiene el código único que identifica al empleado.
     *
     * @return El código único del empleado.
     */
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    /**
     * Establece el código único que identifica al empleado.
     *
     * @param codigoEmpleado El código único del empleado.
     */
    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    /**
     * Obtiene el nombre del empleado.
     *
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     *
     * @param nombre El nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la dirección del empleado.
     *
     * @return La dirección del empleado.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del empleado.
     *
     * @param direccion La dirección del empleado.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el número de identificación del empleado (por ejemplo, DNI).
     *
     * @return El número de identificación del empleado.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el número de identificación del empleado (por ejemplo, DNI).
     *
     * @param dni El número de identificación del empleado.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obtiene la categoría o cargo del empleado en la empresa.
     *
     * @return La categoría o cargo del empleado.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Establece la categoría o cargo del empleado en la empresa.
     *
     * @param categoria La categoría o cargo del empleado.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
