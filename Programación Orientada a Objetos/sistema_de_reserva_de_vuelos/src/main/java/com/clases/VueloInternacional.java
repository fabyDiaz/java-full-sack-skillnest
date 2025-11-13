package com.clases;

public class VueloInternacional extends  Vuelo{

    private double impuestoInternacional;

    public VueloInternacional(String numeroVuelo, String origen, String destino, double duracion, double precio, double impuestoInternacional) {
        super(numeroVuelo, origen, destino, duracion, precio);
        this.impuestoInternacional = impuestoInternacional;
    }

    @Override
    public double calcularPrecio() {
        return precio + impuestoInternacional;
    }

    @Override
    public void mostrarInformacionDeVuelo() {
        System.out.println(" -- VUELO INTERNACION --" +
                "Numero de vuelo: " + numeroVuelo + "\n"
                + "Origen: "+ origen + "\n"
                + "Destino: "+ destino + "\n"
                + "Duración del vuelo: "+ duracion + "\n"
                + "Precio: $"+ precio+ "\n"
                + "Impuesto Internacional: "+ impuestoInternacional
                + "Precio final: $"+ calcularPrecio());

    }
}
