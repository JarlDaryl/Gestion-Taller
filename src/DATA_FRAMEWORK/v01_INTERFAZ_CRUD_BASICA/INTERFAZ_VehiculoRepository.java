package DATA_FRAMEWORK.v01_INTERFAZ_CRUD_BASICA;

import entidades.Vehiculo;

import java.util.List;

public interface INTERFAZ_VehiculoRepository {
    Vehiculo save(Vehiculo vehiculo);
    Vehiculo findById(String matricula);
    List<Vehiculo> findAll();
    Vehiculo update(Vehiculo vehiculo);
    void delete(Vehiculo vehiculo);
}
