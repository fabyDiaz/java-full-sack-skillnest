package com.clases;

public class VueloDomestico extends Vuelo {

    private double descuento; //en porcentaje

    public VueloDomestico(String numeroVuelo, String origen, String destino, double duracion, double precio) {
        super(numeroVuelo, origen, destino, duracion, precio);
    }

    public VueloDomestico(String numeroVuelo, String origen, String destino, double duracion, double precio, double descuento) {
        super(numeroVuelo, origen, destino, duracion, precio);
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecio() {
        return precio - (precio * descuento);
    }

    @Override
    public void mostrarInformacionDeVuelo() {
        System.out.println(" -- VUELO DOMÉSTICO --"
                + "Numero de vuelo: " + numeroVuelo + "\n"
                + "Origen: "+ origen + "\n"
                + "Destino: "+ destino + "\n"
                + "Duración del vuelo: "+ duracion + "\n"
                + "Precio: $"+ precio+ "\n"
                + "Descuento: " + descuento
                + "Precio con descuento: " + calcularPrecio());
    }
}
