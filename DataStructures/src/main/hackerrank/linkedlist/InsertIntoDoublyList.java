package main.hackerrank.linkedlist;

public class InsertIntoDoublyList {

	public static Node SortedInsert(Node head, int data) {
		Node newNode = new Node();
		newNode.data = data;
		//case no list
		if (head == null) {
			return newNode;
		}
		//case one element
		if (head.next == null) {
			if (head.data > data) {
				//insert at front
				newNode.next = head;
				head.prev = newNode;
				return newNode;
			} else {
				InsertAtEnd(head, newNode);
				return head;
			}
		}

		Node currentNode = head;
		Node prevNode = new Node();
		while (currentNode != null) {
			if (currentNode.data > data) {
				InsertNode(currentNode, newNode);
				return head;
			} else {
				prevNode = currentNode;
				currentNode = currentNode.next;
			}
		}
		InsertAtEnd(prevNode, newNode);
		return head;
	}

	static void InsertNode(Node currentNode, Node newNode) {
		Node helperNode = new Node();
		helperNode = currentNode.prev;
		helperNode.next = newNode;
		newNode.prev = helperNode;
		newNode.next = currentNode;
		currentNode.prev = newNode;
	}

	static void InsertAtEnd(Node prevNode, Node newNode) {
		prevNode.next = newNode;
		newNode.prev = prevNode;
		newNode.next = null;
	}

}
