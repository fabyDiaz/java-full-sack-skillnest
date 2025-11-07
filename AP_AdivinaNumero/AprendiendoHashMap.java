import java.util.HashMap;
import java.util.Set;

public class AprendiendoHashMap {
    public static void main(String[] args) {
        HashMap<String, String> usuarios = new HashMap<String, String>();

       usuarios.put("alex@miller.com", "Alex Miller");
       usuarios.put("martha@gomez.com", "Martha Gomez");
       usuarios.put("julieta@vargas.com", "Julieta Vargas");

       System.out.println(usuarios.get("martha@gomez.com"));

       Set<String> claves = usuarios.keySet();
       for(String clave: claves){
           System.out.println(clave + " " + usuarios.get(clave));
       }
    }
}
