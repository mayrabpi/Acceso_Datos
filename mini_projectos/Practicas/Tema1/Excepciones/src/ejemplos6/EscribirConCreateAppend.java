package ejemplos6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class EscribirConCreateAppend {

	
		 public static void main(String[] args) {
			 Path ruta = Paths.get("createAppend.txt");
		        String contenido = "Añadiendo este texto al final del archivo.\n";
		        
		        try {
		            Files.writeString(ruta, contenido,
		                StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		            System.out.println("Contenido añadido exitosamente.");
		        } catch (IOException e) {
		            e.printStackTrace();
		        }

	}

}
