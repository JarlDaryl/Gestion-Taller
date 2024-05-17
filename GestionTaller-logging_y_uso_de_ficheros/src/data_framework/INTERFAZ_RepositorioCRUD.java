package data_framework;

import java.util.List;
import java.util.Optional;

public interface INTERFAZ_RepositorioCRUD<T> {
    Optional<T> save(T entity);
    Optional<T> findById(String id);
    List<T> findAll();
    Optional<T> update(T entity);
    void delete(T entity);
}


