package clases;
public class AdivinaNumero{
    public static String compararNumeros(int numero, int aleatorio){
        if(numero<aleatorio){
            return "Intenta con un número más grande.";
        }else if(numero>aleatorio){
            return "intenta con un número más pequeño";
        }else{
            return "Has conseguido adivinar el número";
        }
    }
}