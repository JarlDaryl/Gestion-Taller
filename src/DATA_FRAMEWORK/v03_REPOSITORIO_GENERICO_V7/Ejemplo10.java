package DATA_FRAMEWORK.v03_REPOSITORIO_GENERICO_V7;

import DATA_FRAMEWORK.v03_REPOSITORIO_GENERICO_V1.VehiculoRepository;
import Generico.ImpresoraDeDatos;
import entidades.Vehiculo;

import java.time.LocalDate;

public class Ejemplo10 {


    public static void main(String[] args) {
        ejecutar();
    }


    public static void ejecutar() {

        VehiculoRepository vehiculoRepository1 = new VehiculoRepository(Vehiculo::getMatricula);
        VehiculoRepository vehiculoRepository2 = new VehiculoRepository(Vehiculo::getMatricula);

        // Crear nuevos vehículos
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "BASTIDOR1", "Toyota", "Corolla", "Blanco", LocalDate.parse("2013-07-01"), LocalDate.parse("2024-07-01"));
        Vehiculo vehiculo2 = new Vehiculo("XYZ789", "BASTIDOR2", "Honda", "Civic", "Negro", LocalDate.parse("2015-10-15"), LocalDate.parse("2023-10-15"));
        Vehiculo vehiculo3 = new Vehiculo("DEF456", "BASTIDOR3", "Ford", "Focus", "Azul", LocalDate.parse("2018-05-20"), LocalDate.parse("2025-05-20"));

        // Guardar los vehículos en los repositorios
        vehiculoRepository1.save(vehiculo1);
        vehiculoRepository2.save(vehiculo2);
        vehiculoRepository1.save(vehiculo3);

                // Listar los vehículos de cada repositorio
        System.out.println("Vehículos en el repositorio 1:");
        vehiculoRepository1.findAll().forEach(ImpresoraDeDatos::ImprimirInfoVehiculo);
        System.out.println("Vehículos en el repositorio 2:");
        vehiculoRepository2.findAll().forEach(ImpresoraDeDatos::ImprimirInfoVehiculo);
    }

}
