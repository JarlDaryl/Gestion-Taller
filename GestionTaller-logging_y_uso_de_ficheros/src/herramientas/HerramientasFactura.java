package herramientas;

import data_framework.AlmacenDeDatos;
import entidades.Factura;
import entidades.Factura;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@SuppressWarnings("UseOfSystemOutOrSystemErr")
public class HerramientasFactura {

    public Factura registroFactura()
    {
        Scanner s = new Scanner(System.in);

        Factura factura = new Factura();

        System.out.println("Dime el codigo de la factura");
        String codigoFactura = s.next();
        factura.setCodigoFactura(codigoFactura);


        System.out.println("Ingrese el estado de pago (true/false):");
        boolean estadoPago = s.nextBoolean();
        factura.setEstadoPago(estadoPago);

        System.out.println("Ingrese el importe:");
        double importe = s.nextDouble();
        factura.setImporte((float) importe);

        System.out.println("Fecha de creación de la factura");
        LocalDateTime fechaFactura = LocalDateTime.parse(s.next());
        factura.setFechaFactura(fechaFactura);

        return factura;
    }

    public Optional<Factura> modificarFactura() {
        Scanner s = new Scanner(System.in);
        Optional<Factura> factura = findFactura();

        if (factura.isPresent()) {
            System.out.println("Datos de la factura a modificar:");
            System.out.println("Código: " + factura.get().getCodigoFactura());
            System.out.println("Estado de pago: " + factura.get().isEstadoPago());
            System.out.println("Importe: " + factura.get().getImporte());

            // Nuevos datos de la factura (modificado)
            System.out.println("Nuevo Código de la factura:");
            String nuevoCodigo = s.next().trim();
            System.out.println("Nuevo Estado de pago (true/false):");
            boolean nuevoEstadoPago = s.nextBoolean();
            System.out.println("Nuevo Importe:");
            double nuevoImporte = s.nextDouble();

            // Actualización de los campos de la factura
            if (!nuevoCodigo.isEmpty()) {
                factura.get().setCodigoFactura(nuevoCodigo);
            }
            factura.get().setEstadoPago(nuevoEstadoPago);
            factura.get().setImporte((float) nuevoImporte);
            return factura;
        } else {
            return Optional.empty();
        }
    }

    public void eliminar() {
        Optional<Factura> factura = findFactura();
        if(factura.isPresent()) {
            AlmacenDeDatos.getFacturaRepository().delete(factura.get());
            System.out.println("factura " + factura.get().getCodigoFactura() + " ha sido eliminado");
        } else {
            System.out.println("factura no encontrado");
        }
    }

    public void muestraInfoFactura() {

        System.out.println("Dime el codigo del factura");
        Scanner s = new Scanner(System.in);
        String id = s.next();
        Optional<Factura> factura = AlmacenDeDatos.getFacturaRepository().findById(id);
        if(factura.isPresent())
        {
            System.out.println(factura.get().getCodigoFactura());
            System.out.println(factura.get().getFechaFactura());
            System.out.println(factura.get().getFechaVencimiento());
            System.out.println(factura.get().getImporte());
            System.out.println(factura.get().getCliente());
            System.out.println(factura.get().getEmpleado());
            System.out.println(factura.get().getTrabajosRealizados());
            System.out.println(factura.get().isEstadoPago());
        }
        else {
            System.out.println("factura no encontrado");
        }
    }

    public void listarFacturas() {
        List<Factura> listaFactura = AlmacenDeDatos.getFacturaRepository().findAll();
        for (Factura factura : listaFactura) {
            System.out.println("Código: " + factura.getCodigoFactura());
            System.out.println("Estado de pago: " + factura.isEstadoPago());
            System.out.println("Importe: " + factura.getImporte());
            System.out.println(); // Salto de línea entre facturas
        }
    }


    public Optional<Factura> findFactura() {

        Scanner s = new Scanner(System.in);
        System.out.println("Busca la factura por su codigo: ");
        String id = s.next();
        Optional<Factura> factura = AlmacenDeDatos.getFacturaRepository().findById(id);
        if(factura.isPresent()) {
            return factura;
        } else {
            System.out.println("factura no encontrado");
            return Optional.empty();
        }
    }


}