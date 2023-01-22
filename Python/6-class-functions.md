# Clases y Funciones

1. Clase

    ```PY
    class myClass():
    ```

2. Clase con atributo

    ```PY
    class myClass():
        x=1

    #mostrar valor del atributo
    clase = myClass()
    print(clase.x)
    #salida: 1

    #modificar valor del atributo
    myClass.x = 'Luis Vanegas'
    print(myClass.x)
    #salida: Luis Vanegas
    ```

3. Clase con funciones

    ```PY
    class Person:
       
        def __init__(self, name, age):
            self.name = name
            self.age = age

        def myfunc(self):
            print("Hola mi nombre es: " + self.name)


    p1 = Person("Luis", 25)
    p1.myfunc()
    #salida: Hola mi nombre es:
    ```
