# Basics

1. js embedded

   ```HTML
   <!DOCTYPE html>
   <html>
       <head>
           <meta charset="utf-8">
           <title>Javascript</title>
       </head>
       <body>
           Hola Mundo!
           <script>
               alert('Hola Mundo')
           </script>
       </body>
   </html>
   ```

---

2. js file

   - index.html:

   ```HTML
   <!DOCTYPE html>
   <html>
       <head>
           <meta charset="utf-8">
           <title>Javascript</title>
       </head>
       <body>
           Hola Mundo!
           <script> src="script.js"</script>
       </body>
   </html>
   ```

   - script.js:

   ```JS
   alert('Hola Mundo')
   ```

---

3. comments

   ```JS
   // comentario de una linea

   /* comentario
   de
   varias lineas */
   ```

---

4. variables and data types

   - data types

     ```JS
     //primitivos
     const cadena = 'Luis Vanegas'
     const numero = 1
     const booleano = true

     //compuestos
     const obj = new Object()
     const array = new Array()

     //especiales
     const esp1 = null
     const esp2 = undefined
     ```

   - var - const - let

     const: no se le puede cambiar el valor, el siguiente es un error
     ```JS
     const nombre = 'Luis Vanegas'
     nombre = 'Luis'
     ```
     usar Let en vez de Var, pero si puedes, usa Const antes que Let porque es mas eficiente (corre mejor y es mas liviana)

---

5. operators

   - Relacionales
     ```
     <
     >
     <=
     >=
     !=
     ==
     === estrictamente igual "tipos de datos iguales"
     ```
   - Matematicos
     ```
     +
     -
     *
     /
     % modulo ej: x=13%5 x=3
     math.pow() exponenciación
     ```
   - Logicos
     ```
     &&
     ||
     !
     ```

---

6. cadenas de texto

    - template literales
        
        En cadenas de texto se debe usar **``** y **${variable}** para concatenar variables
        ```JS
        const nombre = 'Luis'
        console.log (`La edad de ${nombre} es: 16`)
        // output: La edad de Luis es: 16
        ```
