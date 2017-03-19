package main.hackerrank.linkedlist;

public class InsertInPosition {
	
	Node InsertNth(Node head, int data, int position) {
		Node newNode = new Node();
		newNode.data = data;
		if (head == null) {
			return newNode;
		}
		if (position == 0) {
			newNode.next = head;
			return newNode;
		}

		Node previousNode = head;
		//
		for (int i = position - 1; i > 0; i--) {
			previousNode = previousNode.next;
		}
		// put newNode between the two nodes
		Node nextNode = previousNode.next;
		previousNode.next = newNode;
		newNode.next = nextNode;
		return head;
	}
}
