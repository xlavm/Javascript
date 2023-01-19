# Conditionals

1. if and else

    ```PY
    nota = 4.5
    if(nota > 3):
        print('aprobó con: ', nota)
    else:
        print('reprobó con: ', nota)
    # output: aprobó con: 4.5
    ```

2. match

    ```PY
    nota = 4.5
    match nota:
        case 1.0:
            print('mal hecho')
        case 3.0:
            print('lo hiciste regular')
        case 4.5:
            print('Bien hecho!!!')
        case _:
            print('no se que decir')
    # output: Bien hecho!!!
    ```

---
