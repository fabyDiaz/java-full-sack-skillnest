package com.clases;

import com.interfaces.Validable;

public class Producto implements Validable {

    private static int incremento = 0;
    private int id;
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.id = ++incremento;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public void validarInformacion() {
        System.out.println("Valida informacion de producto");
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
