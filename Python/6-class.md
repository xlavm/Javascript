# Class

1. clase con attributo

    ```PY
    class myClass():
        x=1

    clase = myClass()
    print(clase.x)

    myClass.x = 'Luis Vanegas'
    print(myClass.x)
    # output: Luis Vanegas
    ```

2. clase con funcion

    ```PY
    class Person:
        def __init__(self, name, age):
            self.name = name
            self.age = age

        def myfunc(self):
            print("Hello my name is " + self.name)

    p1 = Person("Luis", 25)
    p1.myfunc()
    # output: Hello my name is Luis
    ```
