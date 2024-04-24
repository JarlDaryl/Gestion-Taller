package Generico;

import entidades.Vehiculo;
import entidades.Usuario;

public class ImpresoraDeDatos {


    public static void ImprimirInfoVehiculo(Vehiculo vehiculoRecibido) {
            System.out.println("Matrícula: " + vehiculoRecibido.getMatricula());
            System.out.println("Número de bastidor: " + vehiculoRecibido.getNumeroBastidor());
            System.out.println("Marca: " + vehiculoRecibido.getMarca());
            System.out.println("Modelo: " + vehiculoRecibido.getModelo());
            System.out.println("Color: " + vehiculoRecibido.getColor());
            System.out.println("Fecha de fabricación: " + vehiculoRecibido.getFechaFabricacion());
            System.out.println("Fecha de última ITV: " + vehiculoRecibido.getFechaITV());
            System.out.println(); // Salto de línea entre vehículos
    }

    public static void ImprimirInfoUsuario(Usuario usuarioRecibido) {
        System.out.println("Nombre de Usuario: " + usuarioRecibido.getNombreUsuario());
        System.out.println("Contraseña: " + usuarioRecibido.getContraseña());
        System.out.println("Correo Electronico: " + usuarioRecibido.getCorreoElectronico());

        System.out.println(); // Salto de línea entre vehículos
    }



}
