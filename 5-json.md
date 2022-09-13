# JSON

1. retornar valores de JSON

    ```JS
    const usuario = {
        nombre: 'Luis',
        edad: '16',
        skill: ['js', 'java', '.net'],
        perfil: {
            tipo: 'privado',
            cuenta: 'premium'
        }
    } 

    console.log(usuario.nombre)
    // output: Luis
    
    console.log(usuario.skill[0])
    // output: js
   
    console.log(usuario.perfil.cuenta)
    // output: premium
    ```
