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

}
