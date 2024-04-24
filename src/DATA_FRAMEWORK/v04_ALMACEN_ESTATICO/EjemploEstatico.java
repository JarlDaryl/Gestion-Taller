package DATA_FRAMEWORK.v04_ALMACEN_ESTATICO;

import Generico.ImpresoraDeDatos;
import entidades.Vehiculo;

import java.time.LocalDate;

public class EjemploEstatico {

    public static void main(String[] args) {
        ejecutar();
    }


    public static void ejecutar() {

        // Crear un nuevo vehículo
        // Crear nuevos vehículos
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "BASTIDOR1", "Toyota", "Corolla", "Blanco", LocalDate.parse("2013-07-01"), LocalDate.parse("2024-07-01"));
        Vehiculo vehiculo2 = new Vehiculo("XYZ789", "BASTIDOR2", "Honda", "Civic", "Negro", LocalDate.parse("2015-10-15"), LocalDate.parse("2023-10-15"));
        Vehiculo vehiculo3 = new Vehiculo("DEF456", "BASTIDOR3", "Ford", "Focus", "Azul", LocalDate.parse("2018-05-20"), LocalDate.parse("2025-05-20"));

        // Guardar los vehículos en los repositorios
        AlmacenDeDatos.getVehiculoRepository().save(vehiculo1);
        AlmacenDeDatos.getVehiculoRepository().save(vehiculo2);
        AlmacenDeDatos.getVehiculoRepository().save(vehiculo3);

        // Listar los vehículos de cada repositorio
        System.out.println("Vehículos en el repositorio 1:");
        AlmacenDeDatos.getVehiculoRepository().findAll().forEach(ImpresoraDeDatos::ImprimirInfoVehiculo);
        System.out.println("Vehículos en el repositorio 2:");
        AlmacenDeDatos.getVehiculoRepository().findAll().forEach(ImpresoraDeDatos::ImprimirInfoVehiculo);

    }

}
