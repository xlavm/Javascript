# ArrayList y List (Arrays Dinamicos)

## Prerrequisito

Se debe importar las siguientes librerias:

```JAVA
import java.util.ArrayList;
import java.util.Iterator;
```

---

1. Declarar, inicializar y listar valores

    ```JAVA
    //declarar
    ArrayList<String> nombreArrayList = new ArrayList<String>();

    //agregamos elemento
    nombreArrayList.add("Elemento Nuevo");

    //listar
    // declaramos el Iterador e imprimimos los Elementos del ArrayList
    Iterator<String> nombreIterator = nombreArrayList.iterator();
    while(nombreIterator.hasNext()){
        String elemento = nombreIterator.next();
        System.out.print(elemento);
    }  
    // salida: Elemento Nuevo
    ```

2. Insertar valor

    ```JAVA
    // Añade el elemento al ArrayList
    nombreArrayList.add("Elemento");
    // Añade el elemento al ArrayList en la posición 'n'
    nombreArrayList.add(0, "Elemento 2");
    ```

3. Eliminar valor

    ```JAVA
    // Borra el elemento de la posición '5' del ArrayList   
    nombreArrayList.remove(5); 
    // Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro.  
    nombreArrayList.remove("Elemento");
    //Borra todos los elementos de ArrayList   
    nombreArrayList.clear();
    ```

4. Devolver valores

    ```JAVA
    // Devuelve el elemento que esta en la posición '2' del ArrayList
    nombreArrayList.get(2);
    // Devuelve la posición de la primera ocurrencia ('Elemento') en el ArrayList  
    nombreArrayList.indexOf("Elemento");
    // Devuelve la posición de la última ocurrencia ('Elemento') en el ArrayList
    nombreArrayList.lastIndexOf("Elemento");
    // Devuelve el numero de elementos del ArrayList
    nombreArrayList.size();
    // Devuelve True si el ArrayList esta vacio. Sino Devuelve False   
    nombreArrayList.isEmpty(); 
    ```

5. Otras funciones

    ```JAVA
    // Comprueba se existe del elemento ('Elemento') que se le pasa como parametro
    nombreArrayList.contains("Elemento");
    // Copiar un ArrayList 
    ArrayList arrayListCopia = (ArrayList) nombreArrayList.clone();  
    // Pasa el ArrayList a un Array 
    Object[] array = nombreArrayList.toArray();
    ```
