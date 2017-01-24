package main.linkedlist.hackerrank;

import static main.linkedlist.hackerrank.LinkedListFixtures.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.linkedlist.Node;

public class InsertIntoDoublyListTest {

	@Test
	public void insertBetween() {
		Node node = InsertIntoDoublyList.SortedInsert(node1, 5);
//		PrintNode.Print(node);
		assertTrue(checkIfOrdered(node));
	}
	
	@Test
	public void insertInOneElementListBehind() {
		Node node = InsertIntoDoublyList.SortedInsert(oneElementNode, 5);
//		PrintNode.Print(node);
		assertTrue(checkIfOrdered(node));
	}
	
	@Test
	public void insertInOneElementListAtFront() {
		Node node = InsertIntoDoublyList.SortedInsert(oneElementNode, 2);
//		PrintNode.Print(node);
		assertTrue(checkIfOrdered(node));
	}
	
	@Test
	public void insertAtEnd() {
		Node node = InsertIntoDoublyList.SortedInsert(node1, 7);
//		PrintNode.Print(node);
		assertTrue(checkIfOrdered(node));
	}
	
	@Test
	public void insertInEmptyList() {
		Node node = InsertIntoDoublyList.SortedInsert(null, 7);
//		PrintNode.Print(node);
		assertTrue(checkIfOrdered(node));
	}
	
	private boolean checkIfOrdered(Node head){
		while(head.next!=null){
			if(head.data <= head.next.data){
				head = head.next;
			}else{
				return false;
			}
		}
		return true;
	}

}
