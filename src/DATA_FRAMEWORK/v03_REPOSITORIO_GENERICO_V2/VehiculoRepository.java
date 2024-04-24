package DATA_FRAMEWORK.v03_REPOSITORIO_GENERICO_V2;

import entidades.Vehiculo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * Repositorio de vehículos que implementa la interfaz INTERFAZ_RepositorioCRUD.
 */
public class VehiculoRepository implements INTERFAZ_RepositorioCRUD<Vehiculo> {

    private Map<String, Vehiculo> vehiculos;
    private Function<Vehiculo, String> idExtractor;

    /**
     * Constructor de la clase VehiculoRepository.
     * Inicializa el repositorio de vehículos y el extractor de IDs.
     * @param idExtractor Función para extraer el ID del vehículo.
     */
    public VehiculoRepository(Function<Vehiculo, String> idExtractor) {
        this.vehiculos = new HashMap<>();
        this.idExtractor = idExtractor;
    }

    // Implementación de los métodos de la interfaz INTERFAZ_RepositorioCRUD

    @Override
    public Vehiculo save(Vehiculo vehiculo) {
        String id = idExtractor.apply(vehiculo);
        vehiculos.put(id, vehiculo);
        return vehiculo;
    }

    @Override
    public Vehiculo findById(String id) {
        return vehiculos.get(id);
    }

    @Override
    public List<Vehiculo> findAll() {
        return new ArrayList<>(vehiculos.values());
    }

    @Override
    public Vehiculo update(Vehiculo vehiculo) {
        String id = idExtractor.apply(vehiculo);
        if (vehiculos.containsKey(id)) {
            vehiculos.put(id, vehiculo);
            return vehiculo;
        } else {
            return null; // Manejo de error si no se encuentra el vehículo
        }
    }

    @Override
    public void delete(Vehiculo vehiculo) {
        String id = idExtractor.apply(vehiculo);
        vehiculos.remove(id);
    }
}
