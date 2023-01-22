# Arrays

1. declarar, inicializar y listar valores

    ```JS
    //declarar e inicializar
    const array1 = [1,2,3,4,5]
    const array2 = new Array(5,4,3,2,1)

    //listar
    console.log(`Array 1: ${array1}`)
    // salida: array1: 1,2,3,4,5
    console.log(array1.toString())
    // salida: array1: 1,2,3,4,5
    for(let i=0; i < array1.length; i++){
        console.log(array1[i])
    }
     // salida: 1 2 3 4 5
    ```

2. Modificar valor

    ```JS
    const array1 = [1,2,3,4,5]
    array1[4] = 500
    console.log(`el nuevo valor de la posición 4 de array1 es: ${array1[4]}`)
    // salida: el nuevo valor de la posición 4 de array1 es: 500
    ```

3. Insertar valor

    ```JS
    const array = ['a','b','c',]
    array.push('d')
    console.log(array)
    // salida: ["a","b","c","d"]
    ```

4. Eliminar valor

    ```JS
    const array = ['a','b','c',]
    array.pop()
    console.log(array)
    // salida: ["a","b"]
    ```

## Multidimensional Arrays

```JS
const arrayBi = [[1,2,3],[4,5,6]]
console.log(arrayBi[0][2])
// salida: 3
console.log(arrayBi[1][2])
// salida: 6
```
