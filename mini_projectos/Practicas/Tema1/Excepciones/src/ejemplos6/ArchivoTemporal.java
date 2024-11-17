package ejemplos6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ArchivoTemporal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            Path ruta = Files.createTempFile("tempFile", ".txt");
	            Files.writeString(ruta, "Este es un archivo temporal.\n", 
	                    StandardOpenOption.DELETE_ON_CLOSE);
	            System.out.println("Archivo temporal creado y contenido escrito. Se eliminará al cerrar.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}
