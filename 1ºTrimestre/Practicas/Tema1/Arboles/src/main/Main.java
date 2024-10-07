package main;

public class Main {

	public static void main(String[] args) {
		
		Arbol arbol = new Arbol();
		 arbol.add(5);
		 arbol.add(3);
		 arbol.add(2);
		 arbol.add(6);
		 arbol.add(1);
		 
		 //arbol.buscar(5);
         System.out.println(arbol.buscar(2));
         arbol.preorden();

	}

}
