public class TiendaOnline {
   public static void main(String[] args) {
       // VARIABLES DE LA TIENDA
       double total3=0;
       double total2=0;
    
       // Mensajes de la aplicación
       String mensajeBienvenida = "Bienvenido a nuestra tienda en línea, ";
       String mensajeConfirmacion = ", tu pedido ha sido confirmado";
       String mensajeRechazo = ", lamentablemente el artículo seleccionado está agotado";
       String mensajeMostrarTotal = "El total de tu compra es: $";
      
       // Variables de productos (agrega las tuyas a continuación)
       double precioLibro = 15.99;
       double precioCamiseta = 25.50;
       double precioPantalon = 20.30;
       double precioZapatos = 30.65;
  
       // Variables de clientes (agrega las tuyas a continuación)
       String cliente1 = "Ana";
       String cliente2= "Alex";
       String cliente3 = "Miguel";
  
       // Estado de pedidos (agrega las tuyas a continuación)
       boolean pedidoConfirmadoCliente1 = true;
       boolean pedidoConfirmadoCliente2 = true;
       boolean pedidoConfirmadoCliente3 = true;
  
       // INTERACCIÓN DE LA APLICACIÓN
       //Ana ha pedido un pantalón
       System.out.println(mensajeBienvenida + cliente1); // Muestra "Bienvenido a nuestra tienda en línea, Ana"
       // ** Aquí irán las declaraciones de impresión relacionadas con la interacción del cliente ** //
       if(pedidoConfirmadoCliente1){
        System.out.println(cliente1+mensajeConfirmacion);
        System.out.println(mensajeMostrarTotal+precioPantalon);
       }else{
        System.out.println(mensajeRechazo);
       }

       //Miguel ha pedido unos zapatos y un libro
       System.out.println("==================================================");
       System.out.println(mensajeBienvenida + cliente3); // Muestra "Bienvenido a nuestra tienda en línea, Ana"
       // ** Aquí irán las declaraciones de impresión relacionadas con la interacción del cliente ** //
       if(pedidoConfirmadoCliente3){
        System.out.println(cliente3+mensajeConfirmacion);
        total3 = precioZapatos + precioLibro;
        System.out.println(mensajeMostrarTotal+total3);
       }else{
        System.out.println(mensajeRechazo);
       }

       //Alex ha comprado 2 pares de zapatos, una camiseta y unos pantalones.
       System.out.println("=================================================");
       System.out.println(mensajeBienvenida + cliente2); // Muestra "Bienvenido a nuestra tienda en línea, Ana"
       // ** Aquí irán las declaraciones de impresión relacionadas con la interacción del cliente ** //
       if(pedidoConfirmadoCliente2){
        System.out.println(cliente2+mensajeConfirmacion);
        total2 = 2*precioZapatos + precioCamiseta + precioPantalon;
        System.out.println(mensajeMostrarTotal+ total2);
       }else{
        System.out.println(mensajeRechazo);
       }

       //Miguel se ha dado cuenta que le cobraron unos pantalones y una camiseta.
       System.out.println("==================================================");
       System.out.println(mensajeBienvenida + cliente3); // Muestra "Bienvenido a nuestra tienda en línea, Ana"
       // ** Aquí irán las declaraciones de impresión relacionadas con la interacción del cliente ** //
       double totalError = precioPantalon + precioZapatos;
       double diferencia = totalError - total3;
       System.out.println("Pedido con error: "+totalError);
       System.out.println("Pedido actual: " + total3);
       System.out.println("Diferencia: "+diferencia);

   }
}