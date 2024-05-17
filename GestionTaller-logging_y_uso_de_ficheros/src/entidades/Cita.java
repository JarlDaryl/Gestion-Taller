package entidades;

import java.time.LocalDateTime;

/**
 * Esta clase representa una Cita en el taller. Contiene información relacionada con las citas programadas entre un empleado, un cliente y un vehículo.
 */
public class Cita {

    /**
     * El empleado encargado de la cita.
     */
    private Empleado empleado;

    /**
     * El cliente que ha programado la cita.
     */
    private Cliente cliente;

    /**
     * La fecha y hora de la cita.
     */
    private LocalDateTime fechaCita;

    /**
     * El vehículo asociado a la cita.
     */
    private Vehiculo vehiculo;

}
