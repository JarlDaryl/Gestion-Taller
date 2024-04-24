package DATA_FRAMEWORK.v03_REPOSITORIO_GENERICO_V6;

import entidades.Cliente;

public class ClienteRepository extends RepositorioCRUD<Cliente, String> {

    public ClienteRepository() {

        super(Cliente::getCodigoCliente);
    }
}
