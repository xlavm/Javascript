public class MyClass{
    //funcion que retorna un valor entero
    public int sumar(int num1, int num2){
        return (num1 + num2);
    }
    //funcion que retorna no retorna valor
    public void mensaje(){
        System.out.println("esta es una funcion sin retorno");
    }
    //funcion principal
    public static void main(String[] args) {
        MyClass miClase = new MyClass();
        System.out.println("el resultado de la suma es: " + miClase.sumar(1, 2));
        miClase.mensaje();
    }
}