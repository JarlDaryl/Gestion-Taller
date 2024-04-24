package Generico;

import DATA_FRAMEWORK.v00_REPOSITORIO_CRUD_BASICO.Ejemplo1;
import DATA_FRAMEWORK.v01_INTERFAZ_CRUD_BASICA.Ejemplo2;
import DATA_FRAMEWORK.v02_INTERFAZ_CRUD_GENERICA.Ejemplo3;
import DATA_FRAMEWORK.v03_REPOSITORIO_GENERICO_V1.Ejemplo4;
import DATA_FRAMEWORK.v03_REPOSITORIO_GENERICO_V3.Ejemplo6;
import DATA_FRAMEWORK.v03_REPOSITORIO_GENERICO_V4.Ejemplo7;
import DATA_FRAMEWORK.v03_REPOSITORIO_GENERICO_V5.Ejemplo8;
import DATA_FRAMEWORK.v03_REPOSITORIO_GENERICO_V6.Ejemplo9;
import DATA_FRAMEWORK.v03_REPOSITORIO_GENERICO_V7.Ejemplo10;
import DATA_FRAMEWORK.v04_ALMACEN_ESTATICO.EjemploEstatico;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        System.out.println("Ejemplo 1 ================");
        Ejemplo1.ejecutar();
        System.out.println("Ejemplo 2 ================");
        Ejemplo2.ejecutar();
        System.out.println("Ejemplo 3 ================");
        Ejemplo3.ejecutar();
        System.out.println("Ejemplo 4 ================");
        Ejemplo4.ejecutar();
        System.out.println("Ejemplo 5 ================");
        //Ejemplo5.ejecutar();
        System.out.println("Ejemplo 6 ================");
        Ejemplo6.ejecutar();
        System.out.println("Ejemplo 7 ================");
        Ejemplo7.ejecutar();
        System.out.println("Ejemplo 8 ================");
        Ejemplo8.ejecutar();
        System.out.println("Ejemplo 9 ================");
        Ejemplo9.ejecutar();
        System.out.println("Ejemplo 10 ================");
        Ejemplo10.ejecutar();
        System.out.println("Ejemplo Estático ================");
        EjemploEstatico.ejecutar();

    }

}