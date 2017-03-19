package main.hackerrank.tree;

public class HeightOfBinaryTree {

	static int l;
	static int r;

	static int height(Node root) {
		if (root == null) {
			return -1;
		}
		l = height(root.left);
		r = height(root.right);
		if (l >= r) {
			return 1 + l;
		} else {
			return 1 + r;
		}
	}

	static int heightMathMax(Node root) {
		if (root == null) {
			return -1;
		}
		return (1 + Math.max(heightMathMax(root.left), heightMathMax(root.right)));
	}

}
