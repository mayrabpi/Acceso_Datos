package main;

/**
 * 
 */
import java.util.HashMap;

public class PhoneBook {
	private HashMap<String, Integer> phone;

	/**
	 * 
	 */
	public PhoneBook() {
		this.phone = new HashMap<>();
	}

	/**
	 * metodo que añede un contacto y su numero de telefono
	 * 
	 * @param nombre
	 * @param numero
	 */
	public void añadirContacto(String nombre, Integer numero) {
		this.phone.put(nombre, numero);
		System.out.println("Contacto Añadido exitosamente");
	}

	/**
	 * metodo que elimina un contacto
	 * 
	 * @param nombre
	 */
	public void eliminaContacto(String nombre) {
		if (this.phone.containsKey(nombre)) {
			this.phone.remove(nombre);
			System.out.println("Contacto eliminado exitosamente");
		} else
			System.out.println("Contacto no existe");
	}

	/**
	 * metodo que muestra los contactos
	 */
	public void listarContacto() {
		if (!this.phone.isEmpty())
			for (String nombre : phone.keySet()) {

				System.out.println("Nombre: " + nombre + " " + " ,Telefono:  " + phone.get(nombre));
			}
		else
			System.out.println("Agenda vacía");
	}

	/**
	 * metodo que busca un contacto
	 * 
	 * @param nombre
	 * @return true si el contacto existe y false si no existe
	 */
	public boolean BuscarContacto(String nombre) {
		if (this.phone.containsKey(nombre)) {
			System.out.println("El numero de telefono de: " + nombre + " es: " + phone.get(nombre));
			return true;
		} else
			System.out.println("Contacto no encontrado");
		return false;
	}
}
