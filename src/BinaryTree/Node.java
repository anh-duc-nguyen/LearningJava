package BinaryTree;

public class Node {
	private int data;
	private Node left = null;
	private Node right = null;
	public Node(){
		data = 0;
		left = null;
		right = null;
	}
	public Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	public Node getLeft(){
		return this.left;
	}
	public Node getRight(){
		return this.right;
	}
	public void setLeft(Node aNode){
		this.left = aNode;
	}
	public void setRight(Node aNode){
		this.right = aNode;
	}
	public int getData(){
		return this.data;
	}
	public void setData(int data){
		this.data = data;
	}
	public void insert(int data){
		Node cur = new Node(data);
		Node iter = this;
		if (cur.getData() <= iter.getData()){
			if (iter.left == null){
				iter.setLeft(cur);
			}else{
				iter.left.insert(data);
			}
		}else{
			if (iter.right==null){
				iter.setRight(cur);
			}else{
				iter.right.insert(data);
			}
		}
	}
	public String toString(){
		if (left == null && right == null){
			return "<" + this.data  + ",null,null>";
		}
		if (left == null){
			return "<" + this.data +",null"+ right.toString() + ">";
		}
		if (right == null){
			return "<"+this.data +"," + left.toString() +  ",null>";
		}
		return "<" + this.data + ","+left.toString()+","+right.toString()+">";
	}
}
