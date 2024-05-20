package herramientas;

import data_framework.AlmacenDeDatos;
import entidades.Vehiculo;


import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;

@SuppressWarnings("UseOfSystemOutOrSystemErr")
public class HerramientasVehiculo {

    public Vehiculo registroVehiculo()
    {
        Scanner s = new Scanner(System.in);

        Vehiculo vehiculo = new Vehiculo();

        System.out.println("Dime la matricula del vehiculo");
        String respuesta = s.next();
        vehiculo.setMatricula(respuesta);
        if (respuesta.equals("*")) {
            //throw new RuntimeException("Valor incorrecto para el campo nombre");
            throw new NumberFormatException("Formato del campo no válido");
        }

        System.out.println("Dime el numero de bastidor del vehiculo");
        respuesta = s.next();
        if (respuesta.length() !=17){
            throw new InputMismatchException("El número de bastidor debe contener 17 caracteres");
        }else {
            vehiculo.setNumeroBastidor(respuesta);
        }
        vehiculo.setNumeroBastidor(respuesta);

        System.out.println("Dime la marca del vehiculo");
        respuesta = s.next();
        vehiculo.setMarca(respuesta);

        System.out.println("Dime el modelo del vehiculo");
        respuesta = s.next();
        vehiculo.setModelo(respuesta);

        System.out.println("Dime el color del vehiculo");
        respuesta = s.next();
        vehiculo.setColor(respuesta);

        try {
            System.out.println("Dime la fecha de fabricación del vehiculo (ejemplo: 2024-05-19) year-month-day");
            respuesta = s.next();
            vehiculo.setFechaFabricacion(LocalDate.parse(respuesta));

            System.out.println("Dime la fecha de ITV del vehiculo (ejemplo: 2024-05-19) year-month-day");
            respuesta = s.next();
            vehiculo.setFechaITV(LocalDate.parse(respuesta));
        } catch (DateTimeParseException de) {
            throw new IllegalArgumentException("La fecha introducida no es válida. Por favor, usa el formato año-mes-día (ejemplo: 2024-05-19).", de);
        }

        AlmacenDeDatos.getVehiculoRepository().save(vehiculo);

        return vehiculo;
    }

    public Optional<Vehiculo> modificarVehiculo() {
        Scanner s = new Scanner(System.in);
        Optional<Vehiculo> vehiculo = findVehiculo();

        if (vehiculo.isPresent()) {
            try {
                System.out.println("Datos del vehiculo a modificar");
                System.out.println("Matrícula: " + vehiculo.get().getMatricula());
                System.out.println("Numero Bastidor: " + vehiculo.get().getNumeroBastidor());
                System.out.println("Marca: " + vehiculo.get().getMarca());
                System.out.println("Modelo: " + vehiculo.get().getModelo());
                System.out.println("Color: " + vehiculo.get().getColor());
                System.out.println("Fecha Fabricación: " + vehiculo.get().getFechaFabricacion());
                System.out.println("Fecha ITV: " + vehiculo.get().getFechaITV());

                // Nuevos datos del vehiculo (modificado)
                System.out.println("Nueva Matrícula del vehiculo: ");
                String nuevaMatricula = s.nextLine().trim();

                System.out.println("Nuevo Numero Bastidor del vehiculo: ");
                String nuevoNumeroBastidor = s.nextLine().trim();

                System.out.println("Nueva Marca del vehiculo: ");
                String nuevaMarca = s.nextLine().trim();

                System.out.println("Nuevo Modelo del vehiculo: ");
                String nuevoModelo = s.nextLine().trim();

                System.out.println("Nuevo Color del vehiculo: ");
                String nuevoColor = s.nextLine().trim();

                System.out.println("Nueva Fecha de Fabricación del vehiculo (ejemplo: 2024-05-19) year-month-day: ");
                LocalDate nuevaFechaFabricacion = LocalDate.parse(s.nextLine().trim());

                System.out.println("Nueva Fecha de ITV del vehiculo (ejemplo: 2024-05-19) year-month-day: ");
                LocalDate nuevaFechaItv = LocalDate.parse(s.nextLine().trim());

                // Actualización de los campos del vehiculo
                if (!nuevaMatricula.isEmpty()) {
                    vehiculo.get().setMatricula(nuevaMatricula);
                }
                if (!nuevoNumeroBastidor.isEmpty()) {
                    vehiculo.get().setNumeroBastidor(nuevoNumeroBastidor);
                }
                if (!nuevaMarca.isEmpty()) {
                    vehiculo.get().setMarca(nuevaMarca);
                }
                if (!nuevoModelo.isEmpty()) {
                    vehiculo.get().setModelo(nuevoModelo);
                }
                if (!nuevoColor.isEmpty()) {
                    vehiculo.get().setColor(nuevoColor);
                }

                vehiculo.get().setFechaFabricacion(nuevaFechaFabricacion);
                vehiculo.get().setFechaITV(nuevaFechaItv);

                AlmacenDeDatos.getVehiculoRepository().update(vehiculo.get());

                return vehiculo;
            } catch (DateTimeParseException e) {
                System.err.println("La fecha introducida no es válida. Por favor, usa el formato año-mes-día (ejemplo: 2024-05-19).");
            } catch (Exception e) {
                System.err.println("Ocurrió un error al actualizar el vehículo: " + e.getMessage());
            }
        }

        return Optional.empty();
    }


    public void eliminarVehiculo() {
        Optional<Vehiculo> vehiculo = findVehiculo();
        if(vehiculo.isPresent()) {
            AlmacenDeDatos.getVehiculoRepository().delete(vehiculo.get());
            System.out.println("Vehiculo " + vehiculo.get().getMatricula() + " ha sido eliminado");
        } else {
            System.out.println("Vehiculo no encontrado");
        }
    }

    public void muestraInfoVehiculo() {

        System.out.println("Dime el codigo del vehiculo");
        Scanner s = new Scanner(System.in);
        String id = s.next();
        Optional<Vehiculo> vehiculo = AlmacenDeDatos.getVehiculoRepository().findById(id);
        if(vehiculo.isPresent())
        {
            System.out.println("Matrícula: " + vehiculo.get().getMatricula());
            System.out.println("Fecha Fabricación" + vehiculo.get().getFechaFabricacion());
            System.out.println("Marca: " + vehiculo.get().getMarca());
            System.out.println("Modelo: " + vehiculo.get().getModelo());
        }
        else {
            System.out.println("Vehiculo no encontrado");
        }
    }

    public void listarVehiculos() {
        List<Vehiculo> listaVehiculos = AlmacenDeDatos.getVehiculoRepository().findAll();
        for (Vehiculo v : listaVehiculos) {
            System.out.println("Matricula: " + v.getMatricula());
            System.out.println("Marca: " + v.getMarca());
            System.out.println("Modelo: " + v.getModelo());
            System.out.println("Color: " + v.getColor());
        }
    }

    public Optional<Vehiculo> findVehiculo() {

        Scanner s = new Scanner(System.in);
        System.out.println("Busca el vehiculo por su id: ");
        String id = s.next();
        Optional<Vehiculo> vehiculo = AlmacenDeDatos.getVehiculoRepository().findById(id);
        if(vehiculo.isPresent()) {
            return vehiculo;
        } else {
            System.out.println("Vehiculo no encontrado");
            return Optional.empty();
        }
    }


}