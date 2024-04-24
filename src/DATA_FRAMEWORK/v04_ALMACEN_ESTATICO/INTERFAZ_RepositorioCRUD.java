package DATA_FRAMEWORK.v04_ALMACEN_ESTATICO;

import java.util.List;

public interface INTERFAZ_RepositorioCRUD<T> {
    T save(T entity);
    T findById(String id);
    List<T> findAll();
    T update(T entity);
    void delete(T entity);
}


