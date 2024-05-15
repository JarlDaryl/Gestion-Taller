package Herramientas;

import entidades.Cliente;

import java.util.Scanner;

public class HerramientasCliente {

    public Cliente registroCliente()
    {
        Scanner s = new Scanner(System.in);

        Cliente cliente1 = new Cliente();

        System.out.println("Dime el codigo del cliente");
        String respuesta = s.next();
        cliente1.setCodigoCliente(respuesta);

        System.out.println("Dime el dni del cliente");
        respuesta = s.next();
        cliente1.setDni(respuesta);

        System.out.println("Dime la dirección del cliente");
        respuesta = s.next();
        cliente1.setDireccion(respuesta);

        System.out.println("Dime el nombre del cliente");
        respuesta = s.next();
        cliente1.setNombre(respuesta);

        try
        {
            System.out.println("Dime la edad del cliente");
            respuesta = s.next();
            cliente1.setEdad(Integer.valueOf(respuesta));
        }
        catch (NumberFormatException nf)
        {
            System.out.println(nf.getMessage());
            System.out.println("incluyendo edad por defecto");
            cliente1.setEdad(100);
        }
        return cliente1;
    }
}
