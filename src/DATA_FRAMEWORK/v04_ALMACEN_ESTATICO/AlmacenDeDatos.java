package DATA_FRAMEWORK.v04_ALMACEN_ESTATICO;

import entidades.Vehiculo;

/***
 * <p>
 * La clase AlmacenDeDatos ha sido diseñada para proporcionar un punto centralizado de acceso a los datos de la aplicación.
 * Su objetivo principal es gestionar y almacenar los datos de forma organizada, permitiendo a otras partes del sistema interactuar con ellos de manera eficiente y coherente.
 * <p>
 * ¿Por qué se ha creado así?
 * <p>
 *  - Centralización de los datos: La clase AlmacenDeDatos actúa como un repositorio centralizado donde se almacenan todos los datos importantes de la aplicación. Esto simplifica la gestión de los datos y evita la dispersión de la lógica de acceso a los mismos en diferentes partes del código.
 * <p>
 *  - Abs1tracción de la capa de datos: Al encapsular la lógica de acceso a los datos en una sola clase, se crea una capa de abstracción que permite a otras partes del sistema interactuar con los datos de manera independiente de su implementación subyacente. Esto facilita la modularidad y el mantenimiento del código.
 * <p>
 *  - Flexibilidad y escalabilidad: La estructura de la clase AlmacenDeDatos está diseñada para ser flexible y escalable, lo que permite añadir nuevas funcionalidades y adaptarse a cambios en los requisitos de la aplicación sin necesidad de reescribir gran parte del código existente.
 * <p>
 *  - Seguridad y consistencia de los datos: Al centralizar la gestión de los datos en una sola clase, se facilita la implementación de mecanismos de seguridad y garantiza la consistencia de los datos en toda la aplicación. Esto es fundamental para mantener la integridad de los datos y prevenir posibles errores o inconsistencias.
 *
 */

public class AlmacenDeDatos {

    /**
     * Repositorio de vehículos utilizando la clase RepositorioCRUDGenericoEvolucion.
     * Esta implementación utiliza la clase genérica RepositorioCRUDGenericoEvolucion que acepta dos parámetros genéricos,
     * el tipo de entidad (Vehiculo) y el tipo de ID (String). Se inicializa con una función lambda que extrae la
     * matrícula del vehículo como identificador único. Esta implementación proporciona flexibilidad al permitir
     * definir el tipo de entidad y el tipo de ID en tiempo de ejecución.
     */
    private static final RepositorioCRUD<Vehiculo, String> vehiculoRepository =
            new RepositorioCRUD<>(Vehiculo::getMatricula);


    /**
     * Devuelve el repositorio de vehículos que utiliza la implementación RepositorioCRUDGenericoEvolucion.
     * @return Instancia de RepositorioCRUDGenericoEvolucion.
     */
    public static RepositorioCRUD<Vehiculo, String> getVehiculoRepository() {
        return vehiculoRepository;
    }

}