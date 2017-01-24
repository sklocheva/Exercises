package main.linkedlist.hackerrank;

import main.linkedlist.Node;

public class FindMerge {

	public static int FindMergeNode(Node headA, Node headB) {
		Node nodeB = headB;

		while (headA != null) {
			nodeB = headB;
			while (nodeB != null) {
				if (headA.equals(nodeB)) {
					return headA.data;
				}
				nodeB = nodeB.next;
			}
			headA = headA.next;
		}
		return 0;

	}
}
