package main.hackerrank.tree;

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
