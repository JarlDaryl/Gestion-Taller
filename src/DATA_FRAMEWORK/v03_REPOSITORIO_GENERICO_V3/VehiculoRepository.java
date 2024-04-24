package DATA_FRAMEWORK.v03_REPOSITORIO_GENERICO_V3;

import entidades.Vehiculo;

import java.util.function.Function;

public class VehiculoRepository extends RepositorioCRUD<Vehiculo> {

    private static Function<Vehiculo, String> idExtractor = new Function<Vehiculo, String>() {
        @Override
        public String apply(Vehiculo vehiculo) {
            return vehiculo.getMatricula();
        }
    };

    public VehiculoRepository() {
        super(idExtractor);
    }
}