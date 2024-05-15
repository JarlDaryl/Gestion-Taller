package DATA_FRAMEWORK_EVOLUCION.v04_ALMACEN_ESTATICO;

import Generico.ImpresoraDeDatos;
import entidades.Cliente;
import entidades.Vehiculo;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class EjemploEstatico {


    public static void main(String[] args) {
        ejecutar();
        System.out.println("Hola");
    }


    public static void ejecutar() {

        // Crear un nuevo vehículo
        // Crear nuevos vehículos
        Vehiculo vehiculo1 = null;
        Vehiculo vehiculo2 = null;
        try {
            vehiculo1 = new Vehiculo("ABC123", "BASTIDOR1", "Toyota", "Corolla", "Blanco", LocalDate.parse("2013-0701"), LocalDate.parse("2024-07-01"));

        }
        catch (DateTimeParseException d) {
            System.out.println("HAY UN ERROR DE FORMATO EN LA FECHA");
            System.out.println("Mensaje: " + d.getMessage());
            //System.out.println("StackTrace: " + d.getStackTrace());
            //System.out.println("cause: " + d.getCause());
            //System.out.println("LocalizedMessage: " + d.getLocalizedMessage());
        }

        try {
            vehiculo2= new Vehiculo("XYZ789", "BASTIDOR2", "Honda", "Civic", "Negro", LocalDate.parse("2015-10-15"), LocalDate.parse("2023-1015"));
        }
        catch (DateTimeParseException d) {
            System.out.println("HAY UN ERROR DE FORMATO EN LA FECHA");
            System.out.println("Mensaje: " + d.getMessage());
            //System.out.println("StackTrace: " + d.getStackTrace());
            //System.out.println("cause: " + d.getCause());
            //System.out.println("LocalizedMessage: " + d.getLocalizedMessage());
        }

        Vehiculo vehiculo3 = new Vehiculo("DEF456", "BASTIDOR3", "Ford", "Focus", "Azul", LocalDate.parse("2018-05-20"), LocalDate.parse("2025-05-20"));



        try {
            // Guardar los vehículos en los repositorios
            AlmacenDeDatos.getVehiculoRepository().save(vehiculo1);
            AlmacenDeDatos.getVehiculoRepository().save(vehiculo2);
            AlmacenDeDatos.getVehiculoRepository().save(vehiculo3);
        }
        catch(NullPointerException np)
        {
            System.out.println("NULL POINTER");
            System.out.println(np.getMessage());
            System.out.println(np.getStackTrace());
            System.out.println(np.getCause());
            System.out.println(np.getLocalizedMessage());
        }




        AlmacenDeDatos.getClienteRepository().save(new Cliente());



        // Listar los vehículos de cada repositorio
        System.out.println("Vehículos en el repositorio 1:");
        AlmacenDeDatos.getVehiculoRepository().findAll().forEach(ImpresoraDeDatos::ImprimirInfoVehiculo);
        System.out.println("Vehículos en el repositorio 2:");
        AlmacenDeDatos.getVehiculoRepository().findAll().forEach(ImpresoraDeDatos::ImprimirInfoVehiculo);

    }

}
