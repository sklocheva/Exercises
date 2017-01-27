package main.hackerrank.linkedlist;

public class CheckCycle {

	public static boolean hasCycle(Node head) {

		if (head == null) {
			return false;
		}

		Node current = head;
		Node nextNode = head;

		while (current.next != null) {
			current = current.next;
			nextNode = nextNode.next.next;

			if (nextNode == null) {
				return false;
			}

			if (current == nextNode) {
				return true;
			}
		}
		return false;
	}
}
