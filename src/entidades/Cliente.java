package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *  Esta clase representa a un Cliente del taller. Contiene información relacionada con los clientes del taller, quienes traen vehículos para reparar o cambiar piezas.
 */
public class Cliente {

    /**
     * El código único que identifica al cliente.
     */
    String codigoCliente;
    /**
     * El nombre del cliente.
     */
    String nombre;
    /**
     * La dirección del cliente.
     */
    String direccion;
    /**
     * El número de identificación del cliente (por ejemplo, DNI).
     */
    String dni;
    /**
     * La lista de vehículos asociados a este cliente.
     */
    List<Vehiculo> vehiculos;


    /**
     * Constructor por defecto de la clase Cliente.
     */
    public Cliente() {
    }

    /**
     * Constructor de la clase Cliente.
     *
     * @param codigoCliente El código único que identifica al cliente.
     * @param nombre        El nombre del cliente.
     * @param direccion     La dirección del cliente.
     * @param dni           El número de identificación del cliente (por ejemplo, DNI).
     * @param vehiculos     La lista de vehículos asociados a este cliente.
     */
    public Cliente(String codigoCliente, String nombre, String direccion, String dni, List<Vehiculo> vehiculos) {
        this.codigoCliente = codigoCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
        this.vehiculos = vehiculos;
    }

    /**
     * Obtiene el código único que identifica al cliente.
     *
     * @return El código único del cliente.
     */
    public String getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Establece el código único que identifica al cliente.
     *
     * @param codigoCliente El código único del cliente.
     */
    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param nombre El nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la dirección del cliente.
     *
     * @return La dirección del cliente.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del cliente.
     *
     * @param direccion La dirección del cliente.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el número de identificación del cliente (por ejemplo, DNI).
     *
     * @return El número de identificación del cliente.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el número de identificación del cliente (por ejemplo, DNI).
     *
     * @param dni El número de identificación del cliente.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obtiene la lista de vehículos asociados a este cliente.
     *
     * @return La lista de vehículos asociados al cliente.
     */
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     * Establece la lista de vehículos asociados a este cliente.
     *
     * @param vehiculos La lista de vehículos asociados al cliente.
     */
    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
