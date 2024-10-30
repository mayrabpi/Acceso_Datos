package main;

public class Arbol1 {
	private Nodo root;
	
	private Nodo addr(Nodo current, int valor) {
		if(current == null) {
			return new Nodo(valor);
		}
		if(valor<current.valor) {
			current.left= addr(current.left,valor);
		}
		else if (valor>current.valor) {
			current.right=addr(current.right,valor);
		}
		return current;
	}
	
	public void add(int valor) {
		this.root=addr(this.root,valor);
	}
	
	private void preor(Nodo n) {
		if(n==null) {
			return;
		}
		System.out.println("valor: "+ n.valor);
		preor(n.left);
		preor(n.right);
	}
	public void preo() {
		preor(this.root);
	}
	
	private boolean buscarR(Nodo current, int valor) {
		if(current==null) {
			return false;
		}
		if(current.valor==valor) {
			return true;
		}
		return valor<current.valor?buscarR(current.left, valor):buscarR(current.right,valor);
	}
	public boolean buscar(int valor) {
		return buscarR(this.root,valor);
	}
	
	private int sumaNodo(Nodo n) {
		if(n==null) {
			return 0;
		}
		return n.valor+ sumaNodo(n.left)+sumaNodo(n.right);
	}
	public int suman() {
		return sumaNodo(this.root);
	}
	

}
