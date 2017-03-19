package main.hackerrank.tree;

public class BinaryTreeInsertion {

	static Node Insert(Node root, int value) {
		Node current = root;
		Node newNode = new Node();
		
		if (root == null) {
			return newNode;
		}
		
		while (true) {
			if (current.data < value) {
				// if the there are more on the right continue loop
				if (current.right != null) {
					current = current.right;
				} else {
					current.right = newNode;
					return root;
				}
			} else {
				if (current.left != null) {
					current = current.left;
				} else {
					current.left = newNode;
					return root;
				}
			}
		}
	}
}
