package com.clases;

import com.interfaces.Auditable;
import com.interfaces.Validable;

import java.util.ArrayList;

public class Inventario implements Auditable, Validable {
    private ArrayList<Producto> productos;

    public Inventario(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
        System.out.println("Producto agregado: " + producto);
    }
    public void eliminarProducto(Producto producto){
        productos.remove(producto);
        System.out.println("Producto: "+ producto.getId() + " eliminado");
    }
    public Producto buscarProducto(int idProducto){
        for(Producto producto : productos){
            if(producto.getId() == idProducto){
                System.out.println("Producto encontrado: " + producto);
                return producto;
            }
        }
        System.out.println("Producto no encontrado");
        return null;
    }

    @Override
    public void registraAccion(String accion) {
        System.out.println("Se realiaza la accion" + accion + "en Inventario");
    }

    @Override
    public void validarInformacion() {
        System.out.println("Valida la informacion en Inventario");
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "productos=" + productos +
                '}';
    }
}
