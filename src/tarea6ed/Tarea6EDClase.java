/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6ed;

/**
 *
 * @author Isanvi1
 */
public class Tarea6EDClase {
    private static final double DESCUENTO_POR_DEFECTO = 0.95;
    private static final double DESCUENTO_POR_PRODUCTO = 0.8;
    private static final int DESCUENTO_POR_CANTIDAD_PRODUCTO = 5;
    private static final int MIN_CANTIDAD_DESCUENTO = 3;

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

    private void screenOutput(double total) {
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }
}
