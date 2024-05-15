# Paso 5: Repositorio Genérico con Función Extractora de ID

En este paso, hemos llevado nuestro repositorio genérico de vehículos un paso más allá al introducir una función extractor de ID más genérica. Sin embargo, al considerar la posibilidad de diferentes tipos de IDs para diferentes objetos, surgen desafíos que debemos abordar.

## Problema con IDs diferentes para diferentes objetos

En nuestro contexto, estamos utilizando una función extractor de ID para extraer el ID de cada vehículo. Sin embargo, al considerar la posibilidad de que diferentes objetos tengan diferentes tipos de ID, nos enfrentamos a un desafío significativo en la consistencia del repositorio.

### 1. Inconsistencia en el tipo de ID

Al utilizar una función extractor de ID que espera un tipo específico de ID (como `String`), nos enfrentamos a problemas cuando intentamos utilizar el mismo repositorio para entidades que tienen diferentes tipos de ID. Por ejemplo, si en el futuro añadimos una entidad como `Cliente`, cuyo ID puede ser de tipo `Integer`, no podremos reutilizar la misma función extractor de ID.

### 2. Limitación en la flexibilidad del repositorio

Esta limitación en la flexibilidad del repositorio se hace evidente cuando queremos utilizar funciones lambda para agregar flexibilidad. Las funciones lambda requieren un tipo consistente de parámetros y resultados. Si estamos tratando con diferentes tipos de IDs, no podemos usar una única función lambda para extraer el ID de diferentes entidades.

### 3. Complejidad en la gestión de IDs

Al tener diferentes tipos de IDs, la gestión de los mismos en el repositorio se vuelve más compleja. Esto puede llevar a errores difíciles de detectar y depurar, especialmente en aplicaciones más grandes y complejas, donde la consistencia de los datos es crucial.

## Limitación de la Solución Actual

Aunque la introducción de la clase `IdExtractor` nos proporciona una abstracción genérica para la extracción de IDs, esta solución tiene una limitación importante: no podemos crear un `IdExtractor` genérico de una manera sencilla. Debido a la necesidad de proporcionar una implementación real dentro del método `apply`, nos vemos obligados a crear múltiples clases `IdExtractor` para cada tipo de entidad con un tipo específico de ID, lo que resulta en la duplicación de código y un diseño menos flexible.

```java
/**
 * Clase encargada de extraer el ID de una entidad.
 *
 * @param <T> Tipo de la entidad.
 * @param <K> Tipo del ID de la entidad.
 */
public class IdExtractor<T, K> implements Function<T, K> {

    /**
     * Interfaz funcional que define la función de extracción de ID.
     *
     * @param entity Entidad de la cual se extraerá el ID.
     * @return ID de la entidad.
     */
    @Override
    public K apply(T entity) {
        // Implementación real debe ser provista por el usuario
        return null;
    }
}
