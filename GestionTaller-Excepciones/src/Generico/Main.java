package Generico;

import DATA_FRAMEWORK_OK.AlmacenDeDatos;
import Herramientas.HerramientasCliente;
import Herramientas.Navegacion;
import entidades.Cliente;

import java.util.Optional;
import java.util.Scanner;


public class Main {

    public static void mostrarMenuPrincipal() {

        System.out.println("Escoge una opcion: ");
        System.out.println("1-. Registro de cliente");
        System.out.println("2-. Registro de vehículo");
        System.out.println("3-. Consulta de Vehículo");

    }

    public static void main(String[] args) {

        HerramientasCliente herramientasCliente = new HerramientasCliente();
        Navegacion.mostrarMenuPrincipal();
        String respuesta = Navegacion.leerRespuesta();


        Optional<Cliente> cliente1 = Optional.empty();

        if(respuesta.equals("1"))
        {
            try {
                cliente1 = Optional.of(herramientasCliente.registroCliente());
            }
            catch (NumberFormatException nf)
            {
                System.out.println(("CACHEADA1"));
            }
        }

        if(respuesta.equals("2"))
        {
            System.out.println("Registro de vehiculo");
        }

        Optional<Cliente> clienteDeShrodinger = cliente1;

        ImpresoraDeDatos.ImprimirInfoCliente(clienteDeShrodinger);

    }
}