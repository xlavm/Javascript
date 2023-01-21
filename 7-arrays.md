# Arrays

1. Mostrar y editar valores especificos

    ```JS
    const array1 = [1,2,3,4,5]
    const array2 = new Array(5,4,3,2,1)

    console.log(`Array 1: ${array1}`)
    // output: array1: 1,2,3,4,5

    console.log(`Array 2: ${array2}`)
    // output: array2: 5,4,3,2,1

    console.log(`valor de posición 2 de array2: ${array2[2]}`)
    // output: valor de posición 2 de array2: 3

    array1[4] = 500
    console.log(`el nuevo valor de la posición 4 de array1 es: ${array1[4]}`)
    // output: el nuevo valor de la posición 4 de array1 es: 500
    ```

2. Insertar valor

    ```JS
    const array = ['a','b','c',]

    array.push('d')

    console.log(array)
    // output: ["a","b","c","d"]

    console.log(array.toString())
    // output: a,b,c,d
    ```

3. Eliminar valor

    ```JS
    const array = ['a','b','c',]

    array.pop()

    console.log(array)
    // output: ["a","b"]

    console.log(array.toString())
    // output: a,b
    ```

4. Listar valores

    ```JS
    const array = ['a','b','c',]

    let i = 0
    while(i < array.length){
        console.log(array[i])
        i++
    }
    // output: a b c


    for(let i=0; i < array.length; i++){
        console.log(array[i])
    }
    // output: a b c
    ```

## Multidimensional Arrays

```JS
const arrayBi = [[1,2,3],[4,5,6]]

console.log(arrayBi[0][2])
// output: 3

console.log(arrayBi[1][2])
// output: 6
```
