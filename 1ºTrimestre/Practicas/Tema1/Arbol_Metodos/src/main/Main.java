package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArbolMetodos arbol = new ArbolMetodos();
		
		arbol.add(20);
		arbol.add(25);
		arbol.add(7);
		arbol.add(5);
		arbol.add(8);
		arbol.add(24);
		arbol.add(26);
		
		
		System.out.println(arbol.contarAltura());
		System.out.println(arbol.arbolEstricto());
		System.out.println(arbol.encuentraMaximo());
		System.out.println(arbol.sumaNodos());
		System.out.println(arbol.SumaNodosPares());
		
		
	}

}
