package DATA_FRAMEWORK.v03_REPOSITORIO_GENERICO_V5;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * <p>La clase {@code RepositorioGenerico} representa un repositorio genérico para almacenar entidades de cualquier tipo {@code T} con un identificador único de tipo {@code K}.</p>
 * <p>Este repositorio proporciona métodos CRUD (Crear, Leer, Actualizar, Eliminar) para interactuar con las entidades almacenadas.</p>
 *
 * <p>La implementación de {@code RepositorioGenerico} utiliza un mapa para almacenar las entidades, donde la clave del mapa es el identificador único {@code K} y el valor es la entidad {@code T} correspondiente.</p>
 * <p>Además, utiliza una función ({@code idExtractor}) para extraer el identificador único de una entidad específica. Esta función se pasa como parámetro en el constructor y se utiliza para generar las claves del mapa.</p>
 *
 * <p>Algunos métodos clave de {@code RepositorioGenerico} incluyen:</p>
 * <ul>
 *     <li>{@code save}: Permite guardar una entidad en el repositorio.</li>
 *     <li>{@code findById}: Busca y devuelve una entidad por su identificador único.</li>
 *     <li>{@code findAll}: Devuelve una lista con todas las entidades almacenadas en el repositorio.</li>
 *     <li>{@code update}: Actualiza una entidad existente en el repositorio.</li>
 *     <li>{@code delete}: Elimina una entidad del repositorio.</li>
 * </ul>
 *
 * <p>Es importante tener en cuenta que la clase {@code RepositorioGenerico} es genérica y puede trabajar con cualquier tipo de entidad {@code T} y cualquier tipo de identificador único {@code K}. Esto proporciona una gran flexibilidad y reutilización de código.</p>
 *
 * @param <T> El tipo de entidad que se almacenará en el repositorio.
 * @param <K> El tipo del identificador único de las entidades almacenadas en el repositorio.
 */
public class RepositorioCRUD<T, K> implements INTERFAZ_RepositorioCRUD<T> {

    private Map<K, T> entities;
    private Function<T, K> idExtractor;

    /**
     * Crea una nueva instancia de {@code RepositorioGenerico} con la función de extracción de identificadores especificada.
     *
     * @param idExtractor La función que se utilizará para extraer los identificadores únicos de las entidades.
     */
    public RepositorioCRUD(Function<T, K> idExtractor) {
        this.entities = new HashMap<>();
        this.idExtractor = idExtractor;
    }

    @Override
    public T save(T entity) {
        K id = idExtractor.apply(entity);
        entities.put(id, entity);
        return entity;
    }

    @Override
    public T findById(String id) {
        return entities.get(id);
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(entities.values());
    }

    @Override
    public T update(T entity) {
        K id = idExtractor.apply(entity);
        if (entities.containsKey(id)) {
            entities.put(id, entity);
            return entity;
        } else {
            return null; // Manejo de error si no se encuentra la entidad
        }
    }

    @Override
    public void delete(T entity) {
        K id = idExtractor.apply(entity);
        entities.remove(id);
    }
}
