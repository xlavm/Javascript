# Cycles

1. while

    ```JAVA
    int contador =1; 
    while (contador <= 5 ){
        System.out.println("numero" + contador);
        contador = contador +1;
    }
    /* output:
    numero1
    numero2
    numero3
    numero4
    numero5
    */
    ```

2. do while

    ```JAVA
    import java.util.Scanner;

    public class HolaMundo {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int numero = 0;
            do {
                System.out.println("Ingresa el 0 para ejecutar el ciclo o el 1 para detenerlo");
                numero = sc.nextInt();
                if (numero == 0){
                    System.out.println("El ciclo se ejecutara nuevamente");
                }else if (numero == 1){
                    System.out.println("El ciclo se detendra");
                }else if (numero != 0 && numero != 1){
                    System.out.println("Ingreso un valor no correcto");
                }
            } while ( numero == 0);

        }
    }
    ```

3. for

    ```JAVA
    for (int contador=1; contador <= 5; contador++){
        System.out.println("numero:" +contador);
    }
    /* output:      
    numero:1
    numero:2
    numero:3
    numero:4
    numero:5 
    */
    ```
