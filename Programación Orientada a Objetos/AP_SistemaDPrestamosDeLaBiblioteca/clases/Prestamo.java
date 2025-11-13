import java.util.ArrayList;

public class Prestamo {
    private String nombre; 
    private ArrayList<Libro> libros;
    private boolean estatus;

    public Prestamo(){
        this.libros = new ArrayList<>();
    }

    public Prestamo(String nombre, boolean estatus) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.estatus = estatus;
    }
        public Prestamo(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.estatus = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public boolean isStatus() {
        return estatus;
    }

    public void setStatus(boolean estatus) {
        this.estatus = estatus;
    }

    public void agregarLibro(Libro libro){
        this.libros.add(libro);
    }

    public String mostrarEstatus(){
        return estatus ? "Préstamos Activo" : "Préstamos inactivo";
    }

    public String mostrarDetallesDelPrestamo(){
        return "Préstamo: Usuario -> " + nombre + ", Libros -> "+ libros + ", " + mostrarEstatus();
    }

    public Double CalcularTotalReemplazo(){
        Double total = 0.0;
        for(Libro libro : libros){
            total += libro.getPrecioReemplazo();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Prestamo [nombre=" + nombre + ", libros=" + libros + ", status=" + estatus + "]";
    } 
}
