package DATA_FRAMEWORK.v03_REPOSITORIO_GENERICO_V2;

import java.util.function.Function;

/**
 * Clase encargada de extraer el ID de una entidad.
 *
 * @param <T> Tipo de la entidad.
 * @param <K> Tipo del ID de la entidad.
 */
public class IdExtractor<T, K> implements Function<T, K> {

    /**
     * Interfaz funcional que define la función de extracción de ID.
     *
     * @param entity Entidad de la cual se extraerá el ID.
     * @return ID de la entidad.
     */
    @Override
    public K apply(T entity) {
        // Lógica para extraer el ID de la entidad
        // return entity.getId();
        // qué debo retornar? Matrículas? emails? DNIS?....
        return null; // Implementación real debe ser provista por el usuario
    }
}
