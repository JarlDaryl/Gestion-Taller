## Paso 9: Cambio en la Llamada al Constructor en `EjecutaEjemplo`

En este paso, se ha modificado la llamada al constructor en la clase `EjecutaEjemplo` para utilizar una expresión de referencia a método en lugar de la sintaxis lambda anterior.

### Cambio en la Llamada al Constructor

Anteriormente, la función extractor de ID se definía utilizando una sintaxis lambda en la llamada al constructor de `VehiculoRepository` en la clase `EjecutaEjemplo`. Ahora, en su lugar, se ha utilizado una expresión de referencia a método:

```java
Function<Vehiculo, String> idExtractor = Vehiculo::getMatricula;

VehiculoRepository vehiculoRepository1 = new VehiculoRepository(idExtractor);
VehiculoRepository vehiculoRepository2 = new VehiculoRepository(idExtractor);
```

Este cambio hace que el código sea más conciso y legible al eliminar la necesidad de escribir la sintaxis 
completa de la función lambda. 

Además, demuestra cómo las expresiones de referencia a método pueden ser utilizadas de manera efectiva en la 
inicialización de objetos, proporcionando una alternativa elegante a las lambdas para ciertos casos de uso.