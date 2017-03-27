package main.hackerrank.tree;
/**
 * Post-order traversal of a binary tree. Also used in DFS
 * 
 * 		4
 * 	2		6
 *1   3   5   7
 *
 *prints: 1325764
 *
 * @author Sophie
 *
 */
public class PostOrderTraversal {

	void postOrder(Node root) {

		if (root == null) {
			return;
		}

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
}
