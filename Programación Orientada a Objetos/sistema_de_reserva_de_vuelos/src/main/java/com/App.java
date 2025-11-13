package com;

import com.clases.Vuelo;
import com.clases.VueloCarga;
import com.clases.VueloDomestico;
import com.clases.VueloInternacional;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
       Vuelo vuelo1 = new VueloDomestico("dom123", "Santiago", "Temuco", 1.5, 5000, 0.05);
       Vuelo vuelo2 = new VueloInternacional("int123", "Santiago", "Buenos Aires", 2, 6000, 50);
       Vuelo vuelo3 = new VueloCarga("car123", "Iquique", "Santiago", 2.1, 3000, 6.5,50);

       vuelo1.calcularPrecio();
       vuelo2.calcularPrecio();
       vuelo3.calcularPrecio();

       vuelo1.mostrarInformacionDeVuelo();
       vuelo2.mostrarInformacionDeVuelo();
       vuelo3.mostrarInformacionDeVuelo();
    }
}
