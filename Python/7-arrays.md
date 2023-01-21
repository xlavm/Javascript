# Arrays o Lista

1. Mostrar o listar valores

    ```PY
    miArray = ['valor1', 2, True]
    print(miArray)
    # salida: ['valor1', 2 , True]
    print('valor de posición 2 de miArray es: ', miArray[2])
    # salida: valor de posición 2 de miArray es:  True
    for valor in miArray:
    print(valor)
    """ 
    salida:
    valor1
    2
    True 
    """
    ```

2. Insertar valor

    ```PY
    miArray = ['valor1', 2, True]
    miArray.append('nuevo valor')
    print(miArray)
    # salida: ['valor1', 2, True, 'nuevo valor']
    miArray.insert(2,'valor en 2')
    print(miArray)
    # salida: ['valor1', 2, 'valor en 2', True, 'nuevo valor']
    ```

3. Eliminar valor

    ```PY
    miArray = ['valor1', 2, True]
    miArray.remove('valor1')
    print(miArray)
    # salida: [2, True]
    del miArray[0]
    print(miArray)
    # salida: [True]
    ```

## Multidimensional Arrays

```PY
miArrayBi = [[1,2,3],[4,5,6]]
print(miArrayBi[0][2])
# salida: 3
print(miArrayBi[1][2])
# salida: 6
```
