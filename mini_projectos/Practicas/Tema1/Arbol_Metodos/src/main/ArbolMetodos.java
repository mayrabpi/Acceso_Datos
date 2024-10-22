package main;
/**
 * En esta clase vamos a implementar distintos metodos para entender la estructura de los arboles
 */
public class ArbolMetodos {
	private Nodo root;
	
	public  ArbolMetodos() {
		
	}
	/**
	 * Metodo que llama al metodo recursivo para añadir elementos a un arbol binario
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
		if(nodo==null) {//si el nodo es null, es un árbol vacío, o llegamos a una hoja
			return true;
		}
		if(nodo.left==null && nodo.rigth!=null||nodo.rigth==null && nodo.left!=null) {
			 return false;// si el nodo sólo tiene un hijo en tonces rotornamos false
		}
		return arbolEstrictoRecursivo(nodo.left)&& arbolEstrictoRecursivo(nodo.rigth);//recursivamente verificamos los hijos hizquierdos
			
	}
	/**
	 * Metodo para encontrar el valor maximo en un arbol binario de busqueda
	 * @return
	 */
	public int encuentraMaximo() {
		return maximoRecursivo(this.root);
	}
	/**
	 * metodo recursivo para encontrar el valor maximo en un arbol binario de busqueda
	 * @param nodo
	 * @return
	 */
	private int maximoRecursivo(Nodo nodo) {
		if(nodo ==null) {
			return -1;//si arbol vacio retornamos -1
		}
		if(nodo.rigth==null) {//si no hay nodos a la derecha este es el valor maximo
			return nodo.value;
		}
		return maximoRecursivo(nodo.rigth);//recursivamente seguimos buscando en el arbol derecho
	}
	/**
	 * metodo que cuenta las hojas de un arbol
	 * @return
	 */
	public int cuentaHojas() {
		return cuentaHojasRecursivo(this.root);
	}
	/**
	 * metodo recursivo que cuenta las hojas de un arbol, las hojas de un arbol son los nodos que no tienen hijos
	 * @param nodo
	 * @return
	 */
	private int cuentaHojasRecursivo(Nodo nodo) {
		if(nodo== null) {
			return 0;
		}
		if(nodo.left==null && nodo.rigth==null) {
			return 1;//si el nodo no tiene hijos es una hoja retornamos 1 
		}
		return cuentaHojasRecursivo(nodo.left)+ cuentaHojasRecursivo(nodo.rigth);//contamos las hojas 
	}
	/**
	 * Metodo que llama al metodo recursivo para sumar los nodos de un arbol binario
	 * @return
	 */
	public int sumaNodos() {
		return sumaNodosRecursivo(this.root);
	}
	/**
	 * Metodo recursivo que suma los nodos de un arbol binario
	 * @param nodo
	 * @return
	 */
	private int sumaNodosRecursivo(Nodo nodo) {
		if(nodo == null) {//si nodo null retornamos 0
			return 0;
		}
		//suma del valor actual mas la suma de los nodos izquieros y derechos
		return nodo.value +sumaNodosRecursivo(nodo.left)+sumaNodosRecursivo(nodo.rigth);
	}
	/**
	 * Metodo que llama al metodo recursivo para sumar los nodos de valor pares de un arbol binario
	 * @return
	 */
	public int SumaNodosPares() {
		return sumaParesRecur(this.root);
	}
	/**
	 *Metodo recursivo que suma los numeros pares de un arbol binario
	 * @param nodo
	 * @return
	 */
	private int sumaParesRecur(Nodo nodo) {
		if(nodo==null) {
			return 0;
		}
		int suma = 0;	
		if(nodo.value%2==0) {
			suma=nodo.value;
			return suma+ sumaParesRecur(nodo.left)+ sumaParesRecur(nodo.rigth);
		}
		return sumaParesRecur(nodo.left)+ sumaParesRecur(nodo.rigth);
	}
	

}
