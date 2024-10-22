package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		PhoneBook agenda = new PhoneBook();
		int opcion;
		do {
			System.out.println("---Menú de la guia telefónica---");
			System.out.println("1.Agregar contacto");
			System.out.println("2.Eliminar contacto");
			System.out.println("3.Búsqueda de contacto");
			System.out.println("4.Listar contacto");
			System.out.println("5.salir");
			opcion = entrada.nextInt();
			switch (opcion){
			
			case 1:
				System.out.println("Introduzca el nombre del contacto");
				String nombre=entrada1.nextLine();
				System.out.println("Introducir el número del contacto");
				int numero= entrada.nextInt();
				agenda.añadirContacto(nombre, numero);
				break;
			case 2:
				System.out.println("Ingrese el nombre del contacto a eliminar");
				String nombre1 = entrada1.nextLine();
				agenda.eliminaContacto(nombre1);
				break;
				
			case 3:
				System.out.println("Introduzca el nimbre del contacto a buscar");
				String nombre2= entrada1.nextLine();
				agenda.BuscarContacto(nombre2);
				break;
			case 4:
				System.out.println("Contactos de la agenda telefónica:");
				agenda.listarContacto();
				break;
						
			default:
				System.out.println("Adios");
			}	
		}while(opcion!=5);
		
		entrada.close();
		entrada1.close();

	}
	

}

