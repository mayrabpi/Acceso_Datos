package pila;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Pila numeros = new Pila();
		Pila palabras = new Pila();
		
		numeros.push(1);
		numeros.push(2);
		numeros.push(3);
		numeros.push(4);
		System.out.println("Elementos que hay en la pila: "+ numeros.size());
		System.out.println("Ultimo elemento de la pila: "+ numeros.peek());
		System.out.println(numeros.toString());
		System.out.println("Elemento eliminado de la pila: "+ numeros.pop());
		System.out.println(numeros.size());//elementos que hay en la pila despues del pop 
		System.out.println(numeros.elementosPila());
	
		palabras.push("hola");
		palabras.push("cómo");
		palabras.push("estas");
		
		System.out.println(palabras.size());
		System.out.println(palabras.elementosPila());
		
		
		

	}

}
