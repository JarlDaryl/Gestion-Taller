package Herramientas;

import entidades.Cliente;
import entidades.Vehiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HerramientasCliente {


    public Cliente registroCliente() throws NumberFormatException
    {
        Scanner s = new Scanner(System.in);

        Cliente cliente1 = new Cliente();
        List<Vehiculo> vehiculoList = new ArrayList<>();
        cliente1.setVehiculos(vehiculoList);



        System.out.println("Dime el codigo del cliente");
        String respuesta = s.next();
        cliente1.setCodigoCliente(respuesta);
        if (respuesta.equals("*")) {

            //throw new RuntimeException("Valor incorrecto para el campo nombre");
            throw new NumberFormatException("Formato del campo no válido");

        }

        System.out.println("Dime el dni del cliente");
        respuesta = s.next();
        cliente1.setDni(respuesta);

        System.out.println("Dime la dirección del cliente");
        respuesta = s.next();
        cliente1.setDireccion(respuesta);

        System.out.println("Dime el nombre del cliente");
        respuesta = s.next();
        cliente1.setNombre(respuesta);

        System.out.println("Dime la edad del cliente");
        respuesta = s.next();
        cliente1.setEdad(Integer.valueOf(respuesta));



        return cliente1;
    }
}
