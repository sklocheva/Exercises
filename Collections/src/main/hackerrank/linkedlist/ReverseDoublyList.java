package main.hackerrank.linkedlist;

public class ReverseDoublyList {
	public static Node Reverse(Node head) {

		if (head == null || head.next == null) {
			return head;
		}

		Node currentNode = head;
		while (currentNode.next != null) {
			head = currentNode;
			currentNode = currentNode.next;
			Swap(head);
		}
		Swap(currentNode);
		return currentNode;

	}

	static void Swap(Node head) {
		Node helper = new Node();
		helper.next = head.prev;
		helper.prev = head.next;
		head.prev = helper.prev;
		head.next = helper.next;
	}
}
