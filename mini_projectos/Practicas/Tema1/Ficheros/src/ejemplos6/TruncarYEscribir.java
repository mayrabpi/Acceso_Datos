package ejemplos6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TruncarYEscribir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Path ruta = Paths.get("archivoTruncado.txt");
	        String contenido = "Este es el nuevo contenido que reemplaza el anterior.\n";
	        
	        try {
	            if (Files.notExists(ruta)) {
	                Files.writeString(ruta, "Este es el contenido inicial del archivo.", StandardOpenOption.CREATE);
	                System.out.println("Archivo creado con contenido inicial.");
	            }
	            
	            Files.writeString(ruta, contenido, /*StandardOpenOption.WRITE,*/ StandardOpenOption.TRUNCATE_EXISTING);
	            System.out.println("Contenido escrito y archivo truncado.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}
