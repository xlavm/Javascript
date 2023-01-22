# cadenas de texto

  ```JAVA
     //concatenacion
     String name = "Luis Vanegas"
     System.out.println("Mi nombre es: " + name);
     //output: Mi nombre es: Luis Vanegas

     //cantidad de caracteres
     String cadena = "Esta es una prueba";
     System.out.println(cadena.length());
     //output: 18

     //obtener un caracter
     String cadena = "Polimorfismo"; 
     System.out.println(cadena.charAt(4));
     //output: m

     //obtener sub cadena
     String cadena = "Desarrollo Orientado a Objetos";
     System.out.println(cadena.substring(11,20));
     //output: Orientado

     //eliminar espacios en blancos
     String cadena = "      Programación 1  ";
     System.out.println(cadena.trim());
     //output: Programación 1

     //remplazar caracteres
     String cadena = "mamá";
     System.out.println(cadena.replace('m','p'));
     //output: papá

     //remplazar cadena
     String cadena = "Luis Angel";
     System.out.println(cadena.replaceAll("Angel","Vanegas"));
     //output: Luis Vanegas

     //convertir de Mayus a Minus
     String cadena = "JAVA";
     System.out.println(cadena.toLowerCase());
     //output: java

     //convertir de Minus a Mayus
     String cadena = "java";
     System.out.println(cadena.toUpperCase());
     //output: JAVA

     //comparar cadena
     String cadena1 = "alajuela", cadena2 = "Alajuela";
     System.out.println(cadena1.equals(cadena2));
     //output: false

     //comparar cadena ignorando mayus o minus
     String cadena1 = "alajuela", cadena2 = "Alajuela";
     System.out.println(cadena1.equalsIgnoreCase(cadena2));
     //output: true

     //OTROS METODOS
     //bolean isLetter(char caracter)) 
     //Retorna un verdadero si el carácter del parámetro es una letra

     //bolean isDigit(char caracter)) 
     //Retorna un verdadero si el carácter del parámetro es un dígito

     //bolean isUpperCase(char caracter) 
     //Retorna un verdadero si el carácter del parámetro es una letra mayúscula

     //boolean isLowerCase(char caracter) 
     //Retorna un verdadero si el carácter del parámetro es una letra minúscula
  ```
