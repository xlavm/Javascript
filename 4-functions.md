# Functions

1. Funciones de Flecha 

    Es recomendable usar funciones de flecha
    ```JS
    //funcion tradicional
    function sumar(a, b){
      return a + b 
    }
    //funcion de flecha
    const sumar = (a, b) => {
      return a + b
    }
    //funcion de flecha abreviada
    const sumar = (a, b) => a + b
    ```
    
2. retornar JSON y un Valor del JSON

    ```JS
    const obtainValue = () => {
      const value = { value: 'hola'}
      return value
    }

    const newValue = obtainValue()

    console.log(newValue.value) 
    // output: hola

    console.log(newValue)
    // output: { valor:"hola" }
    ```
-----

