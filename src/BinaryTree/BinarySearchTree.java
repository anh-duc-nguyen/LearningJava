package BinaryTree;

public class BinarySearchTree extends Node {
	private Node root;
	private long size;
	public BinarySearchTree(){
	}
	public BinarySearchTree(int data){
		
	}
	public Node getRoot(){
		return this.root;
	}
	public long getSize(){
		return size;
	}
	public void insert(int data){
		root.insert(data);
		size ++;
	}
//	public String toString(){
//		
//	}
//	public void insert(int data){
//		Node cur = new Node(data);
//		Node iter = this.root;
//		if (data <= iter.getData()){
//			iter.getLeft().insert(data);
//		}else{
//			iter.getRight().insert(data);
//		}
//	}
	

}
