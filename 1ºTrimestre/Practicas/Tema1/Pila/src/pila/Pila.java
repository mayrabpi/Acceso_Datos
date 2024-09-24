package pila;

import java.util.ArrayList;
/**
 * LIFO, que ordenan los elementos LIFO (último en entrar, primero en salir)
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
	 * @return retorna true si esta vacia o false si contiene elementos 
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
	 * @return retorna el tamaño de la pila 
	 */
	public int size() {
		return this.pila.size();
	}
	/**
	 * metodo que retorna el ultimo elemento de la pila y lo elimina
	 * @return 
	 */
	public T pop() throws Exception {
		if(this.isEmpty())
			throw new Exception("Error: Pila vacia");
		
		else
			return this.pila.remove(this.pila.size()-1);
	}
	/**metodo que retorna el ultimo elemento 
	 * si la pila esta vacia salta una excepcion
	 * @return
	 */
	public T peek()throws Exception {
		if(this.isEmpty())
			throw new Exception("Error: Pila vacia");		
		else
			return this.pila.get(this.pila.size()-1);

			
	}
	/**
	 * metodo toString  que retorna todos elmentos de la pila 
	 */
	public String toString() {
		return pila.toString();
	}
	/**
	 * metodo que retorna todos los elementos de la pila 
	 * @return
	 */
	public ArrayList<T> elementosPila() {
		return this.pila;
	}
	
	

}
//isempty, remove, (recupera y elimina si esta vaciA RETORNA NULL), peek (recupera pero no elimina, si esta vacio retorrna null), constante max_size ( representa el tamaño max de la cola)
//add(T)(retorna true si se ha insertado y no hay espacio lanza una exception 
