package LinkedList;
public class Node {
	/*
	 * Node class for a Linked List
	 * @author: Anh Nguyen
	 * @version May 18, 2018
	 */
	private Node next;
	private Object data;
	public Node(){
		this.next = null;
		this.data = null;
	}
	public Node (Object data){
		this.data = data;
	}
	public void setNext (Node nextNode){
		this.next = nextNode;
	}
	public boolean hasNext(){
		return this.next != null;
	}
	public Object getData(){
		return this.data;
	}
	public Node getNext(){
		return this.next;
	}
	public void setData(Object data){
		this.data = data;
	}
}
