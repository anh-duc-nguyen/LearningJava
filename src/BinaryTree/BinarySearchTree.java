package BinaryTree;

public class BinarySearchTree extends Node {
	private Node root;
	private long size;
	public BinarySearchTree(){
	}
	public BinarySearchTree(int data){
		root = new Node(data);
	}
	public Node getRoot(){
		return this.root;
	}
	public long getSize(){
		return size;
	}
	public void insert(int data){
		this.root.insert(data);
		size ++;
	}
	public String toString(){
		return this.root.toString();
	}
}
