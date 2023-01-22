# Basics

## comments

   ```JAVA
     /*
     este es un comentario  complejo para un bloque de codigo (no visible en javadoc) 
     */
     //este es un comentario simple para una linea de código
     /**
     * este es un comentario complejo para definición de clases, metodos y atributos 
     * (visible en javadoc)
     */
   ```

---

## variables and data types

- data types

     ```JAVA
        //primitivos
        //enteros
        byte diasMes = 31;
        short diasLustro = (12 *31)* 5;
        int velocidadLuz = 299792458;
        long añoLuz = velocidadLuz * 365;
        //decimales
        float pi = 3.1415926535f;
        double e = 2.718281828459045235360;
        //caracteres
        char letraA = 'a';
        char letraANumerico = 61;
        //booleanos
        boolean verdadero = true;
        boolean falso = false;

        //compuestos
        String cadena = 'esta es una cadena';
        int[] arrayNumerico = new int[4];
        int[] arrayNumerico = {2, -4, 15, -25};
        double[][] arrayBidimensional = new double[4][4];
        ArrayList<String> arrayListCadena = new ArrayList<String>();\
        List<String> listaCadena = new ArrayList();

        //especiales
        int vacio = null
     ```

- variables y Constantes

    ```JAVA
    String variable = 'Luis Vanegas'
    final String constante = 'Luis'
    ```

---

## operators

- Relacionales

     ```BASH
     <
     >
     <=
     >=
     !=
     ==
     ```

- Aritméticos

     ```BASH
     +
     -
     *
     /
     % modulo ej: x=13%5 x=3
     math.pow() exponenciación
     ```

- Logicos

     ```JAVA
     && and
     || or
     ! not
     ```

- Asignacion

     ```BASH
     += equivale a x=x+5
     -= equivale a x=x-5
     *= equivale a x=x*5
     /= equivale a x=x/5
     etc..
     ```

---

## Detener ciclos o romper codigos

- break

    ```JAVA
    break;
    ```
