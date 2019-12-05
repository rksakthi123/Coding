package com.java.datastructure;

public class BinarySearchTree {
	
	 static BST root;
	
	class BST{
		private BST left;
		public BST getLeft() {
			return left;
		}

		public void setLeft(BST left) {
			this.left = left;
		}

		public BST getRight() {
			return right;
		}

		public void setRight(BST right) {
			this.right = right;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		private BST right;
		private int data;
		
		BST(){
			root=null;
		}
		
		BST(int value){
			data=value;
			left=right=null;
		}
	}

	public static void main(String[] args) {
		BinarySearchTree obj=new BinarySearchTree();
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
		
		obj.printInorder(root);

	}
	 void printInorder(BST node) 
	    { 
	        if (node == null) 
	            return;
	        printInorder(node.left); 
	        System.out.print(node.getData() + " "); 
	        printInorder(node.right); 
	    }
	
	public BST insertNode(BST root,int value) {
		if(root==null) {
			return new BST(value);
		}
		if(root.getData()<value) {
			root.left=insertNode(root.left, value);
		}else {
			root.right=insertNode(root.right, value);
		}
		return root;
	}
	
	
	public void insert(int value) {
		root=insertNode(root,value);
	}
	

}
