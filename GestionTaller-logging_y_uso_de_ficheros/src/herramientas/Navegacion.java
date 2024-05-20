package herramientas;

import logging.LoggerConfig;


import java.util.Scanner;
import java.util.logging.Logger;


public class Navegacion {

    private static final Logger logger =
            LoggerConfig.getLogger(Navegacion.class.getName());




    public static void mostrarMenuPrincipal() {

        logger.info("Mostrando menu principal");

        System.out.println("Escoge una opcion: ");
        System.out.println("1-. Gestión de clientes");
        System.out.println("2-. Gestión de vehículos");
        System.out.println("3-. Gestión de usuarios");
        System.out.println("4-. Gestión de piezas");
        System.out.println("5-. Gestión de albaranes");
        System.out.println("x-. Salir");


    }

    public static void mostrarMenuCliente() {

        System.out.println("Escoge una opcion: ");
        System.out.println("1-. Alta de Cliente");
        System.out.println("2-. Modificacion de cliente");
        System.out.println("3-. Eliminar Cliente");
        System.out.println("4-. Búsqueda de cliente");
        System.out.println("5-. Listar Clientes");
    }

    public static void mostrarMenuVehiculo() {

        System.out.println("Escoge una opcion: ");
        System.out.println("1-. Alta de Vehiculo");
        System.out.println("2-. Modificacion de Vehiculo");
        System.out.println("3-. Eliminar Vehiculo");
        System.out.println("4-. Búsqueda de Vehiculo");
        System.out.println("5-. Listar Vehiculos");
    }

    public static void mostrarMenuUsuario() {

        logger.fine("Mostrando menu vehiculo");

        System.out.println("Escoge una opcion: ");
        System.out.println("1-. Alta de Usuario");
        System.out.println("2-. Modificacion de Usuario");
        System.out.println("3-. Eliminar Usuario");
        System.out.println("4-. Búsqueda de Usuario");
        System.out.println("5-. Listar Usuarios");
    }

    public static void mostrarMenuPieza() {

        logger.fine("Mostrando menu pieza");

        System.out.println("Escoge una opcion: ");
        System.out.println("1-. Alta de Pieza");
        System.out.println("2-. Modificacion de pieza");
        System.out.println("3-. Eliminar pieza");
        System.out.println("4-. Búsqueda info de pieza");
        System.out.println("5-. Listar piezas");
    }

    public static void mostrarMenuAlbaran() {

        logger.fine("Mostrando menu Albaran");

        System.out.println("Escoge una opcion: ");
        System.out.println("1-. Alta de Albaran");
        System.out.println("2-. Modificacion de Albaran");
        System.out.println("3-. Eliminar Albaran");
        System.out.println("4-. Búsqueda de Albaran");
        System.out.println("5-. Listar Albaranes");
    }

    public static String leerRespuesta() {
        Scanner s = new Scanner(System.in);
        String respuesta = s.next();
        return respuesta;
    }

}