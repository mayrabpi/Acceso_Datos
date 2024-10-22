package main;

public class Main {

	public static void main(String[] args) throws Exception  {
		Cola numero = new Cola();
		
		numero.add(4);
		numero.add(3);
		numero.add(1);
		numero.add(5);
		System.out.println(numero.elementCola());
	    numero.remove();
		
		
		System.out.println(numero.elementCola());
	

	}

}
