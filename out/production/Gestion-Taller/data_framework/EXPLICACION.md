## INCLUSION DE LA CLASE OPTIONAL en RepositorioCRUD

 ### findById(K id): 
 - Ahora devuelve un Optional<T>. Esto permite a los llamadores manejar el caso de una entidad no encontrada de manera más funcional y segura, utilizando métodos como ifPresent() o orElseThrow() para controlar la ausencia de un valor.

 ### update(T entity): 

  - Devuelve un Optional<T>. Si la entidad existe, se actualiza y se devuelve dentro de un Optional. Si no, se devuelve un Optional vacío, lo que permite a los llamadores manejar este caso sin tener que verificar si el valor retornado es null.
