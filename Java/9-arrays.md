# Arrays

1. Declarar, inicializar y listar valores

    ```JAVA
    //declarar
    int[] numero = new int[4];
    //declarar e inicializar
    int[] numero = {2, -4, 15, -25};

    //listar
    for (int i=0; i < numero.length; i++){
        System.out.println(numero[i]);
    }
    // salida: 2 -4 15 -25
    ```

2. Modificar valor

    ```JAVA
    int[] numero = {2, -4, 15, -25};
    numero[3] = 500;
    System.out.println(numero[3]);
    // salida: 500
    ```

## Multidimensional Arrays

```JAVA
//declarar e inicializar
double[][] arrayBi={{1,2,3},{4,5,6}};

//listar
for (int i=0; i < arrayBi.length; i++) {//filas
    for (int j=0; j < arrayBi[i].length; j++) {//columnas
        System.out.print(arrayBi[i][j]+"\t");
    }
    System.out.println("");
}

//agregar
for (int i=0; i < arrayBi.length; i++) {//filas
    for (int j=0; j < arrayBi[i].length; j++) {//columnas
        if (i==1 && j==1){
            arrayBi[i][j] = 500; //agregamos en la fila i columna j
        }
    }
}

```
