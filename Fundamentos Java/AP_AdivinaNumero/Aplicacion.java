import clases.AdivinaNumero;

public class Aplicacion {
     public static void main(String[] args) {
        int aleatorio = (int) (Math.random() * (100 - 1 + 1)) + 1;
        int num = 0;
        do{
            System.out.print("Por favor ingresa el número: ");
            String linea = System.console().readLine();
            num = Integer.parseInt(linea);
            System.out.println(AdivinaNumero.compararNumeros(num, aleatorio));
        }while(num != aleatorio);
     
   }
}
