import java.util.Scanner;

import clases.Cajero;

public class Aplicacion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         double monto;
        int opcion = 0;

        do{
        System.out.println("Selecciona una de las siguientes opciones");
        System.out.println("1. Retirar dinero");
        System.out.println("2. Pagar factura");
        System.out.println("3. elegir denominación");
        System.out.println("4. totalDeBilletesYMonedas");
        System.out.println("5. salir");
        opcion = Integer.parseInt(scanner.nextLine());
        switch (opcion) {
            case 1:
                System.out.println("Ingresa monto:");
                monto = Double.parseDouble(scanner.nextLine());
                System.out.println(Cajero.retirarDinero(monto));
                break;
            case 2:
                System.out.println("Ingresa monto:");
                monto = Double.parseDouble(scanner.nextLine());
                System.out.println(Cajero.pagarFactura(5000,monto));
                break;
            case 3:
                System.out.println("Ingresa monto:");
                monto = Double.parseDouble(scanner.nextLine());
                System.out.println("Ingresa denominación");
                boolean denominacion = elegirDenominacion(scanner, monto);
                System.out.println(denominacion? "Se puede realizar el cambio":"No se puede ralizar el cambio");
                break;
            case 4:
                System.out.println("Ingresa monto:");
                monto = Double.parseDouble(scanner.nextLine());
                System.out.println(Cajero.totalDeBilletesYMondeas(monto));
                break;
            case 5:
                System.out.println("Hasta la próxima!");
                break;
            default:
                System.out.println("opción no válida");
                break;
        }
        }while(opcion!=0);
      

        scanner.close();
       
    }

    public static boolean elegirDenominacion(Scanner scanner, double cantidad){
        int opcion = 0;
        boolean denominacionSeleccionada = false;
        boolean seleccionValida = false;

        do {
            System.out.println("\n--- Seleccione una Denominación ---");
            System.out.println("1. $500" );
            System.out.println("2. $200" );
            System.out.println("3. $100" );
            System.out.println("4. $50" );
            System.out.println("5. $20");
            System.out.print("Ingrese el número de su opción: ");
            
            opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        denominacionSeleccionada=Cajero.cambiarBillete(cantidad, 500);
                        seleccionValida = true;
                        break;
                    case 2:
                         denominacionSeleccionada=Cajero.cambiarBillete(cantidad, 200);
                        seleccionValida = true;
                        break;
                    case 3:
                         denominacionSeleccionada=Cajero.cambiarBillete(cantidad, 100);
                        seleccionValida = true;
                        break;
                    case 4:
                         denominacionSeleccionada=Cajero.cambiarBillete(cantidad, 50);
                        seleccionValida = true;
                        break;
                    case 5:
                       denominacionSeleccionada=Cajero.cambiarBillete(cantidad, 20);
                        seleccionValida = true;
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 5.");
                        break;
                }
            } while (!seleccionValida);

        return denominacionSeleccionada;

    }
}
