package com.clases;

public class VueloCarga extends Vuelo{

    private double pesoCarga; //en kg
    private double tarifaKilogramo;

    public VueloCarga(String numeroVuelo, String origen, String destino, double duracion, double precio, double pesoCarga, double tarifaKilogramo) {
        super(numeroVuelo, origen, destino, duracion, precio);
        this.pesoCarga = pesoCarga;
        this.tarifaKilogramo = tarifaKilogramo;
    }

    @Override
    public double calcularPrecio() {
        return precio + tarifaKilogramo * pesoCarga;
    }

    @Override
    public void mostrarInformacionDeVuelo() {
        System.out.println(" -- VUELO CARGA --"
                + "Numero de vuelo: " + numeroVuelo + "\n"
                + "Origen: "+ origen + "\n"
                + "Destino: "+ destino + "\n"
                + "Duración del vuelo: "+ duracion + "\n"
                + "Precio: $"+ precio+ "\n"
                + "Precio final: $"+ calcularPrecio());
    }

}
