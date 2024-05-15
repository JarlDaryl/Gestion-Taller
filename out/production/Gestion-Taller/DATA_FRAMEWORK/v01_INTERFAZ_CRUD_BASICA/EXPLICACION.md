# Paso 2: Implementación de una Interfaz CRUD Básica

En este paso, avanzamos en la estructuración del sistema al introducir una interfaz CRUD básica para la gestión de entidades. La interfaz define un conjunto estándar de operaciones CRUD (Crear, Leer, Actualizar, Eliminar) que se pueden aplicar a cualquier tipo de entidad en el sistema.

### `INTERFAZ_VehiculoRepository`

La interfaz `INTERFAZ_VehiculoRepository` define los métodos necesarios para interactuar con los datos de los vehículos, incluyendo guardar, buscar, actualizar y eliminar registros. Esta interfaz proporciona una abstracción genérica que puede ser implementada por diferentes clases de repositorios para manejar los datos de los vehículos de manera coherente.

### `VehiculoRepository`

La clase `VehiculoRepository` implementa la interfaz `INTERFAZ_VehiculoRepository` y proporciona una implementación concreta de los métodos definidos en la interfaz. Utiliza una estructura de datos basada en un `HashMap` para almacenar los vehículos, lo que permite un acceso eficiente a los datos mediante claves únicas (en este caso, la matrícula de cada vehículo).

Aunque esta implementación proporciona una funcionalidad básica para la gestión de vehículos, sigue siendo específica para este tipo de entidad y no es fácilmente reutilizable para otros tipos de datos. Además, puede ser necesario replicar gran parte del código si se desea implementar un repositorio para otra entidad en el sistema.

### Resumen

En resumen, el paso 2 introduce una interfaz CRUD básica y su implementación para la gestión de vehículos en el sistema. Aunque proporciona una funcionalidad inicial para interactuar con los datos, esta implementación sigue siendo específica y limitada en términos de reutilización y flexibilidad.


# Interfaces

Una interfaz en programación es una colección de métodos abstractos que definen un conjunto de comportamientos que una clase puede implementar. En Java, las interfaces permiten definir un contrato que las clases pueden seguir para proporcionar una funcionalidad específica.

## Principales Características de las Interfaces:
 ### Abstracción: 
Las interfaces proporcionan una abstracción que separa la definición del comportamiento de su implementación. Esto permite una mejor organización y estructuración del código.
 ### Polimorfismo:
Las interfaces permiten el polimorfismo, lo que significa que una clase puede implementar múltiples interfaces, lo que le permite tener diferentes comportamientos según el contexto.
### Desacoplamiento: 
El uso de interfaces reduce el acoplamiento entre las clases, lo que facilita la modificación y la extensión del código sin afectar otras partes del sistema.
### Contratos Claros:
Las interfaces definen contratos claros que las clases deben seguir, lo que facilita la comunicación y la colaboración entre diferentes partes del sistema.


### Resumen

Clase e interfaz están diseñadas siguiendo los principios de la programación orientada a objetos 
y proporcionan una manera estructurada de interactuar con y gestionar objetos de tipo Vehiculo. 

La interfaz define un contrato común para operaciones CRUD, mientras que la clase VehiculoRepository
proporciona una implementación concreta de estos métodos para la clase Vehiculo.
