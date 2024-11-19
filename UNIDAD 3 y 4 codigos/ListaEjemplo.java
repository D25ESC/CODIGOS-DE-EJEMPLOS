import java.util.ArrayList;
import java.util.List;

public class ListaEjemplo {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        
        // Agregar elementos a la lista
        lista.add(10);
        lista.add(20);
        lista.add(30);
        
        // Acceder a un elemento por índice
        System.out.println(lista.get(1)); // Imprime 20
        
        // Iterar sobre la lista
        for (int numero : lista) {
            System.out.println(numero);
        }
    }
}