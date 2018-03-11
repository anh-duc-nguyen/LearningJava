package LinkedList;
public class TestLinkedList {

	public static void main(String[] args) {
		int a = 12;
		int b = 11;
		int c = 13;
		int d = 14;
		LinkedList myLinkedList = new LinkedList(a);
		myLinkedList.insertFirst(b);
		myLinkedList.insertLast(c);
		myLinkedList.insertLast(d);
		System.out.printf("Size of this linkedList is %d \n", myLinkedList.getSize());
		System.out.print("The linked List is :");
		System.out.println(myLinkedList.toString());
		System.out.println("remove the First element of the linked list");
		myLinkedList.removeFirst();
		System.out.print("The linked List is :");
		System.out.println(myLinkedList.toString());
		System.out.println("remove the Last element of the linked list");
		myLinkedList.removeLast();
		System.out.print("The linked List is :");
		System.out.println(myLinkedList.toString());
		
		System.out.println("=============start testing awesome stuff==================");
		System.out.println("Insert a lot of stuff");
		for (int i = 14; i <24 ;i++){
			myLinkedList.insertLast(i);
		}
		System.out.print("The linked List is :");
		System.out.println(myLinkedList.toString());
		Node iter = myLinkedList.getFirst();
		for (int i = 0; i < 6; i++){
			iter = iter.getNext();
		}
		System.out.printf("going the this Node: %d and remove it \n", iter.getData());
		myLinkedList.blindRemove(iter);
		System.out.print("The linked List is :");
		System.out.println(myLinkedList.toString());
		
		int k = 6;
		System.out.printf("remove the %d element from the back \n",k);
		myLinkedList.removeFromBack(k);
		System.out.print("The linked List is :");
		System.out.println(myLinkedList.toString());
		
	}

}
