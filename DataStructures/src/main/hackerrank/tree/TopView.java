package main.hackerrank.tree;

/**
 * Print the top view (outer sides) of a binary tree.
 * 
 * @author Sophie
 *
 */
public class TopView {

	public void top_view(Node root) {
		traverseLeft(root.left);
		System.out.print(root.data + " ");
		traverseRight(root.right);
	}

	/**
	 * Print the most left outer parts recursively.
	 * 
	 * @param root
	 */
	private void traverseLeft(Node root) {
		if (root == null) {
			return;
		}
		traverseLeft(root.left);
		System.out.print(root.data + " ");
	}

	/**
	 * Print the most right outer parts recursively.
	 * 
	 * @param root
	 */
	private void traverseRight(Node root) {
		System.out.print(root.data + " ");
		if (root.right != null) {
			traverseRight(root.right);
		}
	}

}
