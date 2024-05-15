# Paso 4: Repositorio Genérico con Extractor de ID

En este paso, hemos introducido un extractor de ID independiente en nuestro sistema de repositorios, lo que nos permite mejorar la abstracción y la reutilización del código.


## Cambios Realizados

1. **Implementación de un Repositorio Genérico:** Hemos refactorizado nuestro repositorio de vehículos para que sea más genérico y pueda manejar cualquier tipo de entidad. Para lograr esto, hemos introducido la interfaz `INTERFAZ_RepositorioCRUD`, que define las operaciones CRUD estándar para cualquier tipo de entidad. Luego, hemos adaptado `VehiculoRepository` para que implemente esta interfaz, lo que le permite manejar entidades de cualquier tipo.

2. **Introducción de VehiculoIdExtractor:** Hemos creado la clase `VehiculoIdExtractor` para encapsular la lógica de extracción del ID de un vehículo. Esta clase implementa la interfaz `Function<Vehiculo, String>`, lo que le permite ser utilizada como una función para extraer el ID de un vehículo dado. Al separar esta funcionalidad en una clase independiente, mejoramos la cohesión y la reutilización del código.

3. **Utilización de VehiculoIdExtractor en VehiculoRepository:** En `VehiculoRepository`, hemos modificado el constructor para aceptar un `Function<Vehiculo, String>` como parámetro. Este extractor de ID se utiliza internamente en los métodos del repositorio para obtener el ID de un vehículo antes de realizar operaciones como guardar, buscar, actualizar o eliminar.

## Beneficios de los Cambios

- **Mejora la Reutilización del Código:** La introducción de un repositorio genérico y un extractor de ID independiente nos permite reutilizar fácilmente estas funcionalidades en diferentes partes del sistema. Ahora, podemos crear repositorios para cualquier tipo de entidad sin necesidad de duplicar código.

- **Facilita la Adaptabilidad del Sistema:** Gracias a la abstracción proporcionada por el repositorio genérico y el extractor de ID, nuestro sistema es más flexible y adaptable a futuros cambios. Si necesitamos agregar nuevas entidades o modificar la forma en que se extrae el ID de una entidad, podemos hacerlo con facilidad sin afectar otras partes del código.

- **Promueve la Modularidad:** La separación de la lógica de extracción de ID en una clase independiente mejora la modularidad del sistema al reducir la dependencia entre diferentes componentes. Cada clase tiene una responsabilidad clara y puede ser modificada o reemplazada fácilmente sin afectar el funcionamiento de otras partes del sistema.


En resumen, los cambios realizados en este paso nos permiten crear un sistema más robusto, flexible y fácil de mantener, al mismo tiempo que promueven las mejores prácticas de diseño y programación.


## VehiculoIdExtractor

La clase `VehiculoIdExtractor` se encarga de extraer el ID de un vehículo. Implementa la interfaz `Function<Vehiculo, String>`, lo que significa que toma un objeto de tipo `Vehiculo` como entrada y devuelve un `String` como salida. En este caso, el ID del vehículo se extrae de su matrícula. Esta abstracción nos permite separar la lógica de extracción de ID del repositorio, haciéndolo más flexible y reutilizable.

## VehiculoRepository

La clase `VehiculoRepository` implementa la interfaz `INTERFAZ_RepositorioCRUD<Vehiculo>`, proporcionando así un repositorio genérico para la gestión de vehículos. Utiliza un `HashMap` interno para almacenar los vehículos, utilizando el ID extraído por `VehiculoIdExtractor` como clave. Al pasar una función extractor de ID al constructor, el repositorio puede manejar diferentes tipos de IDs de manera consistente, lo que aumenta su flexibilidad y adaptabilidad.

En resumen, al introducir un extractor de ID independiente y utilizarlo en nuestro repositorio genérico, hemos mejorado la modularidad y la reutilización del código, preparando el terreno para futuras expansiones y mejoras en nuestro sistema de gestión de datos.

