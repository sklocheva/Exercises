package main.hackerrank.linkedlist;

public class InsertNodeFirst {

	public static Node InsertFirst(Node head, int x) {
		Node newNode = new Node();
		newNode.data = x;
		
		// the new node points to the first node in the list
		newNode.next = head;
		return newNode;
	}

}
