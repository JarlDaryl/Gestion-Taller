# Paso 7: Mejora en la Flexibilidad del Repositorio de Vehículos. Uso de Funcion Dinámica en el Constructor de VehiculoRepository

En este paso, hemos mejorado la flexibilidad del repositorio de vehículos al permitir la especificación dinámica de la función extractor de ID en el momento de la creación del repositorio. En lugar de depender de una función extractor de ID estática definida dentro de la clase VehiculoRepository, ahora podemos pasar cualquier función extractor de ID al constructor del repositorio.

Anteriormente, La función extractor de ID se definía dentro del cuerpo de la clase VehiculoRepository, no dentro del método main. Esto significa que estaba estáticamente definida en la clase y no podía cambiarse dinámicamente en el momento de la creación del repositorio.

En la nueva implementación, ahora pasamos la función extractor de ID como argumento al constructor de VehiculoRepository, lo que nos brinda la flexibilidad de definirla y configurarla de manera dinámica en el momento de la creación del repositorio. Esto nos permite adaptar la lógica de extracción del identificador de un vehículo según las necesidades específicas de cada instancia del repositorio.

```java
// Crear un repositorio de vehículos
Function<Vehiculo, String> idExtractor = new Function<Vehiculo, String>() {
    @Override
    public String apply(Vehiculo vehiculo) {
        return vehiculo.getMatricula();
    }
};

// Crear instancias de VehiculoRepository con la función extractor de ID personalizada
VehiculoRepository vehiculoRepository1 = new VehiculoRepository(idExtractor);
VehiculoRepository vehiculoRepository2 = new VehiculoRepository(idExtractor);
```


En la clase VehiculoRepository, el constructor ahora acepta una función extractor de ID como parámetro y la pasa al constructor de la clase base RepositorioCRUD<Vehiculo>. Esto proporciona una manera flexible de definir la lógica de extracción del identificador de un vehículo en el momento de la creación del repositorio.

```java
public class VehiculoRepository extends RepositorioCRUD<Vehiculo> {

    public VehiculoRepository(Function<Vehiculo, String> idExtractor) {
        super(idExtractor);
    }
}
```
Esta mejora en la flexibilidad del repositorio de vehículos ofrece varias ventajas:

- **Concisión y Legibilidad** : Al permitir la definición de la función extractor de ID en el momento de la creación del repositorio, el código se vuelve más conciso y legible.
- **Flexibilidad**: La capacidad de pasar cualquier función extractor de ID al constructor del repositorio hace que el repositorio sea más flexible y adaptable a diferentes contextos.
- **Reutilización**: Esta implementación permite reutilizar el mismo repositorio de vehículos con diferentes funciones extractor de ID, lo que promueve la modularidad y la reutilización del código.