package BinaryTree;
import java.util.Random;
public class TestBinarySearchTree {
	/*
	 * a Test program for Binary Search Tree
	 */

	public static void main(String[] args) {
		int a = 500;
		Random random = new Random();
		BinarySearchTree bst = new BinarySearchTree(a);
		for (int i = 0; i<= 975; i++)
		{
			int n = random.nextInt(5000) + 1;
			bst.insert(n);
		}
		//System.out.println(bst.toString());
		System.out.println("in order traversal  : " + bst.inOrder());
		//System.out.println("pre order traversal : " + bst.preOrder());
		//System.out.println("post order traversal: " + bst.postOrder());
	}

}
