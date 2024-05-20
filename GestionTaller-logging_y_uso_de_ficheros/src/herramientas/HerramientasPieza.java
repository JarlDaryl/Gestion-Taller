package herramientas;

import data_framework.AlmacenDeDatos;
import entidades.Pieza;
import entidades.Vehiculo;

import java.util.*;

public class HerramientasPieza {

    public Pieza registroPieza() {
        Scanner s = new Scanner(System.in);

        Pieza pieza1 = new Pieza();
        List<Vehiculo> vehiculoList = new ArrayList<>();
        pieza1.setVehiculos(vehiculoList);

        System.out.println("Dime el codigo de la pieza");
        String respuesta = s.next();
        pieza1.setCodigoDePieza(respuesta);
        if (respuesta.equals("*")) {
            throw new NumberFormatException("Formato del campo no válido");
        }

        System.out.print("Dime la marca de la pieza");
        respuesta = s.next();
        pieza1.setMarca(respuesta);

        System.out.print("Dime la descripcion de la pieza");
        respuesta = s.next();
        pieza1.setDescripción(respuesta);

        System.out.print("Dime la garantiaFabricante de la pieza");
        respuesta = s.next();
        pieza1.setGarantiaFabricante(Boolean.valueOf(respuesta));

        System.out.print("Dime la garantiaMontaje de la pieza");
        respuesta = s.next();
        pieza1.setGarantiaMontaje(Boolean.valueOf(respuesta));

        AlmacenDeDatos.getPiezaRepository().save(pieza1);

        return pieza1;
    }

    public Optional<Pieza> modificarPieza() {
        Scanner s = new Scanner(System.in);
        Optional<Pieza> pieza = findPieza();

        if(pieza.isPresent()) {
            System.out.println("Datos de la pieza a modificar");
            System.out.println("Código de la pieza: " + pieza.get().getCodigoPieza());
            System.out.println("Marca: " + pieza.get().getMarca());
            System.out.println("Descripción: " + pieza.get().getDescripción());
            System.out.println("Garantia del fabricante: " + pieza.get().isGarantiaFabricante());
            System.out.println("Garantia de montaje: " + pieza.get().isGarantiaMontaje());

            System.out.println("Nuevo Código de la pieza: ");
            String nuevoCodigo = s.nextLine().trim();
            System.out.println("Nueva marca de la pieza: ");
            String nuevaMarca = s.nextLine().trim();
            System.out.println("Nueva descripcion de la pieza: ");
            String nuevaDescripcion = s.nextLine().trim();
            System.out.println("Nueva garantia de la pieza: ");
            Boolean garantiaFabricante = s.nextBoolean();
            System.out.println("Garantia de montaje: ");
            Boolean garantaiMontaje = s.nextBoolean();


            if (!nuevoCodigo.isEmpty()) {
                pieza.get().setCodigoDePieza(nuevoCodigo);
            }
            if (!nuevaMarca.isEmpty()) {
                pieza.get().setMarca(nuevaMarca);
            }
            if (!nuevaDescripcion.isEmpty()) {
                pieza.get().setDescripción(nuevaDescripcion);
            }
            if (garantiaFabricante = true) {
                pieza.get().setGarantiaFabricante(garantiaFabricante);
            }
            if(garantaiMontaje = true) {
                pieza.get().setGarantiaMontaje(garantaiMontaje);
            }

            AlmacenDeDatos.getPiezaRepository().update(pieza.get());

            return pieza;

        } else {
            return Optional.empty();
        }
    }

    public void eliminarPieza() {
        Optional<Pieza> pieza = findPieza();
        if(pieza.isPresent()) {
            AlmacenDeDatos.getPiezaRepository().delete(pieza.get());
            System.out.println("Pieza " + pieza.get().getCodigoPieza() + " ha sido eliminada");
        } else {
            System.out.println("Pieza no encontrada");
        }
    }

    public void muestraInfoPieza() {
        System.out.println("Dime el codigo de la pieza");
        Scanner s = new Scanner(System.in);
        String codigoDePieza = s.next();
        Optional<Pieza> pieza = AlmacenDeDatos.getPiezaRepository().findBycodigoDePieza(codigoDePieza);
        if(pieza.isPresent()) {
            System.out.println(pieza.get().getCodigoPieza());
            System.out.println(pieza.get().getDescripción());
        } else {
            System.out.println("Pieza no encontrada");
        }
    }

    public void listarPiezas() {
        List<Pieza> listaPiezas = AlmacenDeDatos.getPiezaRepository().findAll();
        System.out.println(listaPiezas);
    }

    private Optional<Pieza> findPieza() {

        Scanner s = new Scanner(System.in);
        System.out.print("Busca la pieza por su Codigo: ");
        String codigoDePieza = s.next();
        Optional<Pieza> pieza = AlmacenDeDatos.getPiezaRepository().findBycodigoDePieza(codigoDePieza);
        if(pieza.isPresent()) {
            return pieza;
        } else {
            System.out.print("Pieza no encontrada");
            return Optional.empty();
        }
    }

}
