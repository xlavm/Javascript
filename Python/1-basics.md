# Basics

## comments

   ```PY
   # comentario de una linea

   """ comentario
   de
   varias lineas """
   ```

---

## variables and data types

- data types

     ```py
     #primitivos
     entero = 1
     flotante = 1.0304
     booleano = True
     cadena = 'esta es una cadena'
     

     #compuestos
     listas = [0,1,2]
     tuplas = ('hola', 7)
     diccionariosOHash = {'clave': 123, 'color': 'rojo'}

     #especiales
     const vacio = None
     ```

- variables y Constantes

    una constante se diferencia de una variable, porque esta es en Mayuscula

    ```JS
    variable = 'Luis Vanegas'
    CONSTANTE = 'Luis'
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
     ** potenciacion ej: 12 ** 3 = 1728
     // divicion con resultado numero entero ej: 18 // 5 = 3
     math.pow() exponenciación
     ```

- Logicos

     ```PY
     and
     or
     not
     ```

- Bit a Bit

     ```BASH
     & and
     | or 
     ~ not
     ^ xor
     ```

- Asignacion

     ```BASH
     += equivale a x=x+5
     -= equivale a x=x-5
     *= equivale a x=x*5
     /= equivale a x=x/5
     &= equivale a x=x&5
     //= equivale a x=x//5
     etc..
     ```

---

## cadenas de texto

template literales

En cadenas de texto se debe usar **{}** como **{variable}** para concatenar variables

  ```PY
     name="Luis"
     age="25"
     print("Hi {name}, you age is {age}".format(name=name, age=age))
     # output: Hi Luis, you age is 25
  ```
