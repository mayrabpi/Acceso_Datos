package excepciones;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[4][4];
		
		for(int i =0;i<4;i++) {
			for(int j=0; j<4; j++) {
				matriz[i][j]= (i+1)*(j+1);
			}
		}
	      System.out.println("Matriz inicial:");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print(matriz[i][j] +" ");
	            }
	            System.out.println();
	        }
	        Scanner entrada= new Scanner(System.in);
	        try {
	        	System.out.println("Ingrese el número de fila(0-3): ");
	        	int fila = entrada.nextInt();
	        	System.out.println("Ingrese el número de columna(0-3): ");
	        	int columna = entrada.nextInt();
	        	if(fila<0||fila>=4||columna<0||columna>=4) {
	        		throw new IndexOutOfBoundsException("La posicion indicada esta fuera de los rangos ");
	        	}
	        	System.out.println("Introduce nuevo valor: ");
	        	int nuevoValor = entrada.nextInt();
	        	matriz[fila][columna]= nuevoValor;
	        	System.out.println("Posición actualizada ");
	        	
	        	
	        }catch(IndexOutOfBoundsException e) {
	        	System.out.println("Error: "+ e.getMessage());
	        }finally {
	        	
	        }
	        System.out.println("Matriz actualizada: ");
	        for(int i=0;i<4;i++) {
	        	for(int j=0;j<4;j++) {
	        		System.out.print(matriz[i][j]+" ");
	        	}
	        	 System.out.println();
	        }
		

	}

}
