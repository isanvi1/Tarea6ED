package tarea6ed;

/**
 * Clase principal para ejecutar el programa de descuento en productos.
 * 
 * @author Isanvi1
 */
public class Tarea6ED {

    /**
     * Método principal que crea una instancia de Tarea6EDClase y llama al método aplicarDescuento.
     * 
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
           
        Tarea6EDClase miCarrito = new Tarea6EDClase();

        miCarrito.aplicarDescuento(100, 5);
    }
    
}

