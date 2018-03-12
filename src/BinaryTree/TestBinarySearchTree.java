package BinaryTree;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		int a = 14;
		BinarySearchTree bst = new BinarySearchTree(a);
		bst.insert(12);
		bst.insert(13);
		bst.insert(16);
		bst.insert(25);
		bst.insert(11);
		bst.insert(17);
		bst.insert(21);
		bst.insert(10);
		System.out.println(bst.toString());
		System.out.println("in order traversal  : " + bst.inOrder());
		System.out.println("pre order traversal : " + bst.preOrder());
		System.out.println("post order traversal: " + bst.postOrder());
	}

}
