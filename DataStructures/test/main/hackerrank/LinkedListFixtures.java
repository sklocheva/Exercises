package main.hackerrank;

import main.hackerrank.linkedlist.Node;

public class LinkedListFixtures {

	public static Node node1;
	public static Node node2;
	public static Node node3;
	public static Node node4;
	public static Node oneElementNode;
	
	static{
		node1 = new Node();
		node2 = new Node();
		node3 = new Node();
		node4 = new Node();
		oneElementNode = new Node();
		
		oneElementNode.data = 3;
		
		node1.data = 2;
		node2.data = 3;
		node3.data = 4;
		node4.data = 6;

		node1.next = node2;
		node2.prev = node1;
		node2.next = node3;
		node3.prev = node2;
		node3.next = node4;
		node4.prev = node3;
	}
}
