package herramientas;

import data_framework.AlmacenDeDatos;
import entidades.Usuario;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@SuppressWarnings("UseOfSystemOutOrSystemErr")
public class HerramientasUsuario {

    public Usuario registroUsuario()
    {
        Scanner s = new Scanner(System.in);

        Usuario usuario = new Usuario();

        System.out.println("Dime el correo del usuario");
        String respuesta = s.next();
        usuario.setCorreoElectronico(respuesta);
        if (respuesta.equals("*")) {
            //throw new RuntimeException("Valor incorrecto para el campo nombre");
            throw new NumberFormatException("Formato del campo no válido");
        }

        System.out.println("Dime el nombre del usuario");
        respuesta = s.next();
        if (respuesta.length() < 3){
            throw new InputMismatchException("El número de bastidor debe contener mínimo 4 caracteres");
        }else {
            usuario.setNombreUsuario(respuesta);
        }
        usuario.setNombreUsuario(respuesta);

        System.out.println("Dime la contraseña del usuario");
        respuesta = s.next();
        usuario.setContraseña(respuesta);

        AlmacenDeDatos.getUsuarioRepository().save(usuario);

        return usuario;
    }

    public Optional<Usuario> modificarUsuario() {

        Scanner s = new Scanner(System.in);
        Optional<Usuario> usuario = findUsuario();

        if(usuario.isPresent()) {
            System.out.println("Datos del usuario a modificar");
            System.out.println("Correo Electrónico: " + usuario.get().getCorreoElectronico());
            System.out.println("Nombre Usuario: " + usuario.get().getNombreUsuario());
            System.out.println("Contraseña: " + usuario.get().getContraseña());


            // Nuevos datos del usuario (modificado)
            System.out.println("Nuevo Correo del usuario: ");
            String nuevoCorreo = s.nextLine().trim();
            System.out.println("Nuevo Nombre del usuario: ");
            String nuevoNombre = s.nextLine().trim();
            System.out.println("Nueva Contraseña del usuario: ");
            String nuevaContrasenya = s.nextLine().trim();

            // Actualización de los campos del usuario
            if (!nuevoCorreo.isEmpty()) {
                usuario.get().setCorreoElectronico(nuevoCorreo);
            }
            if (!nuevoNombre.isEmpty()) {
                usuario.get().setNombreUsuario(nuevoNombre);
            }
            if (!nuevaContrasenya.isEmpty()) {
                usuario.get().setContraseña(nuevaContrasenya);
            }

            AlmacenDeDatos.getUsuarioRepository().update(usuario.get());

            return usuario;
        } else {
            return Optional.empty();
        }
    }


    public void eliminarUsuario() {
        Optional<Usuario> usuario = findUsuario();
        if(usuario.isPresent()) {
            AlmacenDeDatos.getUsuarioRepository().delete(usuario.get());
            System.out.println("Usuario " + usuario.get().getCorreoElectronico() + " ha sido eliminado");
        } else {
            System.out.println("Usuario no encontrado");
        }
    }

    public void muestraInfoUsuario() {

        System.out.println("Dime el codigo del usuario");
        Scanner s = new Scanner(System.in);
        String id = s.next();
        Optional<Usuario> usuario = AlmacenDeDatos.getUsuarioRepository().findById(id);
        if(usuario.isPresent())
        {
            System.out.println("Correo Electrónico: " + usuario.get().getCorreoElectronico());
            System.out.println("Nombre Usuario" + usuario.get().getNombreUsuario());
            System.out.println("Contraseña: " + usuario.get().getContraseña());
        }
        else {
            System.out.println("Usuario no encontrado");
        }
    }

    public void listarUsuarios() {
        List<Usuario> listaUsuarios = AlmacenDeDatos.getUsuarioRepository().findAll();
        for (Usuario u : listaUsuarios) {
            System.out.println("Correo: " + u.getCorreoElectronico());
            System.out.println("Nombre Usuario: " + u.getNombreUsuario());
            System.out.println("Modelo: " + u.getContraseña());
        }
    }

    public Optional<Usuario> findUsuario() {

        Scanner s = new Scanner(System.in);
        System.out.println("Busca el usuario por su id: ");
        String id = s.next();
        Optional<Usuario> usuario = AlmacenDeDatos.getUsuarioRepository().findById(id);
        if(usuario.isPresent()) {
            return usuario;
        } else {
            System.out.println("Usuario no encontrado");
            return Optional.empty();
        }
    }


}