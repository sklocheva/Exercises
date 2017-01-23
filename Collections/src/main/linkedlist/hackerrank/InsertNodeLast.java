package main.linkedlist.hackerrank;

import main.linkedlist.Node;
/**
 * This method inserts a value to the end of a linkedlist
 * @author Sophie
 *
 */
public class InsertNodeLast {
	
	public static Node InsertLast(Node head, int data) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		if (head == null) {
			return null;
		}
		// node to iterrate to the end
		Node currentNode = head;
		
		// the new node which will be added to the end
		Node newNode = new Node();
		newNode.data = data;
		
		// iterrate to the end of the list
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		// bind the new node to the last one
		currentNode.next = newNode;

		return head;
	}
}
