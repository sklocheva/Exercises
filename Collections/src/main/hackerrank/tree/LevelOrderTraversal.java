package main.hackerrank.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	void LevelOrder(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			Node node = q.poll();
			System.out.print(node.data + " ");
			if (node.left != null) {
				q.add(node.left);
			}
			if (node.right != null) {
				q.add(node.right);
			}
		}
	}

	void LevelOrder2(Node root) {
		System.out.print(root.data + " ");
		print(root);

	}

	void print(Node root) {
		if (root.left != null && root.right != null) {
			System.out.print(root.left.data + " " + root.right.data + " ");
			print(root.left);
			print(root.right);
		} else if (root.left != null) {
			System.out.print(root.left.data + " ");
			print(root.left);
		} else if (root.right != null) {
			System.out.print(root.right.data + " ");
			print(root.right);
		} else {
			return;
		}
	}
}
