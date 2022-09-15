# Basics


## js embedded

Acá el script de js va a estar inmerso en el hmtml

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

## js file

Se crean 2 archivos que trabajaran juntos, `index.html` y `script.js`

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

## comments

   ```JS
   // comentario de una linea

   /* comentario
   de
   varias lineas */
   ```

---

## variables and data types

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

## operators

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

## cadenas de texto

template literales
        
En cadenas de texto se debe usar **``** y **${variable}** para concatenar variables

  ```JS
    const nombre = 'Luis'
    console.log (`La edad de ${nombre} es: 16`)
    // output: La edad de Luis es: 16
  ```
