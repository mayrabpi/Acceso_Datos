package main;

import java.util.LinkedList;
/**
 * Las colas suelen ordenar los elementos de forma FIFO (primero en entrar, primero en salir)
 * @param <T>
 */
public class Cola <T>{
	private LinkedList<T> cola;
	final int MAX_SIZE=4;
	
	public Cola() {
		this.cola= new LinkedList();
	}
	/**
	 * Metodo que comprueba si la cola esta vacia
	 * @return retorna true si esta vacia o false si tiene elementos
	 */
	public boolean isEmpty() {
		if(this.cola.size()<=0) {
			return true;
		}else
			return false;
	}
	/**
	 * 
	 * @return
	 */
	public T peek() {
		if(this.cola.isEmpty())
			return null;
		
		else
			return this.cola.peek();
	}
	/**
	 * 
	 */
	public void remove() {
		if(this.cola.isEmpty())
			System.out.println("Cola vacia");
		else
		this.cola.remove();
	}
	/**
	 * 
	 * @param elem
	 * @throws Exception
	 */
	
	public boolean add(T elem) throws Exception {
		try {
			if(this.cola.size()>= this.MAX_SIZE)
				throw new Exception("Error: Cola llena");	
			
			else 
				this.cola.add(elem);
			return true;
		}catch (Exception e) {
			System.err.println("error: cola llena");
			return false;
		}		
	}
	public LinkedList<T> elementCola() {
		return cola;
	}
	
	

}




























//isempty, remove, (recupera y elimina si esta vaciA RETORNA NULL), peek (recupera pero no elimina, si esta vacio retorrna null), constante max_size ( representa el tamaño max de la cola)
//add(T)(retorna true si se ha insertado y no hay espacio lanza una exception 