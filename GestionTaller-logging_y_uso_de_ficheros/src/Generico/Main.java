package Generico;

import data_framework.AlmacenDeDatos;
import fileReader.LectorDeArchivos;
import herramientas.HerramientasCliente;
import herramientas.Navegacion;
import entidades.Cliente;
import entidades.Vehiculo;
import logging.LoggerConfig;
import entidades.Pieza;
import herramientas.HerramientasPieza;

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
       // LectorDeArchivos.iniciarHiloLectorDeArchivos(directoryPath);


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
        HerramientasPieza herramientasPieza = new HerramientasPieza();
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
            }
            else if (respuesta.equalsIgnoreCase("3")) {
                Navegacion.mostrarMenuPieza();
                respuesta = Navegacion.leerRespuesta();
                switch (respuesta){
                    case "1":
                        herramientasPieza.registroPieza();
                        break;
                    case "2":
                        Optional<Pieza> PiezaDevuelta = herramientasPieza.modificarPieza();
                        if (PiezaDevuelta.isPresent()) {
                            System.out.println("Pieza modificada:");
                            System.out.println("Código: " + PiezaDevuelta.get().getCodigoPieza());
                            System.out.println("Marca: " + PiezaDevuelta.get().getMarca());
                            System.out.println("Descripción: " + PiezaDevuelta.get().getDescripción());
                            System.out.println("Garantia fabricante: " + PiezaDevuelta.get().isGarantiaFabricante());
                            System.out.println("Garantia montaje: " + PiezaDevuelta.get().isGarantiaMontaje());
                        } else {
                            System.out.println("La pieza con el código introducido no existe");
                        }
                        break;
                    case  "3":
                        herramientasPieza.eliminarPieza();
                        break;
                    case  "4":
                        herramientasPieza.muestraInfoPieza();
                        break;
                    case "5":
                        herramientasPieza.listarPiezas();
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


