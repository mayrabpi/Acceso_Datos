package main;

public class Arbol {
	private Nodo root;

	public Arbol() {

	}

	/**
	 * 
	 * @param value
	 */
	public void add(int value) {
		this.root = AddRecursive(this.root, value);
	}

	/**
	 * 
	 * @param current
	 * @param valor
	 * @return
	 */
	private Nodo AddRecursive(Nodo current, int valor) {
		if (current == null) {
			return new Nodo(valor);
		}
		if (valor < current.value) {
			current.left = AddRecursive(current.left, valor);
		} else if (valor > current.value) {
			current.right = AddRecursive(current.right, valor);
		}
		return current;
	}

	/**
	 * 
	 */
	public void preorden() {
		preordenRecursivo(this.root);
	}

	/**
	 * 
	 * @param n
	 */
	private void preordenRecursivo(Nodo n) {
		if (n == null) {
			return;
		}
		System.out.println("valor:" + n.value);
		preordenRecursivo(n.left);
		preordenRecursivo(n.right);

	}

	public void inorden() {
		inordenRecursivo(this.root);
	}

	private void inordenRecursivo(Nodo n) {
		if (n == null) {
			return;
		}
		inordenRecursivo(n.left);
		System.out.println("valor:" + n.value);
		inordenRecursivo(n.right);

	}

	public boolean buscar(int valor) {
		return buscarRecursivo(this.root, valor);
	}

	private boolean buscarRecursivo(Nodo current, int valor) {
		if (current == null) {
			return false;
		}
		if (valor == current.value) {
			return true;
		}
		return valor < current.value ? buscarRecursivo(current.left, valor) : buscarRecursivo(current.right, valor);
	}

}
