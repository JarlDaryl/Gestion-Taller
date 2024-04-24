# Paso 3: Abstracción del Repositorio con Tipos Genéricos

En este paso, se introduce una abstracción más genérica para el repositorio de vehículos utilizando tipos genéricos. Esto permite crear una implementación única del repositorio que pueda manejar cualquier tipo de entidad, en lugar de estar limitada específicamente a los vehículos.

La interfaz `RepositorioCRUD<T>` define un conjunto estándar de operaciones CRUD (Crear, Leer, Actualizar, Eliminar) que pueden aplicarse a cualquier tipo de entidad `T`. Esta abstracción genérica proporciona una base común para la implementación de repositorios de diferentes tipos de datos en el sistema.

La clase `VehiculoRepository` implementa la interfaz `RepositorioCRUD<Vehiculo>` utilizando tipos genéricos. Utiliza un `Map` para almacenar los vehículos, donde la clave es una cadena que representa la matrícula de cada vehículo y el valor es el propio vehículo. Los métodos de la clase proporcionan la funcionalidad estándar para guardar, buscar, actualizar y eliminar vehículos del repositorio.

Esta implementación representa un avance significativo en la abstracción y reutilización del código, ya que permite gestionar cualquier tipo de entidad utilizando una única implementación del repositorio. Además, al utilizar tipos genéricos, se promueve la flexibilidad y la modularidad del sistema, ya que se pueden añadir fácilmente nuevos tipos de repositorios sin necesidad de cambiar la lógica subyacente.

En resumen, el paso 3 introduce una abstracción más genérica para el repositorio de vehículos utilizando tipos genéricos. Esta implementación proporciona una base común para la gestión de datos en el sistema y promueve la flexibilidad y la reutilización del código en el desarrollo del software.



# Tipos Genéricos


Los tipos genéricos en programación son una característica que permite escribir código flexible y reutilizable al permitir trabajar con tipos que aún no se han especificado. En Java, los tipos genéricos se introdujeron en la versión 5 para proporcionar una forma de crear clases, interfaces y métodos que operen con un tipo específico de datos sin especificar el tipo real hasta el momento de su uso.

## Principales Características de los Tipos Genéricos:

### Flexibilidad y Reutilización: 
Los tipos genéricos permiten escribir código que puede funcionar con cualquier tipo de datos, lo que aumenta la flexibilidad y la reutilización del código.

### Seguridad de Tipos: 
Ayudan a detectar errores de tipo en tiempo de compilación, lo que significa que los errores relacionados con los tipos de datos se detectan antes de que se ejecute el programa.

### Eliminación de Casting (Fundición): 
Los tipos genéricos eliminan la necesidad de realizar fundiciones manuales (casting) al recuperar datos de las estructuras de datos, lo que hace que el código sea más limpio y menos propenso a errores.

### Abstracción: 
Los tipos genéricos permiten crear abstracciones que operan de manera independiente del tipo de datos subyacente, lo que facilita la creación de componentes y bibliotecas genéricas.



# Interfaz RepositorioCRUD< T >

Esta interfaz define un conjunto de operaciones básicas para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en una colección de objetos de tipo T.

Su objetivo principal es definir un contrato estándar para la manipulación de datos en el contexto de la aplicación. 

Al proporcionar métodos comunes como save, findById, findAll, update y delete, la interfaz establece un conjunto coherente de operaciones que pueden ser implementadas por cualquier clase que actúe como un repositorio de datos.

Este enfoque orientado a interfaces promueve la interoperabilidad y la flexibilidad en el diseño de la aplicación, permitiendo que diferentes componentes interactúen entre sí de manera eficiente y coherente. 

Además, al utilizar tipos genéricos, la interfaz puede adaptarse fácilmente para trabajar con una amplia variedad de tipos de datos sin requerir cambios significativos en su implementación.


### Método save(T entity): 
Guarda un objeto de tipo T en el repositorio y devuelve el objeto guardado.
### Método findById(String id): 
Busca y devuelve un objeto de tipo T que coincide con el ID proporcionado.
### Método findAll(): 
Devuelve una lista de todos los objetos de tipo T almacenados en el repositorio.
### Método update(T entity): 
Actualiza un objeto de tipo T existente en el repositorio con los datos del objeto proporcionado y devuelve el objeto actualizado.
### Método delete(T entity): 
Elimina un objeto de tipo T del repositorio.


# Clase VehiculoRepositoryCRUD
Esta clase implementa la interfaz RepositorioCRUD para operar con objetos de tipo Vehiculo. Aquí están los fundamentos de programación que se aplican en esta clase:

### Colecciones de Datos (Map y List): 
Se utiliza una colección de tipo Map para almacenar los vehículos, donde la clave es la matrícula del vehículo y el valor es el objeto Vehiculo correspondiente. Se utiliza una lista para devolver todos los vehículos almacenados en el repositorio.

### Constructor: 
Se define un constructor que inicializa la colección de vehículos como un nuevo HashMap.

### Implementación de Métodos CRUD:
 
 - save: Agrega un nuevo vehículo al repositorio.
 - findById: Busca un vehículo por su matrícula y lo devuelve.
 - findAll: Devuelve una lista de todos los vehículos almacenados.
 - update: Actualiza un vehículo existente en el repositorio.
 - delete: Elimina un vehículo del repositorio. 

### Manejo de Errores: 
En el método update, se maneja el caso en que no se encuentre un vehículo con la matrícula proporcionada.
En resumen, estas clases y la interfaz están diseñadas siguiendo los principios de la programación orientada a objetos y proporcionan una manera estructurada de interactuar con y gestionar objetos de tipo Vehiculo. La interfaz define un contrato común para operaciones CRUD, mientras que la clase VehiculoRepositoryCRUD proporciona una implementación concreta de estos métodos para la clase Vehiculo.


# Ventajas y rendimiento

El uso de tipos genéricos puede tener un impacto en el rendimiento de una aplicación, pero en general, este impacto suele ser mínimo y suele compensarse con la flexibilidad y la capacidad de reutilización que proporcionan los tipos genéricos.

Algunos puntos a considerar sobre el rendimiento al usar tipos genéricos:

### Boxing y Unboxing:
Cuando se utilizan tipos genéricos con tipos primitivos, puede ocurrir boxing (envoltura del tipo primitivo en un objeto) y unboxing (extracción del valor primitivo del objeto). Esto puede introducir una pequeña sobrecarga en términos de rendimiento.
### Resolución de tipos en tiempo de ejecución:
En Java, los tipos genéricos se manejan mediante la eliminación de tipos en tiempo de compilación, lo que significa que la información sobre los tipos genéricos se elimina durante la compilación y no está disponible en tiempo de ejecución. Esto puede resultar en un rendimiento ligeramente inferior en comparación con las implementaciones específicas de tipo.
### Código más limpio y mantenible:
Aunque puede haber un ligero impacto en el rendimiento, el uso de tipos genéricos puede mejorar la claridad y la mantenibilidad del código, lo que a la larga puede facilitar la optimización del rendimiento.
### Perfilado y optimización:
Si el rendimiento se convierte en un problema en una aplicación específica, es importante realizar pruebas de rendimiento y perfilado para identificar los cuellos de botella y las áreas que pueden beneficiarse de una optimización. En algunos casos, la refactorización para eliminar o reducir el uso de tipos genéricos puede ser una opción de optimización.


### Conclusión
En resumen, si bien el uso de tipos genéricos puede tener un impacto en el rendimiento, este impacto suele ser mínimo en la mayoría de los casos y se compensa con los beneficios de flexibilidad y reutilización que proporcionan los tipos genéricos. Siempre es importante equilibrar la claridad del código y la mantenibilidad con el rendimiento, y realizar optimizaciones solo cuando sea necesario y respaldado por pruebas de rendimiento.
