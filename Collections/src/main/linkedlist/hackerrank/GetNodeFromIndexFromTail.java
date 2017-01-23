package main.linkedlist.hackerrank;

import main.linkedlist.Node;

public class GetNodeFromIndexFromTail {

	public int GetNode(Node head, int n) {
		// loop until you are n nodes from the tail
		while (!(helper(head, n))) {
			head = head.next;
		}
		return head.data;

	}

	private boolean helper(Node node, int n) {
		while (n > 0) {
			node = node.next;
			n--;
		}
		if (node.next == null) {
			return true;
		} else {
			return false;
		}

	}
}
