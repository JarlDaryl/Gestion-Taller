package herramientas;

import data_framework.AlmacenDeDatos;
import entidades.Cliente;
import entidades.Vehiculo;

import java.util.*;

@SuppressWarnings("UseOfSystemOutOrSystemErr")
public class HerramientasCliente {

    public Cliente registroCliente()
    {
        Scanner s = new Scanner(System.in);

        Cliente cliente1 = new Cliente();
        List<Vehiculo> vehiculoList = new ArrayList<>();
        cliente1.setVehiculos(vehiculoList);

        System.out.println("Dime el codigo del cliente");
        String respuesta = s.next();
        cliente1.setCodigoCliente(respuesta);
        if (respuesta.equals("*")) {
            //throw new RuntimeException("Valor incorrecto para el campo nombre");
            throw new NumberFormatException("Formato del campo no válido");
        }

        System.out.println("Dime el dni del cliente");
        respuesta = s.next();
        if (respuesta.length() !=10){
            throw new InputMismatchException("El Dni debe contener 10 caracteres");
        }else {
            cliente1.setDni(respuesta);
        }
        cliente1.setDni(respuesta);

        System.out.println("Dime la dirección del cliente");
        respuesta = s.next();
        cliente1.setDireccion(respuesta);

        System.out.println("Dime el nombre del cliente");
        respuesta = s.next();
        cliente1.setNombre(respuesta);

        System.out.println("Dime la edad del cliente");
        respuesta = s.next();
        cliente1.setEdad(Integer.valueOf(respuesta));

        return cliente1;
    }

    public Optional<Cliente> modificarCliente() {

        Scanner s = new Scanner(System.in);
        Optional<Cliente> cliente = findCliente();

        if(cliente.isPresent()) {

            System.out.println("Datos del cliente a modificar");
            System.out.println("Código: " + cliente.get().getDni());
            System.out.println("Dni: " + cliente.get().getCodigoCliente());
            System.out.println("Dirección: " + cliente.get().getDireccion());
            System.out.println("Nombre: " + cliente.get().getNombre());
            System.out.println("Edad: " + cliente.get().getEdad());

            // Nuevos datos del cliente (modificado)
            System.out.println("Nuevo Código del cliente: ");
            String nuevoCodigo = s.nextLine().trim();
            System.out.println("Nuevo DNI del cliente: ");
            String nuevoDni = s.nextLine().trim();
            System.out.println("Nueva Dirección del cliente: ");
            String nuevaDireccion = s.nextLine().trim();
            System.out.println("Nuevo Nombre del cliente: ");
            String nuevoNombre = s.nextLine().trim();
            System.out.println("Nueva Edad del cliente (ejemplo: 18): ");
            int nuevaEdad = s.nextInt();

            // Actualización de los campos del cliente
            if (!nuevoCodigo.isEmpty()) {
                cliente.get().setCodigoCliente(nuevoCodigo);
            }
            if (!nuevoDni.isEmpty()) {
                cliente.get().setDni(nuevoDni);
            }
            if (!nuevaDireccion.isEmpty()) {
                cliente.get().setDireccion(nuevaDireccion);
            }
            if (!nuevoNombre.isEmpty()) {
                cliente.get().setNombre(nuevoNombre);
            }
            if(nuevaEdad > 0 && nuevaEdad <= 100) {
                cliente.get().setEdad(nuevaEdad);
            }
            return cliente;
        } else {
            return Optional.empty();
        }
    }

    public void eliminarCliente() {
        Optional<Cliente> cliente = findCliente();
        if(cliente.isPresent()) {
            AlmacenDeDatos.getClienteRepository().delete(cliente.get());
            System.out.println("Cliente " + cliente.get().getCodigoCliente() + " ha sido eliminado");
        } else {
            System.out.println("Cliente no encontrado");
        }
    }

    public void muestraInfoCliente() {

        System.out.println("Dime el codigo del cliente");
        Scanner s = new Scanner(System.in);
        String id = s.next();
        Optional<Cliente> cliente = AlmacenDeDatos.getClienteRepository().findById(id);
        if(cliente.isPresent())
        {
            System.out.println(cliente.get().getCodigoCliente());
            System.out.println(cliente.get().getNombre());
        }
        else {
            System.out.println("Cliente no encontrado");
        }
    }

    public void listarClientes() {
        List<Cliente> listaClientes = AlmacenDeDatos.getClienteRepository().findAll();
        System.out.println(listaClientes);
    }

    public Optional<Cliente> findCliente() {

        Scanner s = new Scanner(System.in);
        System.out.println("Busca el cliente por su id: ");
        String id = s.next();
        Optional<Cliente> cliente = AlmacenDeDatos.getClienteRepository().findById(id);
        if(cliente.isPresent()) {
            return cliente;
        } else {
            System.out.println("Cliente no encontrado");
            return Optional.empty();
        }
    }


}