package main.hackerrank.linkedlist;

import static main.hackerrank.LinkedListFixtures.node1;

import org.junit.Test;
public class ReverseListTest {

	@Test
	public void test() {
		Node lastNode = ReverseList.Reverse(node1);
		System.out.println(lastNode.data);
	}

}
