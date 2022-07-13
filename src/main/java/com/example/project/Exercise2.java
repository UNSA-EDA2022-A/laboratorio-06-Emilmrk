package com.example.project;

public class Exercise2 {

    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstIguales(tree1, tree2));
        
    }


    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(BST<T> a){
    	if (a.isEmpty()) {
			return false;
		}else {
			return binario(a.root);
		}
    }
    
    public <T extends Comparable<T>>Boolean binario(Node<T> a) {

    	if (value(a.left)==value(a.right)) {
			return binario(a.left)&&binario(a.right);
		}
		return false;

    }
    
    public <T extends Comparable<T>> boolean value(Node<T> nodo1) {
    	if(nodo1!=null) return true; 
    	return false;
    }
}
