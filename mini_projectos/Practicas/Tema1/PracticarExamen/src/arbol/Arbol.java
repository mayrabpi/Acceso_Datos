package arbol;

public class Arbol {
	public Nodo root;

	public void add(int valor) {
		this.root = addRecursive(this.root, valor);
	}

	private Nodo addRecursive(Nodo current, int valor) {
		if (current == null) {
			return new Nodo(valor);
		}
		if (valor < current.valor) {
			current.left = addRecursive(current.left, valor);

		} else if (valor > current.valor) {
			current.right = addRecursive(current.right, valor);
		}
		return current;
	}

	public boolean buscar(int valor) {
		return buscarRecursivo(this.root, valor);
	}

	private boolean buscarRecursivo(Nodo current, int valor) {
		if (current == null) {
			System.out.println("Elemento no se encuentra ");
			return false;

		}
		if (current.valor == valor) {
			System.out.println("El elemento si se esá ");
			return true;
		}
		return valor < current.valor ? buscarRecursivo(current.left, valor) : buscarRecursivo(current.right, valor);

	}
    /**
     * metodo publico para iniciar la busqueda de elemento en la izquierda o derecha
     * @param valor
     * @return
     */
	public String buscaLadoElemento(int valor) {
		// si no es la raiz, comenzamos la busqueda en los subárboles
		if( this.root.valor==valor) {
			return "Raiz";
		}
		return buscarElementoLadoRecur(this.root, valor);
	}
    /**
     * metodo recursivo para encontrar el elmenento y decir si esta en la izquierda o derecha
     * @param current
     * @param valor
     * @return
     */
	private String buscarElementoLadoRecur(Nodo current, int valor) {
		if (current == null) {
			return "No encontrado";
		}
		//si el valor esta en el nodo actual retornamos cadena vacia
		if (current.valor == valor) {
			return " ";
		}
		//buscamos en el subarbol izquiero
		String ladoIzquierdo = buscarElementoLadoRecur(current.left, valor);
		if (!ladoIzquierdo.equals("No encontrado")) {
			return "Izquierda =>" + ladoIzquierdo;
		}
		//buscamos en el subarbol dereccho
		String ladoDerecho = buscarElementoLadoRecur(current.right, valor);
		if (!ladoDerecho.equals("No encontrado")) {
			return "derecha=>" + ladoDerecho;
		}
		return "No encontrado";

	}
}
