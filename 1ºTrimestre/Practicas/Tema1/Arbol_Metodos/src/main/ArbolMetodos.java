package main;
/**
 * En esta clase vamos a implementar distintos metodos para entender la estructura de los arboles
 */
public class ArbolMetodos {
	private Nodo root;
	
	public  ArbolMetodos() {
		
	}
	/**
	 * 
	 * @param valor
	 */
	public void add(int valor) {
		this.root = addRecursive(root,valor);
	}
	/**
	 * metodo recursivo que añede valores al arbol
	 * @param current
	 * @param valor
	 * @return
	 */
	private Nodo addRecursive(Nodo current, int valor) {
		if(current==null) {
			return new Nodo(valor);
		}
		if(valor<current.value) {
			current.left=addRecursive(current.left,valor);
		}
		else if(valor>current.value) {
			current.rigth=addRecursive(current.rigth,valor);
		}
		return current;
	}
	/**
	 * metodo que cuenta la altura
	 * @return
	 */
	public int contarAltura() {
		return contarAlturaRecursive(this.root);
	}
	/**
	 * metodo recursivo que cuenta la altura
	 * @param n
	 * @return
	 */
	private int contarAlturaRecursive(Nodo n) {
		if(n==null) {
			return 0;
		}else
			return 1+ Math.max(contarAlturaRecursive(n.rigth), contarAlturaRecursive(n.left));
	}
	/**
	 * metodo que comprueba si un arbol es estricto o no 
	 * @return
	 */
	public boolean arbolEstricto() {
		return arbolEstrictoRecursivo(this.root);
	}
	/**
	 * metodo recursivo que comprueba si un arbol es estricto o no 
	 * @param nodo
	 * @return
	 */
	private boolean arbolEstrictoRecursivo(Nodo nodo) {
		if(nodo==null) {
			return true;
		}
		if(nodo.left==null && nodo.rigth!=null||nodo.rigth==null && nodo.left!=null) {
			 return false;
		}
		return arbolEstrictoRecursivo(nodo.left)&& arbolEstrictoRecursivo(nodo.rigth);
			
	}
	

}
