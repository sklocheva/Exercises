package main.linkedlist.hackerrank;

import main.linkedlist.Node;

public class PrintNode {

	public static void Print(Node head) {
		while (head != null) {
			System.out.println(head.data);
			if (head.next != null) {
				head = head.next;
			} else {
				break;
			}
		}
	}
}
