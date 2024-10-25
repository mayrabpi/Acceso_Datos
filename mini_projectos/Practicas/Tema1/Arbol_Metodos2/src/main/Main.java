package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arbol a1 = new Arbol();
		OtroArbol a2 = new OtroArbol();
		
		a1.add(20);
		a1.add(16);
		a1.add(25);
		a1.add(8);
		a1.add(10);
		a1.add(30);
		

		a2.add(20);
		a2.add(16);
		a2.add(25);
		a2.add(8);
		a2.add(10);
		a2.add(30);
		System.out.println(a1.iguales(a2));
		
		
	

	
	}

}
