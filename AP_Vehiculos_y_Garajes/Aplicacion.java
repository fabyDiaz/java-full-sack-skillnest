public class Aplicacion {
    public static void main(String[] args) {
        
       // 1. Crear el primer vehículo (Objeto 1)
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "Corolla", 2020);
        

        // 2. Crear el segundo vehículo (Objeto 2)
        Vehiculo vehiculo2 = new Vehiculo("Ford", "Ranger", 2023);
       
        // 3. Crear el tercer vehículo (Objeto 3)
        Vehiculo vehiculo3 = new Vehiculo("Honda", "CBR600RR", 2024);

        Garage garage = new Garage(2);
        garage.agregarVehiculo(vehiculo1);
        garage.agregarVehiculo(vehiculo2);


        System.out.println(garage.mostrarVehiculo());

        garage.agregarVehiculo(vehiculo3);      
        
    }
}
