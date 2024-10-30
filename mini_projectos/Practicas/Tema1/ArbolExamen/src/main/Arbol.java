package main;

public class Arbol {
	private Nodo root;
	
	
	private Nodo addR(Nodo current, int valor) {
		if(current == null) {
			return new Nodo(valor);
		}
		if(valor<current.valor) {
			current.left= addR(current.left, valor);
		}
		else if (valor>current.valor) {
			current.right=addR(current.right,valor);
		}
		return current;
	}
	public void add(int valor) {
		this.root=addR(this.root,valor);
	}
	
	private void preordenR(Nodo n) {
		if(n==null) {
			return;
		}
		System.out.println("valor: "+ n.valor);
		preordenR(n.left);
		preordenR(n.right);
	}
	public void preorden() {
		preordenR(this.root);
	}
	
	private boolean buscarR(Nodo current, int valor) {
		if(current == null) {
			return false;
		}
		if(current.valor==valor) {
			return true;
		}
		return valor<current.valor?buscarR(current.left,valor):buscarR(current.right, valor);
		
	}
	public boolean Buscar(int valor) {
		return buscarR(this.root, valor);
	}
	
	private String buscarladoR(Nodo current, int valor) {
		if(current==null) {
			return "No encontrado";
		}
		if(current.valor==valor) {
			return "";
		}
		String ladoIzquierdo=buscarladoR(current.left,valor);
		if(!ladoIzquierdo.equals("No encontrado")) {
			return "Izquierda ";
		}
		String ladoDerecho = buscarladoR(current.right,valor);
		if(!ladoDerecho.equals("No encontrado")) {
			return "Derecha";
		}
		return "No encontrado";
	}
	public String buscarLado(int valor) {
		if(this.root!=null&& this.root.valor==valor) {
			return "Raiz";
		}
		return buscarladoR(this.root,valor);
	}
	
	private boolean estrictiR(Nodo n) {
		if(n==null) {
			return true;
		}
		if(n.left==null&& n.right!=null || n.right==null&&n.left!=null) {
			return false;
		}
		return estrictiR(n.left)&&estrictiR(n.right);
			
	}
	public boolean estricto() {
		return estrictiR(this.root);
	}
	
	private int sumaNR(Nodo n) {
		if(n==null) {
			return 0;
		}
		return n.valor+sumaNR(n.left)+sumaNR(n.right);
	}
	public int sumaNodo() {
		return sumaNR(this.root);
	}
	

}
