package BinaryTree;

public class TestNode {
	public static void main(String[] args){
		Node a = new Node(12);
		a.insert(11);
		a.insert(13);
		a.insert(16);
		a.insert(17);
		a.insert(15);
		a.insert(14);
		System.out.println(a.toString());
	}
}
