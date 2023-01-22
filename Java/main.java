import java.util.ArrayList;
import java.util.Iterator;

public class HolaMundo {
    public static void main(String[] args) {

    //declarar
    ArrayList<String> nombreArrayList = new ArrayList<String>();

    //agregamos elemento
    nombreArrayList.add("Elemento Nuevo");

    //listar
    // declaramos el Iterador e imprimimos los Elementos del ArrayList
    Iterator<String> nombreIterator = nombreArrayList.iterator();
    while(nombreIterator.hasNext()){
        String elemento = nombreIterator.next();
        System.out.print(elemento);
    }  
    // salida: Elemento Nuevo


       

    }
}


