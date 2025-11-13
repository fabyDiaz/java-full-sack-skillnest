package com;

import com.clases.Inventario;
import com.clases.Producto;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        //Agrega un par de instancias de Productos.
        Producto producto1 = new Producto("Polera xl", 1200.0);
        Producto producto2 = new Producto("Pantalon azul L", 1800);

        //Agrega dichos productos al Inventario.
        ArrayList<Producto> productos = new ArrayList<>();
        Inventario inventario = new Inventario(productos);

        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);

        //Prueba la funcionalidad de eliminar un producto.
        inventario.eliminarProducto(producto2);

        //Prueba la funcionalidad de buscar un producto.
        inventario.buscarProducto(1);

        //Registra acciones y valida información sobre los productos.
        inventario.validarInformacion();
        inventario.registraAccion("algo");


    }
}
