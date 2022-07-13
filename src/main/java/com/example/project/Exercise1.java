package com.example.project;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstSimilares(tree1, tree2));
        
    }


    public <T extends Comparable<T>> boolean bstSimilares(BST<T> a1, BST<T> a2){
    		
    	if(a1.isEmpty()&&a2.isEmpty()) {
    		return true;
    	}else {
    		if (value(a1.root)==value(a2.root)) {
				return value(a1.root.right)==value(a2.root.right)&&value(a1.root.left)==value(a2.root.left);
			}else {
				return false;
			}
    	}
    }
    
    public <T extends Comparable<T>> boolean value(Node<T> nodo1) {
    	if(nodo1!=null) return true; 
    	return false;
    }
}
