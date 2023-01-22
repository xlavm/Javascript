# Condicionales

1. if and else

    ```JAVA
    int numero1 = 1, numero2 = 2;
    if (numero1 > numero2){
        System.out.println("el numero mayor es: "+ numero1);
    }else {
        System.out.println("el numero mayor es: "+ numero2);
    }
    //output: el numero mayor es: 2
    ```

    if ternario

    ```JAVA
    int numero1 = 1, numero2 = 2;
    String resultado = (numero1 > numero2)? ("el numero mayor es: "+ numero1) : ("el numero mayor es: "+ numero2);
    System.out.println(resultado);
    //output: el numero mayor es: 2
    ```

2. switch

    ```JAVA
    char op = '-';
    switch (op) {
        case '+':
            System.out.println("ingreso a sumar");
        break ;
        case '-':
            System.out.println("ingreso a restar");
        break;
    }
    // output: ingreso a restar
    ```

---
