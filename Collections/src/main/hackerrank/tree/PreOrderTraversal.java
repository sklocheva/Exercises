package main.hackerrank.tree;

public class PreOrderTraversal {

	public void preOrder(Node root) {

		if (root == null) {
			return;
		}
		System.out.print(root.data);

		preOrder(root.left);
		preOrder(root.right);
	}

	public void preOrderNonRecursive(Node root) {
		Node pre;
		if (root == null)
			return;
		Node curr = root;
		while (curr != null) {
			if (curr.left == null) {
				System.out.print(curr.data + " ");
				curr = curr.right;
			} else {
				pre = curr.left;
				while (pre.right != null && pre.right != curr)
					pre = pre.right;
				if (pre.right == null) {
					pre.right = curr;
					System.out.print(curr.data + " ");
					curr = curr.left;
				} else {
					pre.right = null;
					curr = curr.right;
				}
			}
		}
	}
}
