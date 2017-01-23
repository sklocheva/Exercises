package main.linkedlist.hackerrank;

import static main.linkedlist.hackerrank.LinkedListFixtures.node1;

import org.junit.Test;

import main.linkedlist.Node;
public class ReverseListTest {

	@Test
	public void test() {
		Node lastNode = ReverseList.Reverse(node1);
		System.out.println(lastNode.data);
	}

}
