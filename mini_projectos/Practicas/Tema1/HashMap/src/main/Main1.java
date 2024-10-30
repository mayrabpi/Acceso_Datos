package main;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Scanner entrada1 = new Scanner(System.in);
		
		
		int opcion;
		do {
			System.out.println("elige una opcion cero para salir");
			System.out.println("opcion 1");
			System.out.println("opcion 2");
			opcion = entrada.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("nombre");
				break;
			case 2:
				System.out.println("apellido");
				break;
			default:
				System.out.println("adios");
			}
			
		}while(opcion!=0);

	}

}
