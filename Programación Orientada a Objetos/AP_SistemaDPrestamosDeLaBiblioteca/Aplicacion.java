public class Aplicacion {
    public static void main(String[] args) {
        Prestamo prestamo1 = new Prestamo();
        Prestamo prestamo2 = new Prestamo();

        Prestamo prestamo3 = new Prestamo("Fabiola", true);
        Prestamo prestamo4 = new Prestamo("Alondra", false);
        Prestamo prestamo5 = new Prestamo("Dominique", true);
    
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 150.0);
        Libro libro2 = new Libro("Pinocho", "Carlo Collodi", 120.0);
        Libro libro3 = new Libro("Peter Pan", "J. M. Barrie", 135.0);
        Libro libro4 = new Libro("Heidi", "Johanna Spyri", 140.0);
        Libro libro5 = new Libro("Alicia en el país de las maravillas", "Lewis Carroll", 130.0);
    
        prestamo1.agregarLibro(libro5);
        prestamo1.agregarLibro(libro1);

        prestamo2.agregarLibro(libro3);
        prestamo2.agregarLibro(libro4);
        prestamo2.agregarLibro(libro2);

        prestamo3.agregarLibro(libro5);
        prestamo3.agregarLibro(libro1);

        prestamo4.agregarLibro(libro3);
        prestamo4.agregarLibro(libro5);
        prestamo4.agregarLibro(libro2);
        prestamo4.agregarLibro(libro1);

        prestamo5.agregarLibro(libro5);
        prestamo5.agregarLibro(libro2);


        System.out.println(prestamo1.mostrarDetallesDelPrestamo());
        System.out.println(prestamo2.mostrarDetallesDelPrestamo());
        System.out.println(prestamo3.mostrarDetallesDelPrestamo());
        System.out.println(prestamo4.mostrarDetallesDelPrestamo());
        System.out.println(prestamo5.mostrarDetallesDelPrestamo());
    
    }

    
}
