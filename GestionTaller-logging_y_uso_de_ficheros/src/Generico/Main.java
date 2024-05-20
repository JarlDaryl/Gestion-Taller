package Generico;

import data_framework.AlmacenDeDatos;
import fileReader.LectorDeArchivos;
import herramientas.*;
import entidades.Cliente;
import entidades.Vehiculo;
import logging.LoggerConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;


public class Main {

    private static final Logger logger = LoggerConfig.getLogger(Main.class.getSimpleName());

    public static void main(String[] args) {

        // Ruta al directorio que se quiere procesar
        String directoryPath = "files";

        // Iniciar el hilo FileReader
        //LectorDeArchivos.iniciarHiloLectorDeArchivos(directoryPath);


        logger.info("STARTING APP");



        Cliente cliente1 = new Cliente();
        cliente1.setCodigoCliente("8888x");
        cliente1.setDni("12121211A");
        cliente1.setDireccion("Moncloa");
        cliente1.setNombre("Pedro");
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.setMarca("FORD");
        vehiculo1.setModelo("FOCUS");
        vehiculo1.setColor("MORADO");
        vehiculo1.setMatricula("123123F");

        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        vehiculos.add(vehiculo1);
        cliente1.setVehiculos(vehiculos);
        //Guardar clientes
        AlmacenDeDatos.getClienteRepository().save(cliente1);

        HerramientasCliente herramientasCliente = new HerramientasCliente();
        HerramientasVehiculo herramientasVehículo = new HerramientasVehiculo();
        HerramientasUsuario herramientasUsuario = new HerramientasUsuario();
        HerramientasPieza herramientasPieza = new HerramientasPieza();
        HerramientasAlbaran herramientasAlbaran = new HerramientasAlbaran();


        String respuesta="";
        while (!respuesta.equalsIgnoreCase("x"))
        {
            Navegacion.mostrarMenuPrincipal();
            respuesta = Navegacion.leerRespuesta();
            if(respuesta.equalsIgnoreCase("1"))
            {
                Navegacion.mostrarMenuCliente();
                respuesta = Navegacion.leerRespuesta();
                switch (respuesta){
                    case "1":
                        herramientasCliente.registroCliente();
                        break;
                    case "2":
                        Optional<Cliente> clienteDevuelto = herramientasCliente.modificarCliente();
                        if (clienteDevuelto.isPresent()) {
                            System.out.println("Cliente modificado:");
                            System.out.println("Código: " + clienteDevuelto.get().getCodigoCliente());
                            System.out.println("DNI: " + clienteDevuelto.get().getDni());
                            System.out.println("Dirección: " + clienteDevuelto.get().getDireccion());
                            System.out.println("Nombre: " + clienteDevuelto.get().getNombre());
                            System.out.println("Edad: " + clienteDevuelto.get().getEdad());
                        } else {
                            System.out.println("El cliente con el id introducido no existe");
                        }
                        break;
                    case  "3":
                        herramientasCliente.eliminarCliente();
                        break;
                    case  "4":
                        herramientasCliente.muestraInfoCliente();
                        break;
                    case  "5":
                        herramientasCliente.listarClientes();
                        break;
                }
            }
            else if (respuesta.equalsIgnoreCase("2"))
            {
                Navegacion.mostrarMenuVehiculo();
                respuesta = Navegacion.leerRespuesta();
                switch (respuesta){
                    case "1":
                        herramientasVehículo.registroVehiculo();
                        break;
                    case "2":
                        Optional<Vehiculo> vehículoDevuelto = herramientasVehículo.modificarVehiculo();
                        if (vehículoDevuelto.isPresent()) {
//                            System.out.println("Vehículo modificado:");
//                            System.out.println("Código: " + vehículoDevuelto.get().getCodigoVehículo());
//                            System.out.println("DNI: " + vehículoDevuelto.get().getDni());
//                            System.out.println("Dirección: " + vehículoDevuelto.get().getDireccion());
//                            System.out.println("Nombre: " + vehículoDevuelto.get().getNombre());
//                            System.out.println("Edad: " + vehículoDevuelto.get().getEdad());
                        } else {
                            System.out.println("El vehículo con el id introducido no existe");
                        }
                        break;
                    case  "3":
                        herramientasVehículo.eliminarVehiculo();
                        break;
                    case  "4":
                        herramientasVehículo.muestraInfoVehiculo();
                        break;
                    case  "5":
                        herramientasVehículo.listarVehiculos();
                        break;
                }
            }
            else if (respuesta.equalsIgnoreCase("3"))
            {
                Navegacion.mostrarMenuUsuario();
                respuesta = Navegacion.leerRespuesta();
                switch (respuesta){
                    case "1":
                        herramientasCliente.registroCliente();
                        break;
                    case "2":
                        Optional<Cliente> clienteDevuelto = herramientasCliente.modificarCliente();
                        if (clienteDevuelto.isPresent()) {
                            System.out.println("Cliente modificado:");
                            System.out.println("Código: " + clienteDevuelto.get().getCodigoCliente());
                            System.out.println("DNI: " + clienteDevuelto.get().getDni());
                            System.out.println("Dirección: " + clienteDevuelto.get().getDireccion());
                            System.out.println("Nombre: " + clienteDevuelto.get().getNombre());
                            System.out.println("Edad: " + clienteDevuelto.get().getEdad());
                        } else {
                            System.out.println("El cliente con el id introducido no existe");
                        }
                        break;
                    case  "3":
                        herramientasCliente.eliminarCliente();
                        break;
                    case  "4":
                        herramientasCliente.muestraInfoCliente();
                        break;
                    case  "5":
                        herramientasCliente.listarClientes();
                        break;
                }
            }
            else if (respuesta.equalsIgnoreCase("4"))
            {
                Navegacion.mostrarMenuPieza();
                respuesta = Navegacion.leerRespuesta();
                switch (respuesta){
                    case "1":
                        herramientasCliente.registroCliente();
                        break;
                    case "2":
                        Optional<Cliente> clienteDevuelto = herramientasCliente.modificarCliente();
                        if (clienteDevuelto.isPresent()) {
                            System.out.println("Cliente modificado:");
                            System.out.println("Código: " + clienteDevuelto.get().getCodigoCliente());
                            System.out.println("DNI: " + clienteDevuelto.get().getDni());
                            System.out.println("Dirección: " + clienteDevuelto.get().getDireccion());
                            System.out.println("Nombre: " + clienteDevuelto.get().getNombre());
                            System.out.println("Edad: " + clienteDevuelto.get().getEdad());
                        } else {
                            System.out.println("El cliente con el id introducido no existe");
                        }
                        break;
                    case  "3":
                        herramientasCliente.eliminarCliente();
                        break;
                    case  "4":
                        herramientasCliente.muestraInfoCliente();
                        break;
                    case  "5":
                        herramientasCliente.listarClientes();
                        break;
                }
            }
            else if (respuesta.equalsIgnoreCase("5"))
            {
                Navegacion.mostrarMenuAlbaran();
                respuesta = Navegacion.leerRespuesta();
                switch (respuesta){
                    case "1":
                        herramientasCliente.registroCliente();
                        break;
                    case "2":
                        Optional<Cliente> clienteDevuelto = herramientasCliente.modificarCliente();
                        if (clienteDevuelto.isPresent()) {
                            System.out.println("Cliente modificado:");
                            System.out.println("Código: " + clienteDevuelto.get().getCodigoCliente());
                            System.out.println("DNI: " + clienteDevuelto.get().getDni());
                            System.out.println("Dirección: " + clienteDevuelto.get().getDireccion());
                            System.out.println("Nombre: " + clienteDevuelto.get().getNombre());
                            System.out.println("Edad: " + clienteDevuelto.get().getEdad());
                        } else {
                            System.out.println("El cliente con el id introducido no existe");
                        }
                        break;
                    case  "3":
                        herramientasCliente.eliminarCliente();
                        break;
                    case  "4":
                        herramientasCliente.muestraInfoCliente();
                        break;
                    case  "5":
                        herramientasCliente.listarClientes();
                        break;
                }
            }
        }
        if (respuesta.equalsIgnoreCase("x"))
        {
            System.exit(0);
        }
    }
}


