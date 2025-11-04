package clases;
import java.util.Date;

public class Cajero{

    public static Date fechaActual = new Date();

    public static String retirarDinero(double monto){
        if(monto <=0){
            return "monto inválido";
        }else if(monto > 8000){
            return "Estás tratando de retirar mucho dinero, el límite es $8000";
        }else{
            return "Retiraste exitosamente la cantidad de" + monto;
        }
    }

    public static String pagarFactura(double cantidadTotal, double cantidadPagada){
        if(cantidadPagada < cantidadTotal){
            return "El día de" + fechaActual +" pagaste " + cantidadPagada 
            + "aún te hacen falta" + (cantidadTotal - cantidadPagada);
        }else if(cantidadPagada == cantidadTotal){
            return "Gracias por tu pago completo el día de "+ fechaActual;
        }else{
            return "Gracias por tu pago el día de" + fechaActual +", tu cambio es de" + (cantidadPagada - cantidadTotal);
        }
    }

    public static Boolean cambiarBillete(double cantidadTotal, int denominacion){
        if(cantidadTotal%denominacion == 0 ){
            return true;
        }
        return false;
    }

    public static String totalDeBilletesYMondeas(double cantidad){
        //500, 200, 100, 50, 20 para billetes y 10, 5, 2 y 1 para monedas
        int[] denominacion = {500,200,100,50,20,10,5,2,1};
        double resto = cantidad;
        int cant=0;
        String resultado = "";
        for(int i = 0; i< denominacion.length; i++){
            cant=(int) Math.floor(Math.floor(resto/denominacion[i]));
            resto = resto%denominacion[i];
            if(cant != 0 && denominacion[i]>=20){
                resultado= resultado.concat(cant +" billetes de " + denominacion[i]+", \n");
            }
            if(cant!=0 && denominacion[i]<20){
                resultado= resultado.concat(cant +" monedas de " + denominacion[i]+" , \n");
            }
        }
        return resultado;
    }



}
