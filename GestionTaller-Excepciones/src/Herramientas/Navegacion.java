package Herramientas;

import java.util.Scanner;

public class Navegacion {

    public static void mostrarMenuPrincipal() {

        System.out.println("Escoge una opcion: ");
        System.out.println("1-. Gestión de Clientes");
        System.out.println("2-. Gestión de vehículos");
    }


    public static void mostrarMenuCliente() {

        System.out.println("Escoge una opcion: ");
        System.out.println("1-. Alta de Cliente");
        System.out.println("2-. Modificacion de cliente");
        System.out.println("3-. Eliminar Cliente");
        System.out.println("4-. Búsqueda de cliente");
        System.out.println("5-. Listar Clientes");
    }


    public static String leerRespuesta() {

        Scanner s = new Scanner(System.in);
        String respuesta = s.next();
        return respuesta;
    }
}