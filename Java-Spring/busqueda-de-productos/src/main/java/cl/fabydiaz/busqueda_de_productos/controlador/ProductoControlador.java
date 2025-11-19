package cl.fabydiaz.busqueda_de_productos.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoControlador {

    private static String listaProductos [] = {"iPhone", "Samsung", "Huawei", "Windows Phone"};
    private static Double listaPrecios [] = {49.99, 35.99, 60.99, 25.99};

    private String buscarPrecioProducto(String consulta){
        for(int i=0; i<=listaProductos.length; i++){
            if(listaProductos[i].equals(consulta)){
                return "El precio del "+ listaProductos[i] +" es de $"+listaPrecios[i];
            }
        }
        return "El "+consulta +"no se encuentra en nuestra lista.";
    }

    @GetMapping("/productos")
    public String obtenerProductos(@RequestParam(value="nombre") String nombre){
        return buscarPrecioProducto(nombre);
    }

}
