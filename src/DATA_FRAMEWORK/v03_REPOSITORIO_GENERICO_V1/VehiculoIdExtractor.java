package DATA_FRAMEWORK.v03_REPOSITORIO_GENERICO_V1;

import entidades.Vehiculo;

import java.util.function.Function;

/**
 * Clase encargada de extraer el ID de un vehículo.
 */
public class VehiculoIdExtractor implements Function<Vehiculo, String> {

    /**
     * Extrae el ID de un vehículo.
     *
     * @param vehiculo Vehículo del cual se extraerá el ID.
     * @return ID del vehículo.
     */
    @Override
    public String apply(Vehiculo vehiculo) {
        return vehiculo.getMatricula();
    }
}