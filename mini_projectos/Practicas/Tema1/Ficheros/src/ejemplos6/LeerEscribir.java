package ejemplos6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LeerEscribir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Path ruta = Paths.get("archivoLeerEscribir.txt");
	        String nuevoContenido = "\nEste es un nuevo contenido añadido al archivo.\n";
	        
	        try {
	            if (Files.notExists(ruta)) {
	                Files.writeString(ruta, "Este es el contenido inicial del archivo.", StandardOpenOption.CREATE);
	                System.out.println("Archivo creado con contenido inicial.");
	            }

	            String contenidoExistente = Files.readString(ruta /*, StandardOpenOption.READ*/);
	            System.out.println("Contenido existente:\n" + contenidoExistente);
	            
	            Files.writeString(ruta, nuevoContenido, /*StandardOpenOption.WRITE,*/ StandardOpenOption.APPEND);
	            System.out.println("Nuevo contenido añadido.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}
