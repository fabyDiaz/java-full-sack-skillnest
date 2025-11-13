import java.util.ArrayList;

public class Garage {

    /**
     * Atributos:
vehiculos (ArrayList de Vehiculo): Una lista para almacenar los vehículos.
capacidad (int): Capacidad máxima de vehículos que puede almacenar el garaje.
Constructor:
Debe inicializar la lista vehiculos y establecer la capacidad del garaje.
Métodos:
agregarVehiculo(Vehiculo vehiculo): Añade un vehículo a la lista si hay espacio disponible. 
De lo contrario, muestra un mensaje indicando que no hay espacio.
mostrarVehiculos(): Imprime todos los vehículos almacenados en el garaje.
     */

     private ArrayList<Vehiculo> listaVehiculos;
     private int capacidad;

     public Garage(int capacidad){
        this.listaVehiculos = new ArrayList<>();
        this.capacidad = capacidad;
     }

     public void agregarVehiculo(Vehiculo vehiculo){
        if(listaVehiculos.size()<capacidad){
            listaVehiculos.add(vehiculo);
        }else{
            System.out.println("no hay capacidad para agregar el vehículo " + vehiculo.getMarca());
        }
     }

     public String mostrarVehiculo(){
         String mostrarLista = "";
        for(Vehiculo vehiculo: listaVehiculos){
        mostrarLista += vehiculo.desplieguaInformacion() + "\n";
        }
        return mostrarLista;
     }

     public ArrayList<Vehiculo> getListaVehiculos() {
         return listaVehiculos;
     }

     public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
         this.listaVehiculos = listaVehiculos;
     }

     public int getCapacidad() {
         return capacidad;
     }

     public void setCapacidad(int capacidad) {
         this.capacidad = capacidad;
     }



     
    
}
