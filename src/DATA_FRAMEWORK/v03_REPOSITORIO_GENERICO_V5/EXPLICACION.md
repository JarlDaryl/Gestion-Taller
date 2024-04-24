### Paso 8: Cambio en la Implementación del Constructor en `VehiculoRepository`

En este paso, hemos mejorado la flexibilidad del repositorio de vehículos al cambiar la implementación de la función extractor de ID a una función lambda. Además, ahora pasamos la función lambda como argumento al constructor de `VehiculoRepository`.

#### Cambio en la Implementación

Anteriormente, la función extractor de ID se definía como una instancia de `Function<Vehiculo, String>` dentro del método `main`. Ahora, utilizamos una función lambda para definir la lógica de extracción del identificador de un vehículo directamente en el momento de la creación del repositorio.

```java
Function<Vehiculo, String> idExtractor = vehiculo -> vehiculo.getMatricula();

VehiculoRepository vehiculoRepository1 = new VehiculoRepository(idExtractor);
VehiculoRepository vehiculoRepository2 = new VehiculoRepository(idExtractor);
```

## Ventajas de Usar Funciones Lambda

- **Concisión y Claridad:** Las funciones lambda permiten definir comportamientos de manera más concisa y clara en comparación con las implementaciones tradicionales utilizando clases anónimas o métodos separados.

- **Flexibilidad:** Al utilizar funciones lambda, podemos definir la lógica de manera más flexible y adaptativa en el momento de la creación del repositorio. Esto nos permite cambiar la lógica de extracción del identificador según las necesidades específicas de cada instancia del repositorio.

- **Reducción de Código:** Las funciones lambda pueden reducir la cantidad de código necesario para lograr un comportamiento específico, lo que mejora la legibilidad y facilita el mantenimiento del código.

En resumen, el uso de funciones lambda en el constructor de `VehiculoRepository` proporciona una forma más flexible y concisa de definir la lógica de extracción del identificador de un vehículo, lo que mejora la claridad y la adaptabilidad del código.
