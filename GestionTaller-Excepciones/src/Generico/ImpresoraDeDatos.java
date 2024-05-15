package Generico;

import entidades.Cliente;
import entidades.Vehiculo;

import java.util.Optional;

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


    public static void ImprimirInfoCliente(Optional<Cliente> cliente) {

        if(cliente.isPresent())
        {
                System.out.println("Código de Cliente: " + cliente.get().getCodigoCliente());
                System.out.println("Nombre de Cliente: " + cliente.get().getNombre());
                System.out.println("Dirección de Cliente: " + cliente.get().getDireccion());
                System.out.println("DNI de Cliente: " + cliente.get().getDni());
                System.out.println("Vehículos de Cliente:");
                System.out.println(cliente.get().getVehiculos());
        }

        if(cliente.isEmpty())
        {
            System.out.println("El cliente es nulo/ está vacío");
        }

        /*
        for (Vehiculo e : cliente.getVehiculos()) {
            System.out.println(e.getMarca() + " " + e.getModelo() + " de color " + e.getColor() + " y matrícula: " + e.getMatricula());
        }
        */

    }

}
