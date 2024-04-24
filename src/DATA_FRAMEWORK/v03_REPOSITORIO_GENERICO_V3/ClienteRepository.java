package DATA_FRAMEWORK.v03_REPOSITORIO_GENERICO_V3;
import entidades.Cliente;

import java.util.function.Function;


/**
 * Clase que implementa un repositorio CRUD específico para la entidad Cliente.
 * Extiende la clase genérica RepositorioCRUD y utiliza una función extractor de ID para extraer el código de cliente.
 */
public class ClienteRepository extends RepositorioCRUD<Cliente> {

    private static Function<Cliente, String> idExtractor = cliente -> cliente.getCodigoCliente();

    public ClienteRepository() {
        super(idExtractor);
    }
}
