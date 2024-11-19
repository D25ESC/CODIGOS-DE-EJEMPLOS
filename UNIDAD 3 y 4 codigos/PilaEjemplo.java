import java.util.Stack;

public class PilaEjemplo {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();
        
        // Agregar elementos a la pila   
        pila.push("Elemento 1");
        pila.push("Elemento 2");
        pila.push("Elemento 3");
        
        // Eliminar y obtener el último elemento (pop)
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }
}
