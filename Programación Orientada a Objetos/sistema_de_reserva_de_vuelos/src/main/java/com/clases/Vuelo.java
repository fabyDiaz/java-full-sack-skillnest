package com.clases;

public abstract class Vuelo {
    protected String numeroVuelo;
    protected String origen;
    protected String destino;
    protected double duracion;
    protected double precio;

    public Vuelo(String numeroVuelo, String origen, String destino, double duracion, double precio) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.precio = precio;
    }

    public abstract double calcularPrecio();

    public abstract void mostrarInformacionDeVuelo();

}
