package DATA_FRAMEWORK.v03_REPOSITORIO_GENERICO_V5;

import entidades.Vehiculo;

import java.util.function.Function;


public class VehiculoRepository extends RepositorioCRUD<Vehiculo, String> {

    public VehiculoRepository(Function<Vehiculo, String> idExtractor) {
        super(idExtractor);
    }
}
