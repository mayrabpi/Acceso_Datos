package main;

public class Arbol {
	private Nodo root;
	
	
	private Nodo addR(Nodo current, int valor) {
		if(current==null) {
			return new Nodo(valor);
		}
		if(valor<current.valor) {
			current.left= addR(current.left, valor);
		}
		else if(valor>current.valor) {
			current.rigth=addR(current.rigth,valor);
		}
		return current;
	}
	
	public void Add(int valor) {
		this.root = addR(this.root,valor);
	}

	


}
