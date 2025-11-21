# Ciudades Visitadas (Actividad práctica)

## Objetivos
* Comprender y aplicar el concepto de rutas con Modelos.
* Comprender y aplicar el concepto de JSP y JSTL.
* Practicar la creación de controladores en la aplicación de Spring Boot.
 
## Requerimientos
* Crea un nuevo proyecto llamado ciudades_visitadas.
* Asigna el paquete base com.tunombre para que ahí se cree el archivo principal de la aplicación.
* Agrega un paquete para tus controladores: com.tunombre.controladores.
* Dentro de ese nuevo paquete agrega una clase llamada ControladorPaises.java
* Agrega el siguiente atributo que contiene un HashMap para almacenar países y sus respectivas capitales:
```java
private static HashMap<String, String> listaPaises = new HashMap<String, String>();
```

* Ahora agrega el siguiente constructor que se encarga de llenar el HashMap con información de prueba de países y sus capitales:
```java
public ControladorPaises() {
	listaPaises.put("México", "Ciudad de México");
	listaPaises.put("Paraguay", "Asunción");
	listaPaises.put("Perú", "Lima");
	listaPaises.put("Costa Rica", "San Jose");
	listaPaises.put("Chile", "Santiago");	
}
```

* Implementa los siguientes métodos:
   * obtenerTodosLosPaises(): Método que responde a la ruta /paises. Este método agrega la lista de países a un objeto Modelo para enviar hacia el JSP llamado paises.jsp.
   * obtenerCapital(): Método que responde a la ruta /piases/{pais}. Este método busca el nombre del país en el HashMap y al encontrarlo devuelve nombre y capital los cuales agrega respectivamente a un objeto Modelo para enviar hacía el JSP llamado capitales.jsp En caso de que el país no exista en el HashMap devolver un mensaje como el siguiente: «País no encontrado»
* Ahora crea dos JSP. 
   * Uno para listar todos los países paises.jsp. 
   * El segundo para listar el país y la capital capitales.jsp. Si el país no se encontró utilizar una condición con <c:if> o <c:choose> para mostrar el mensaje de «País no encontrado»
* Ejecuta la aplicación utilizando Spring Boot. Asegúrate de que la aplicación se ejecuta sin errores.
* Utiliza un navegador web para acceder a las rutas y verificar que cada una retorne la información esperada.