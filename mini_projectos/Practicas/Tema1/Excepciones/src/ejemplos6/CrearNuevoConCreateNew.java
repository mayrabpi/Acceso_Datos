package ejemplos6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CrearNuevoConCreateNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Path ruta = Paths.get("nuevoArchivoCreateNew.txt");
	        String contenido = "Este archivo se creó usando CREATE_NEW.\n";
	        
	        try {
	            Files.writeString(ruta, contenido, StandardOpenOption.CREATE_NEW);
	            System.out.println("Archivo creado y contenido escrito.");
	        } catch (IOException e) {
	            if (e instanceof java.nio.file.FileAlreadyExistsException) {
	                System.out.println("El archivo ya existe y no se ha sobrescrito.");
	            } else {
	                e.printStackTrace();
	            }
	        }

	}

}
