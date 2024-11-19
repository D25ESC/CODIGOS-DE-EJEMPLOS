import java.util.LinkedList;
import java.util.Queue;

public class ColaEjemplo {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        
        // Agregar elementos a la cola (enqueue)
        cola.add("Tarea 1");
        cola.add("Tarea 2");
        cola.add("Tarea 3");
        
        // Eliminar y obtener el primer elemento (dequeue)
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }
}
