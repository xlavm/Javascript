# Execution

## js embedded Compilado

Acá el script de js va a estar inmerso en el html

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

## js file compilado

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

## Interpretado

Puedes ir a las herramientas de desarrollador de tu Browser y luego al menu de consola y escribir codigo Javascript, luego este sera interpretado por el navegador y en vivo ejecutara la accion