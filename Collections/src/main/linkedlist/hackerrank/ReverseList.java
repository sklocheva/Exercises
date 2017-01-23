package main.linkedlist.hackerrank;

import main.linkedlist.Node;

public class ReverseList {

	public static Node Reverse(Node head) {
		if (head == null) {
			return null;
		}
		Node node = null;
		Node i;
		while (head != null) {
			i = node;
	        node = new Node();
	        node.data = head.data;
	        node.next = i;
	        head = head.next;
		}
		return node;
	}
}
