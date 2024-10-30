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
		this.root = addRecursive(this.root,valor);
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
		return arbolEstrictoRecursivo(nodo.left)&& arbolEstrictoRecursivo(nodo.rigth);//recursivamente verificamos los hijos 
			
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
		int par = 0;	
		if(nodo.value%2==0) {
			par=nodo.value;
			return par+ sumaParesRecur(nodo.left)+ sumaParesRecur(nodo.rigth);
		}
		return sumaParesRecur(nodo.left)+ sumaParesRecur(nodo.rigth);
	}
	public int valorMaximo() {
		if(this.root == null) {
			return -1;
		}
		
		return valorMaximoRecur(this.root);
		
	}
	
	private int valorMaximoRecur(Nodo node) {
		if(node==null) {
			return -1;
			
		}
		int max_value = node.value;
		int leftMax = valorMaximoRecur(node.left);
		int rightMax= valorMaximoRecur(node.rigth);
		
		return Math.max(max_value, Math.max(leftMax, rightMax));
	}
	private boolean buscarR(Nodo current, int valor) {
		if(current==null) {
			return false;
		}
		if(current.value== valor) {
			return true;
		}
		return valor<current.value?buscarR(current.left,valor):buscarR(current.rigth, valor);
	}
	public boolean buscar(int valor) {
		return buscarR(this.root,valor);
	}
	
	private int sumaimparecur(Nodo n) {
		if(n==null) {
			return 0;
		}
		int suma =0;
		if (n.value%2!=0) {
			suma=n.value;
			return suma+sumaimparecur(n.left)+sumaimparecur(n.rigth);
		
		}
		return sumaimparecur(n.left)+sumaimparecur(n.rigth);
			
	}
	public int sumaimpar() {
		return sumaimparecur(this.root);
	}
	private String buscarladoR(Nodo current, int valor) {
		if(current==null) {
			return "No encontrado";
		}
		if(current.value==valor) {
			return " ";
		}
		String izquierda = buscarladoR(current.left,valor);
		if(!izquierda.equalsIgnoreCase("No encontrado")) {
			return "izquierda -> " + izquierda;
		}
		String derecha = buscarladoR(current.rigth,valor);
		if(!derecha.equalsIgnoreCase("No encontrado")) {
			return "derecha ->" + derecha;
		}
		return "No encontrado";
	}
	public String buscaLado(int valor) {
		if(this.root!=null&& this.root.value==valor) {
			return "Raiz";
		}
		return buscarladoR(this.root,valor );
	}
	public int suma(Nodo n, int nivel) {
		if(n==null) {
		return 0;
		}
		if(nivel==0) {
			return n.value;
		}
		return suma(n.left,nivel-1)+suma(n.rigth,nivel-1);
	}
	
	private int nodoNivel(Nodo n, int nivel) {
		if(n==null) {
			return 0;
		}
		if(nivel==0) {
			return 1;
		}
		return nodoNivel(n.left,nivel-1)+nodoNivel(n.rigth,nivel-1);
	}

}
