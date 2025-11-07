/**
 *  Atributos:
marca (String): Marca del vehículo.
modelo (String): Modelo del vehículo.
año (int): Año del modelo del vehículo. 
Constructor:
Debe inicializar los atributos marca, modelo y año.
Métodos:
Un método despliegaInformacion() que devuelve una representación en cadena del vehículo, incluyendo marca, modelo y año.
 */

public class Vehiculo{
    private String marca;
    private String modelo;
    private int anio;

    public Vehiculo(String marca, String modelo, int anio){
        this.marca = marca; 
        this.modelo = modelo;
        this. anio = anio;
    }

    public String desplieguaInformacion(){
         return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + "]";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    
}