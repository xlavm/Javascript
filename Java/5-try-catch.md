# Capturador de errores

- Try: va el bloque de codigo a evaluar.
- Catch: va el comportamiento que tomará el programa si hay un error.
- Finally: va el bloque de codigo que se ejecutará si hay o no error (siempre se ejecutará).

1. Capturador simple

    ```JAVA
    try {
        System.out.println("Bloque de Codigo a Evaluar");
    }
    catch (Exception e) {
        System.out.println("Instrucciones a ejecutar cuando se produce un error");
    }
    finally {
        System.out.println("Instrucciones a ejecutar tanto si se producen errores como si no.");
    }
    ```

2. Capturador multiple

    ```JAVA
    try {

    }catch( ArithmeticException e ) {
               
    }catch( Exception e ) {
              
    }
    ```
