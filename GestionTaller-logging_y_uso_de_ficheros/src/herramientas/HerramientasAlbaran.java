package herramientas;

import data_framework.AlmacenDeDatos;
import entidades.Albaran;
import entidades.Pieza;
import entidades.Proveedor;
import entidades.Factura;

import java.util.*;

public class HerramientasAlbaran {

    public Albaran registroAlbaran() {
        Scanner s = new Scanner(System.in);

        Albaran albaran1 = new Albaran();
        List<Pieza> piezaList = new ArrayList<>();
        albaran1.setPiezas(piezaList);

        System.out.println("Dime el número del albaran");
        String respuesta = s.next();
        albaran1.setNumeroAlbaran(respuesta);
        if (respuesta.equals("*")) {
            //throw new RuntimeException("Valor incorrecto para el campo numero de albaran");
            throw new NumberFormatException("Formato del campo no válido");
        }

        System.out.println("Dime el número de factura");
        respuesta = s.next();
        if (respuesta.length() != 8) {
            throw new InputMismatchException("La factura debe tener 8 caracteres");
        } else {
            Optional<Factura> FACTURAOBTENIDA = AlmacenDeDatos.getFacturaRepository().findById(respuesta);
            if (FACTURAOBTENIDA.isPresent()) {
                albaran1.setFactura(FACTURAOBTENIDA.get());
            }
        }

        System.out.println("Dime el código de pieza");
        respuesta = s.next();

        Optional<Pieza> PIEZAOBTENIDA = AlmacenDeDatos.getPiezaRepository().findById(respuesta);
        if (PIEZAOBTENIDA.isPresent()) {
            List<Pieza> LISTAPIEZAS = new ArrayList<>();
            LISTAPIEZAS.add(PIEZAOBTENIDA.get());
            albaran1.setPiezas(LISTAPIEZAS);
        }

        System.out.println("Dime el código de proveedor");
        respuesta = s.next();
            Optional<Proveedor> PROVEEDOROBTENIDO = AlmacenDeDatos.getProveedorRepository().findById(respuesta);
            if (PROVEEDOROBTENIDO.isPresent()) {
                albaran1.setProveedor(PROVEEDOROBTENIDO.get());
            }

        AlmacenDeDatos.getAlbaranRepository().save(albaran1);

        return albaran1;
    }

    public Optional<Albaran> modificarAlbaran() {

        Scanner s = new Scanner(System.in);
        Optional<Albaran> albaran = findAlbaran();

        if(albaran.isPresent()) {

            System.out.println("Datos del albaran a modificar");
            System.out.println("Código: " + albaran.get().getNumeroAlbaran());
            System.out.println("Factura: " + albaran.get().getFactura());
            System.out.println("Pieza: " + albaran.get().getPiezas());
            System.out.println("Proveedor: " + albaran.get().getProveedor());

            // Nuevos datos del cliente (modificado)
            System.out.println("Nuevo código del albaran: ");
            String nuevoCodigo = s.nextLine().trim();
            System.out.println("Nueva factura: ");
            String nuevaFactura = s.nextLine().trim();
            System.out.println("Nueva pieza: ");
            String nuevaPieza = s.nextLine().trim();
            System.out.println("Nuevo proveedor: ");
            String nuevoProveedor = s.nextLine().trim();

            // Actualización de los campos del cliente
            if (!nuevoCodigo.isEmpty()) {
                albaran.get().setNumeroAlbaran(nuevoCodigo);
            }
            if (!nuevaFactura.isEmpty()) {
                if (nuevaFactura.length() != 8) {
                    throw new InputMismatchException("La factura debe tener 8 caracteres");
                } else {
                    Optional<Factura> FACTURAOBTENIDA = AlmacenDeDatos.getFacturaRepository().findById(nuevaFactura);
                    if (FACTURAOBTENIDA.isPresent()) {
                        albaran.get().setFactura(FACTURAOBTENIDA.get());
                    }
                }
            }

            if (!nuevaPieza.isEmpty()) {
                Optional<Pieza> PIEZAOBTENIDA = AlmacenDeDatos.getPiezaRepository().findById(nuevaPieza);
                if (PIEZAOBTENIDA.isPresent()) {
                    List<Pieza> LISTAPIEZAS = new ArrayList<>();
                    LISTAPIEZAS.add(PIEZAOBTENIDA.get());
                    albaran.get().setPiezas(LISTAPIEZAS);
                }
            }

            if (!nuevoProveedor.isEmpty()) {
                Optional<Proveedor> PROVEEDOROBTENIDO = AlmacenDeDatos.getProveedorRepository().findById(nuevoProveedor);
                if (PROVEEDOROBTENIDO.isPresent()) {
                    albaran.get().setProveedor(PROVEEDOROBTENIDO.get());
                }
            }
            return albaran;
        } else {
            return Optional.empty();
        }
    }

    public void eliminarAlbaran() {
        Optional<Albaran> albaran = findAlbaran();
        if(albaran.isPresent()) {
            AlmacenDeDatos.getAlbaranRepository().delete(albaran.get());
            System.out.println("Albaran " + albaran.get().getNumeroAlbaran() + " ha sido eliminado");
        } else {
            System.out.println("Albaran no encontrado");
        }
    }

    public void muestraInfoAlbaran() {

        System.out.println("Dime el codigo del albaran");
        Scanner s = new Scanner(System.in);
        String id = s.next();
        Optional<Albaran> albaran = AlmacenDeDatos.getAlbaranRepository().findById(id);
        if(albaran.isPresent())
        {
            System.out.println(albaran.get().getNumeroAlbaran());
        }
        else {
            System.out.println("Albaran no encontrado");
        }
    }

    public void listarAlbaranes() {
        List<Albaran> listaAlbaranes = AlmacenDeDatos.getAlbaranRepository().findAll();
        System.out.println(listaAlbaranes);
    }

    public Optional<Albaran> findAlbaran() {

        Scanner s = new Scanner(System.in);
        System.out.println("Busca el albaran por su id: ");
        String id = s.next();
        Optional<Albaran> albaran = AlmacenDeDatos.getAlbaranRepository().findById(id);
        if(albaran.isPresent()) {
            return albaran;
        } else {
            System.out.println("Albaran no encontrado");
            return Optional.empty();
        }
    }

}
