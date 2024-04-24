package DATA_FRAMEWORK.v00_REPOSITORIO_CRUD_BASICO;

import entidades.Usuario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>La clase {@code UsuarioRepository} representa un repositorio específico para almacenar usuarios.</p>
 * <p>Este repositorio proporciona métodos CRUD (Crear, Leer, Actualizar, Eliminar) para interactuar con los usuarios almacenados.</p>
 *
 * <p>La implementación de {@code UsuarioRepository} utiliza un mapa para almacenar los usuarios, donde la clave del mapa es la nombreUsuario del usuario y el valor es el usuario correspondiente.</p>
 * <p>Aunque esta implementación cumple con su propósito de gestionar usuarios, presenta algunas limitaciones importantes:</p>
 * <ul>
 *     <li>Limitación de reutilización: El código de {@code UsuarioRepository} no es reutilizable en otros contextos o con otros tipos de entidades. Si se desea crear otro repositorio para almacenar entidades diferentes, sería necesario replicar todo el código de nuevo, lo que puede resultar en redundancia y mantenimiento adicional.</li>
 *     <li>Falta de flexibilidad: La implementación está fuertemente acoplada a la clase {@code Usuario} y a su estructura específica. Esto hace que sea difícil modificar el comportamiento del repositorio o adaptarlo a diferentes tipos de entidades sin realizar cambios significativos en el código.</li>
 *     <li>Dificultad para extender funcionalidades: Agregar nuevas funcionalidades o realizar cambios en la lógica de acceso a los datos puede ser complicado debido a la falta de abstracción y modularidad en el diseño de la clase.</li>
 * </ul>
 *
 * <p>En resumen, {@code UsuarioRepository} proporciona una solución simple y directa para gestionar usuarios, pero carece de la flexibilidad y la reutilización de código que ofrecen los enfoques más genéricos y abstractos.</p>
 */
public class UsuarioRepository {

    private Map<String, Usuario> usuarios;

    /**
     * Crea una nueva instancia de {@code UsuarioRepository}.
     */
    public UsuarioRepository() {
        this.usuarios = new HashMap<>();
    }

    /**
     * Guarda un usuario en el repositorio.
     *
     * @param usuario El usuario que se va a guardar.
     * @return El usuario guardado.
     */
    public Usuario save(Usuario usuario) {
        usuarios.put(usuario.getNombreUsuario(), usuario);
        return usuario;
    }

    /**
     * Busca un usuario por su nombreUsuario.
     *
     * @param nombreUsuario La nombreUsuario del usuario que se busca.
     * @return El usuario encontrado, o {@code null} si no se encuentra.
     */
    public Usuario findById(String nombreUsuario) {
        return usuarios.get(nombreUsuario);
    }

    /**
     * Devuelve una lista con todos los usuarios almacenados en el repositorio.
     *
     * @return Una lista con todos los usuarios.
     */
    public List<Usuario> findAll() {
        return new ArrayList<>(usuarios.values());
    }

    /**
     * Actualiza un usuario en el repositorio.
     *
     * @param usuario El usuario que se va a actualizar.
     * @return El usuario actualizado, o {@code null} si no se encuentra.
     */
    public Usuario update(Usuario usuario) {
        if (usuarios.containsKey(usuario.getNombreUsuario())) {
            usuarios.put(usuario.getNombreUsuario(), usuario);
            return usuario;
        } else {
            return null; // Manejo de error si no se encuentra el usuario
        }
    }

    /**
     * Elimina un usuario del repositorio.
     *
     * @param usuario El usuario que se va a eliminar.
     */
    public void delete(Usuario usuario) {
        usuarios.remove(usuario.getNombreUsuario());
    }


}
