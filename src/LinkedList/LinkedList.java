package LinkedList;
public class LinkedList {
	/*
	 * A simple Linked List 
	 * @author: Anh Nguyen
	 * @version : May 18, 2018
	 */
	private Node first;
	private long size; 
	public LinkedList(){
		size = 0;
		this.first = new Node();
	}
	public LinkedList( Object first ){
		size = 1;
		this.first = new Node( first );
	}
	public Node getFirst(){
		return first;
	}
	public void setFirst( Node newFirst ){
		this.first = newFirst;
	}
	public void insertFirst( Object data ){
		Node cur = new Node(data);
		cur.setNext(this.first);
		setFirst(cur);
		size ++;
	}
	public void insertLast( Object data ){
		Node curr = new Node(data);
		Node iter = this.first;
		while (iter.hasNext()){
			iter = iter.getNext();
		}
		iter.setNext(curr);
		size++;
	}
	public void removeFirst(){
		this.first = this.first.getNext();
		size --;
	}
	public void removeLast(){
		Node iter1 = this.first;
		Node iter2 = iter1.getNext();
		while (iter2.hasNext()){
			iter1 = iter1.getNext();
			iter2 = iter2.getNext();
		}
		iter1.setNext(null);
		size --;
	}
	public void blindRemove(Node aNode){
		Node nextNode = aNode.getNext();
		aNode.setData(nextNode.getData());
		aNode.setNext(nextNode.getNext());
		size --;
	}
	public void removeFromBack(int k)
	{
		if (k > size){
			System.out.println("K is greater than the size of the List");
			return;
		}
		if (k == size){
			this.removeLast();
			return;
		}
		if (k == 0){
			this.removeFirst();
			return;
		}
		Node iter1 = this.first;
		Node iter2 = this.first;
		for (int i = 0; i < k -1; i++){
			iter2 = iter2.getNext();
		}
		while (iter2.hasNext()){
			iter1 = iter1.getNext();
			iter2 = iter2.getNext();
		}
		this.blindRemove(iter1);
	}
	
	public long getSize(){
		return size;
	}
	public String toString(){
		String returnString ="";
		Node iter = this.first;
		for ( int i = 0; i < size;i++ ){
			returnString += iter.getData() + "->";
			iter = iter.getNext();
		}
		return returnString;
	}
}
