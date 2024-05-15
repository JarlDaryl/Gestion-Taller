package Generico;

import entidades.Cliente;
import entidades.Vehiculo;

public class ImpresoraDeDatos {


    public static void ImprimirInfoVehiculo(Vehiculo vehiculo) {
            System.out.println("Matrícula: " + vehiculo.getMatricula());
            System.out.println("Número de bastidor: " + vehiculo.getNumeroBastidor());
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.println("Color: " + vehiculo.getColor());
            System.out.println("Fecha de fabricación: " + vehiculo.getFechaFabricacion());
            System.out.println("Fecha de última ITV: " + vehiculo.getFechaITV());
            System.out.println(); // Salto de línea entre vehículos
    }


    public static void ImprimirInfoCliente(Cliente cliente) {

        System.out.println("Código de Cliente: " + cliente.getCodigoCliente());
        System.out.println("Nombre de Cliente: " + cliente.getNombre());
        System.out.println("Dirección de Cliente: " + cliente.getDireccion());
        System.out.println("DNI de Cliente: " + cliente.getDni());
        System.out.println("Vehículos de Cliente:");
        System.out.println(cliente.getVehiculos().toString());
        /*
        for (Vehiculo e : cliente.getVehiculos()) {
            System.out.println(e.getMarca() + " " + e.getModelo() + " de color " + e.getColor() + " y matrícula: " + e.getMatricula());
        }
        */

    }

}
