package entidades;

import java.time.LocalDate;

/**
 * Esta clase representa un vehículo. Contiene información como la matrícula, número de bastidor, marca, modelo, color, fecha de fabricación y fecha de última ITV.
 */
public class Vehiculo {

    /**
     * La matrícula del vehículo.
     */
    String matricula;
    /**
     * El número de bastidor del vehículo.
     */
    String numeroBastidor;
    /**
     * La marca del vehículo.
     */
    String marca;
    /**
     * El modelo del vehículo.
     */
    String modelo;
    /**
     * El color del vehículo.
     */
    String color;
    /**
     * La fecha de fabricación del vehículo.
     */
    LocalDate fechaFabricacion;
    /**
     * La fecha de última ITV del vehículo.
     */
    LocalDate fechaITV;


    /**
     * Constructor por defecto de la clase Vehiculo.
     */
    public Vehiculo() {
    }

    /**
     * Constructor de la clase Vehiculo.
     *
     * @param matricula        La matrícula del vehículo.
     * @param numeroBastidor   El número de bastidor del vehículo.
     * @param marca            La marca del vehículo.
     * @param modelo           El modelo del vehículo.
     * @param color            El color del vehículo.
     * @param fechaFabricacion La fecha de fabricación del vehículo.
     * @param fechaITV         La fecha de última ITV del vehículo.
     */
    public Vehiculo(String matricula, String numeroBastidor, String marca, String modelo, String color, LocalDate fechaFabricacion, LocalDate fechaITV) {
        this.matricula = matricula;
        this.numeroBastidor = numeroBastidor;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.fechaFabricacion = fechaFabricacion;
        this.fechaITV = fechaITV;
    }

    /**
     * Obtiene la matrícula del vehículo.
     *
     * @return La matrícula del vehículo.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Establece la matrícula del vehículo.
     *
     * @param matricula La matrícula del vehículo.
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Obtiene el número de bastidor del vehículo.
     *
     * @return El número de bastidor del vehículo.
     */
    public String getNumeroBastidor() {
        return numeroBastidor;
    }

    /**
     * Establece el número de bastidor del vehículo.
     *
     * @param numeroBastidor El número de bastidor del vehículo.
     */
    public void setNumeroBastidor(String numeroBastidor) {
        this.numeroBastidor = numeroBastidor;
    }

    /**
     * Obtiene la marca del vehículo.
     *
     * @return La marca del vehículo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del vehículo.
     *
     * @param marca La marca del vehículo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el modelo del vehículo.
     *
     * @return El modelo del vehículo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del vehículo.
     *
     * @param modelo El modelo del vehículo.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtiene el color del vehículo.
     *
     * @return El color del vehículo.
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color del vehículo.
     *
     * @param color El color del vehículo.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtiene la fecha de fabricación del vehículo.
     *
     * @return La fecha de fabricación del vehículo.
     */
    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    /**
     * Establece la fecha de fabricación del vehículo.
     *
     * @param fechaFabricacion La fecha de fabricación del vehículo.
     */
    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    /**
     * Obtiene la fecha de última ITV del vehículo.
     *
     * @return La fecha de última ITV del vehículo.
     */
    public LocalDate getFechaITV() {
        return fechaITV;
    }

    /**
     * Establece la fecha de última ITV del vehículo.
     *
     * @param fechaITV La fecha de última ITV del vehículo.
     */
    public void setFechaITV(LocalDate fechaITV) {
        this.fechaITV = fechaITV;
    }
}
