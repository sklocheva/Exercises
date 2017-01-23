package main.linkedlist.hackerrank;

import main.linkedlist.Node;

public class LinkedListFixtures {

	static Node node1;
	static Node node2;
	static Node node3;
	static Node emptyNode;
	
	static{
		node1 = new Node();
		node2 = new Node();
		node3 = new Node();
		
		node1.data = 2;
		node2.data = 3;
		node3.data = 4;

		node1.next = node2;
		node2.next = node3;
	}
}
