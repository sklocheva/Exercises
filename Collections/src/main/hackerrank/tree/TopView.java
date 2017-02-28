package main.hackerrank.tree;

public class TopView {

	public void top_view(Node root) {
		traverseLeft(root.left);
		System.out.print(root.data + " ");
		traverseRight(root.right);
	}

	private void traverseLeft(Node root) {
		if (root == null) {
			return;
		}
		traverseLeft(root.left);
		System.out.print(root.data + " ");
	}

	private void traverseRight(Node root) {
		System.out.print(root.data + " ");
		if (root.right != null) {
			traverseRight(root.right);
		}
	}

}
