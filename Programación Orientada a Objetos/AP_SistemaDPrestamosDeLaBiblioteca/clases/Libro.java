public class Libro{
    private String titulo; 
    private String autor; 
    private double precioReemplazo;
    
    public Libro() {
    }

    public Libro(String titulo, String autor, double precioReemplazo) {
        this.titulo = titulo;
        this.autor = autor;
        this.precioReemplazo = precioReemplazo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecioReemplazo() {
        return precioReemplazo;
    }

    public void setPrecioReemplazo(double precioReemplazo) {
        this.precioReemplazo = precioReemplazo;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", precioReemplazo=" + precioReemplazo + "]";
    }

    


}