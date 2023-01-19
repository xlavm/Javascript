# JSON

1. retornar valores de JSON

    ```PY
   usuario = {
    "nombre": 'Luis',
    "edad": 16,
    "skill": ['js', 'java', '.net'],
    "perfil": {
        "tipo": 'privado',
        "cuenta": 'premium'
    }
    } 
    print(usuario["nombre"])
    # output: Luis
    print(usuario["skill"][0])
    # output: js
    print(usuario["perfil"]["cuenta"])
    # output: premium
    print(usuario)
    # output: { retorna todo el JSON }
    ```
