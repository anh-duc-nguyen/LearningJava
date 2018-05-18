package BinaryTree;

public class BinarySearchTree extends Node {
	/*
	 * A simple Binary Search Tree of int number
	 * @author: Anh Nguyen
	 * @version: May 18
	 */
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
	public String inOrder(){
		return this.root.inOrder();
	}
	public String preOrder(){
		return this.root.preOrder();
	}
	public String postOrder(){
		return this.root.postOrder();
	}
}
