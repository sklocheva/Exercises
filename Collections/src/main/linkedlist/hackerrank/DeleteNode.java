package main.linkedlist.hackerrank;

import main.linkedlist.Node;

public class DeleteNode {
	Node Delete(Node head, int position) {

		if (position == 0) {
			Node nextNode = head.next;
			head.next = null;
			return nextNode;
		}
		
		Node currentPos = head;
		// loops till we reach one node before the position
		while (--position > 0) {
			currentPos = currentPos.next;
		}
		Node nodeToDelete = currentPos.next;
		currentPos.next = nodeToDelete.next;
		nodeToDelete.next = null;

		return head;
	}
}
