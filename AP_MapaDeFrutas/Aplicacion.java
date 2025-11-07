import java.util.HashMap;
import java.util.Set;

public class Aplicacion{
    public static void main(String[] args) {
        HashMap<String, Integer> frutas = new HashMap<>();
        frutas.put("Manzana", 100);
        frutas.put("Naranja",150);
        frutas.put("plátano",140);
        frutas.put("Frutilla",1000);
        frutas.put("Sandia", 3000);

        System.out.println(frutas.get("Manzana"));

        Set<String>nombres =frutas.keySet();

        for(String nombre: nombres){
            System.out.println(nombre + " $"+ frutas.get(nombre));
        }

        
    }
}