package main;

public class Arbol {
	private Nodo root;
	
	public Arbol() {
		
	
	}
	
	public void add(int value) {
		this.root= addRecursive(this.root, value);
	}
	
	private Nodo addRecursive(Nodo current, int valor) {
		if(current== null) {
			return new Nodo(valor);
		}
		if(valor < current.value) {
			current.left = addRecursive(current.left, valor);
		}else if(valor>current.value) {
			current.rigth = addRecursive(current.rigth, valor);
		}
		return current;
	}
	
	private boolean buscarRecursivo(Nodo current, int valor) {
		if(current == null) {
			return false;//se para
		}
		if(valor == current.value) {
			return true;// se para
		}
		return valor< current.value ? buscarRecursivo(current.left, valor):buscarRecursivo(current.rigth,valor);
	}
	
	public boolean buscar(int value) {
		return buscarRecursivo(this.root, value);
	}


}
