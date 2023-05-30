package tarea6ed;

/**
 * Esta es la clase principal para realizar el cálculo del descuento en un producto.
 * 
 * @author Isanvi1
 */
public class Tarea6EDClase {
    private static final double DESCUENTO_POR_DEFECTO = 0.95;
    private static final double DESCUENTO_POR_PRODUCTO = 0.8;
    private static final int DESCUENTO_POR_CANTIDAD_PRODUCTO = 5;
    private static final int MIN_CANTIDAD_DESCUENTO = 3;

    /**
     * Aplica el descuento al precio del producto en base a la cantidad y muestra el total a pagar.
     *
     * @param precioProducto el precio del producto sin descuento
     * @param numProductos la cantidad de productos
     */
    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        if (numProductos > MIN_CANTIDAD_DESCUENTO) {
            precioProducto -= DESCUENTO_POR_CANTIDAD_PRODUCTO;
        }
        if (numProductos != 0) {
            total = precioProducto * DESCUENTO_POR_PRODUCTO;
            screenOutput(total);
        } else {
            total = precioProducto * DESCUENTO_POR_DEFECTO;
            screenOutput(total);
        }
    }

    /**
     * Muestra el resultado del cálculo en la pantalla.
     *
     * @param total el total a pagar con descuento
     */
    private void screenOutput(double total) {
        System.out.println("El total a pagar es: " + total);
        System.out.println("Enviado");
    }
}
