package main.linkedlist.hackerrank;

import main.linkedlist.Node;

public class MergreLists {
	
	public Node Merge(Node headA, Node headB) {
		if (headA == null || headB == null) {
			if (headA == null) {
				return headB;
			} else {
				return headA;
			}
		}
		if (headA.data < headB.data) {
			headA.next = Merge(headA.next, headB);
			return headA;
		} else {
			headB.next = Merge(headA, headB.next);
			return headB;
		}
	}
}
