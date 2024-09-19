package pila;

import java.util.ArrayList;
/**
 * 
 * 
 * @param <T>
 */
public class Pila<T> {
	private ArrayList<T> pila;//atributo de tipo ArrayList
	/**
	 * constructora
	 */
	public Pila() {
		this.pila= new ArrayList();
	}
	/**
	 * metodo booleano que comprueba si la pila esta vacia
	 * @return
	 */
	public boolean isEmpty() {
		if(this.pila.isEmpty())
			return true;
		
		else
			return false;
	}
	/**
	 * Metodo que agrega un elemento de tipo T a la pila 
	 * @param elemento
	 */
	public void push(T elemento) {
		this.pila.add(elemento);
	}
	/**
	 * Metodo que devuelve cuantos elementos hay en la  pila
	 * @return
	 */
	public int size() {
		return this.pila.size();
	}
	/**
	 * metodo que retorna el ultimo elemento de la pila y lo elimina
	 * @return
	 */
	public T pop() {
		if(!this.isEmpty())
			return this.pila.remove(this.pila.size()-1);
		
		else
			System.out.println("Error pila vacia");
			return null;
	}
	/**metodo que retorna el ultimo elemento 
	 * 
	 * @return
	 */
	public T peek() {
		if(!this.isEmpty())
			return this.pila.get(this.pila.size()-1);
		
		else
			System.out.println("Error pila vacia");
		return null;
			
	}
	public String toString() {
		return pila.toString();
	}
	
	

}
