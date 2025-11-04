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
        double resto = 0;
        double cant500 = Math.floor(cantidad/500);
        resto = cantidad % 500;
        double cant200 = Math.floor(resto/200);
        resto = cantidad % 200;
        double cant100 = Math.floor(resto/100);
        resto = cantidad % 100;
        double cant50 = Math.floor(resto/50);
        resto = cantidad % 50;
        double cant20 = Math.floor(resto/20);
        resto = cantidad % 20;
        double cant10 = Math.floor(resto/10);
        resto = cantidad % 5;
        double cant5 = Math.floor(resto/5);
        resto = cantidad % 2;
        double cant2 = Math.floor(resto/2);
        double cant1 = resto;

        return(cant500+"billetes de 500, \n" 
                            + cant200 + "billetes de 200, \n"
                            + cant100 + "billete de 100, \n"
                            + cant50 + "billetes de 50, \n" 
                            + cant20 +"moneda de 20, \n"
                            + cant10 + "monedas de 10\n"
                            + cant5 + "monedas de 5\n"
                            + cant2 + "monedas de 2\n"
                            + cant1 + "monedas de 1");
    }



}
