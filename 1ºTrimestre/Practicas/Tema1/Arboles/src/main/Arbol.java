package main;

public class Arbol {
	private Nodo root;
	
	public Arbol() {
		
	
	}
	
	public void add(int value) {
		this.root= addRecursive(this.root, value);
	}
	
	private Nodo addRecursive(Nodo current, int valor) {
		if(current== null) {
			return new Nodo(valor);
		}
		if(valor < current.value) {
			current.left = addRecursive(current.left, valor);
		}else if(valor>current.value) {
			current.right = addRecursive(current.right, valor);
		}
		return current;
	}
	
	private boolean buscarRecursivo(Nodo current, int valor) {
		if(current == null) {
			return false;//se para
		}
		if(valor == current.value) {
			return true;// se para
		}
		return valor< current.value ? buscarRecursivo(current.left, valor):buscarRecursivo(current.right,valor);
	}
	
	public boolean buscar(int value) {
		return buscarRecursivo(this.root, value);
	}
	// ---------------------- Methods to delete elements
	   public void delete(int value) {
	    root = deleteRecursive(root, value);
	   }
	   
	   private Nodo deleteRecursive(Nodo current, int value) {
	// If the current node is null, just in case
	    if (current == null) {
	    return null;
	    }

	// In this if sentence, the value of the node to delete was found
	    if (value == current.value) {

	       
	       // Case 1: The node is a leaf node
	       if (current.left == null && current.right == null) {
	        return null;
	       }
	       
	       // Case 2: The node has one child
	       if (current.right == null) {
	        return current.left;
	       }

	       if (current.left == null) {
	        return current.right;
	       }
	       
	       // Case 3: The node has two children
	       int smallestValue = findSmallestValue(current.right);
	       System.out.println(smallestValue);
	       current.value = smallestValue;
	       current.right = deleteRecursive(current.right, smallestValue);
	    }
	   
	// In this if sentence, the value is less than the value of the current node
	    if (value < current.value) {
	    current.left = deleteRecursive(current.left, value);
	    return current;
	    }
	   
	// In this if sentence, the value is bigger than the value of the current node
	    current.right = deleteRecursive(current.right, value);
	    return current;
	   }
	   
	   // We’ll use the smallest node of the soon to be deleted node’s right sub-tree
	   private int findSmallestValue(Nodo root) {
	    return root.left == null ? root.value : findSmallestValue(root.left);
	   }
	   
	   public void preorden() {
		   preordenRecursivo(this.root);
	   }
	     
	   private void preordenRecursivo(Nodo n) {
		   if(n != null) {
			   System.out.println(n.value);
			   preordenRecursivo(n.left);
			   preordenRecursivo(n.right);
			   
		   }
	   }
	   public void inorden() {
		   inordenRecursivo(this.root);
	   }
	   private void inordenRecursivo(Nodo n) {
		   if(n!=null) {
			   System.out.println(n.value);
		   }
	   }
	   
	   public void postorden(){
		   postordenRecursivo(this.root);
		   
	   }
	   private void postordenRecursivo(Nodo n) {
		   
	   }


}
