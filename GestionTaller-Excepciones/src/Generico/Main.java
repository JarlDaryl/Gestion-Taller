package Generico;


import DATA_FRAMEWORK_EVOLUCION.v04_ALMACEN_ESTATICO.AlmacenDeDatos;
import DATA_FRAMEWORK_EVOLUCION.v04_ALMACEN_ESTATICO.EjemploEstatico;
import Herramientas.HerramientasCliente;
import entidades.Cliente;
import entidades.Vehiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void mostrarMenuPrincipal() {

        System.out.println("Escoge una opcion: ");
        System.out.println("1-. Registro de cliente");
        System.out.println("2-. Registro de vehículo");
        System.out.println("3-. Consulta de Vehículo");

    }

    public static void main(String[] args) {
        HerramientasCliente herramientasCliente = new HerramientasCliente();

        mostrarMenuPrincipal();

        Scanner s = new Scanner(System.in);
        String respuesta = s.next();
        Cliente cliente1 = null;
        
        if(respuesta.equals("1"))
        {
            cliente1 = herramientasCliente.registroCliente();
        }

        if(respuesta.equals("2"))
        {
            System.out.println("Registro de vehiculo");
        }



        /*
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.setMarca("Mercedes");
        vehiculo1.setModelo("AMG");
        vehiculo1.setColor("Negro");
        vehiculo1.setMatricula("123121F");

        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.setMarca("Seat");
        vehiculo2.setModelo("Ibiza");
        vehiculo2.setColor("Blanco");
        vehiculo2.setMatricula("656456X");



        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);

        cliente1.setVehiculos(vehiculos);

        // Guardamos un cliente
        AlmacenDeDatos.getClienteRepository().save(cliente1);
        Cliente cliente2 = AlmacenDeDatos.getClienteRepository().findById("8888x");

*/

        ImpresoraDeDatos.ImprimirInfoCliente(cliente1);
        ImpresoraDeDatos.ImprimirInfoCliente(AlmacenDeDatos.getClienteRepository().findById("8888x"));


    }

}