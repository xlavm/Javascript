# Conditionals

1. if and else

    ```JS
    const nota = 4.5
    if(nota > 3){
      console.log('aprobó con: '+ nota)
    }else{
      console.log('reprobó con: '+ nota)
    }
    // output: aprobó con: 4.5
    ```

    if ternario

    ```JS
    const nota = 4.5
    console.log((nota > 3)?('aprobó con: '+ nota) : ('reprobó con: '+ nota))
    // output: aprobó con: 4.5
    ```

2. switch

    ```JS
    const nota = 4.5
    switch(nota){
    case 1.0:
        console.log('mal hecho')
        break
    case 3.0:
        console.log('lo hiciste regular')
        break
    case 4.5:
        console.log('Bien hecho!!!')
        break
    default:
        console.log('no se que decir')
        break
    }
    // output: Bien hecho!!!
    ```

---
