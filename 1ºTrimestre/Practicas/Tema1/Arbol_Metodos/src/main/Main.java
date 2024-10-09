package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArbolMetodos arbol = new ArbolMetodos();
		
		arbol.add(6);
		arbol.add(5);
		arbol.add(3);
		arbol.add(2);
		arbol.add(4);
		arbol.add(6);
		
		
		System.out.println(arbol.contarAltura());
		System.out.println(arbol.arbolEstricto());
		
		
	}

}
