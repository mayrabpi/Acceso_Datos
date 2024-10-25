package main;

public class Arbol {
	private Nodo root;
	
	public Arbol() {
		
	}
	public void add(int valor) {
		this.root = addrecursive(this.root,valor);
	}
	
	private Nodo addrecursive(Nodo current, int valor) {
		if(current == null) {
			return new Nodo(valor);
		}
		if(valor<current.valor) {
			current.left= addrecursive(current.left, valor);
		}
		else if(valor>current.valor) {
			current.rigth=addrecursive(current.rigth, valor);
		}
		return current;
	}
	
	public boolean iguales(OtroArbol otro) {
		return sonIguales(this.root,otro.root);
	}
	
	private boolean sonIguales(Nodo current, Nodo n) {
		if (current==null && n == null) {
			return true;
		}
		if(current ==null ||n== null) {
			return false;
		}
		return current.valor== n.valor && sonIguales(current.left, n.left)&& sonIguales(current.rigth,n.rigth);
	}
	


}
