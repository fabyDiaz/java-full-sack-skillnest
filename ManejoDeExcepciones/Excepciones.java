public class Excepciones {
   public static void main(String[] args) {
       // Definir un arreglo
       int[] numeros = { 1, 2, 3, 4, 5 };
      
       // Intentar acceder a un índice fuera de los límites del arreglo
       try {
           // Intentar acceder a un índice que está fuera de los límites del arreglo
           int numero = numeros[10];
           System.out.println("El número en la posición 10 es: " + numero);
       } catch (ArrayIndexOutOfBoundsException e) {
           // Manejar la excepción en caso de que ocurra un error al acceder al índice
           System.out.println("¡Se ha producido un error! El índice está fuera de los límites del arreglo.");
       }
   }
}