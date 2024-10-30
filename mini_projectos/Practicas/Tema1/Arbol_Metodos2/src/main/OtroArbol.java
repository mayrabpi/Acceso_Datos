package main;

public class OtroArbol {
	public Nodo root;
	
	public void add(int valor) {
		this.root= addRecursive(this.root, valor);
	}

	private Nodo addRecursive(Nodo current, int valor) {
		if (current == null) {
			return new Nodo(valor);
		}
		if (valor < current.valor) {
			current.left = addRecursive(current.left, valor);
		} else if (valor > current.valor) {
			current.rigth = addRecursive(current.rigth, valor);
		}
		return current;
	}
	
	private void preordenR(Nodo n) {
		if(n==null) {
			return;
		}
		System.out.println("valor: "+ n.valor);
		preordenR(n.left);
		preordenR(n.rigth);
	}
	public void preorden() {
		preordenR(this.root);
	}
	//metodo que comprueba si dos arboles son iguales 
	private boolean igurecu(Nodo current, Nodo n) {
		if(current==null && n==null) {
			return true;
		}
		if(current==null || n== null) {
			return false;
		}
		return current.valor==n.valor&&igurecu(current.left,n.left)&&igurecu(current.rigth,n.rigth);
	}
	public boolean iguales(Arbol otro) {
		return igurecu(this.root, otro.root);
	}

}
