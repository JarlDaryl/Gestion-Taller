package DATA_FRAMEWORK.v03_REPOSITORIO_GENERICO_V4;

import DATA_FRAMEWORK.v02_INTERFAZ_CRUD_GENERICA.INTERFAZ_RepositorioCRUD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class RepositorioCRUD<T> implements INTERFAZ_RepositorioCRUD<T> {

    private Map<String, T> entities;
    private Function<T, String> idExtractor;

    public RepositorioCRUD(Function<T, String> idExtractor) {
        this.entities = new HashMap<>();
        this.idExtractor = idExtractor;
    }

    @Override
    public T save(T entity) {
        String id = idExtractor.apply(entity);
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
        String id = idExtractor.apply(entity);
        if (entities.containsKey(id)) {
            entities.put(id, entity);
            return entity;
        } else {
            return null; // Manejo de error si la entidad no existe
        }
    }

    @Override
    public void delete(T entity) {
        String id = idExtractor.apply(entity);
        entities.remove(id);
    }
}
