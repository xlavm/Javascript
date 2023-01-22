# Execution

## Install

1. ir al sitio: <https://www.oracle.com/co/java/technologies/downloads/#jdk19-windows> y descargar Java JDK
2. instalar el .exe
3. vas a variables de entorno del sistema y en el `path` agregas el path del C - program files - java - jdk - bin

## java file compilado

Se crea el archivo `HolaMundo.java`

- HolaMundo.java:

   ```JAVA
    public class HolaMundo {
        public static void main(String[] args) {
            System.out.println("Hola Mundo por Luis Vanegas");
        }
    }
   ```

Primero se compila el archivo con el comando: `javac HolaMundo.java`

Luego se ejecuta el archivo con el comando: `java HolaMundo` y obtienes como salida: **Hola Mundo por Luis Vanegas**

---

## NO Interpretado

Java es un lenguaje 100% compilado, NO interpretado
