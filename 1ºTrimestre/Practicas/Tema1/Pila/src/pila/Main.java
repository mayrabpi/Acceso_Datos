package pila;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pila numeros = new Pila();
		Pila palabras = new Pila();
		
		numeros.push(1);
		numeros.push(2);
		numeros.push(3);
		numeros.push(4);
		System.out.println(numeros.size());
		System.out.println(numeros.peek());
		System.out.println(numeros.pop());
		System.out.println(numeros.size());
		System.out.println(numeros.toString());
	
		palabras.push("hola");
		palabras.push("cómo");
		palabras.push("estas");
		
		System.out.println(palabras.size());
		System.out.println(palabras.toString());
		
		
		

	}

}
