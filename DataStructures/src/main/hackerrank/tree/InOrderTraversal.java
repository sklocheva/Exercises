package main.hackerrank.tree;
/**
 * Inorder traversal of binary tree.
 * 
 * 		4
 * 	2		6
 *1   3   5   7
 *
 *prints: 1234567
 *
 * @author Laptop
 *
 */
public class InOrderTraversal {

	void inOrder(Node root) {

		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
}
