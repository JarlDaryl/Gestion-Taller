package DATA_FRAMEWORK.v02_INTERFAZ_CRUD_GENERICA;

import entidades.Vehiculo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VehiculoRepository implements INTERFAZ_RepositorioCRUD<Vehiculo> {

    private Map<String, Vehiculo> vehiculos;

    public VehiculoRepository() {
        this.vehiculos = new HashMap<>();
    }

    @Override
    public Vehiculo save(Vehiculo vehiculo) {
        vehiculos.put(vehiculo.getMatricula(), vehiculo);
        return vehiculo;
    }

    @Override
    public Vehiculo findById(String matricula) {
        return vehiculos.get(matricula);
    }

    @Override
    public List<Vehiculo> findAll() {
        return new ArrayList<>(vehiculos.values());
    }

    @Override
    public Vehiculo update(Vehiculo vehiculo) {
        if (vehiculos.containsKey(vehiculo.getMatricula())) {
            vehiculos.put(vehiculo.getMatricula(), vehiculo);
            return vehiculo;
        } else {
            return null; // Manejo de error si no se encuentra el vehículo
        }
    }

    @Override
    public void delete(Vehiculo vehiculo) {
        vehiculos.remove(vehiculo.getMatricula());
    }
}
