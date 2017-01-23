package main.linkedlist.hackerrank;

import main.linkedlist.Node;

public class CompareLists {

	public int Compare(Node headA, Node headB) {
		// check for equal data
		while (headA.data == headB.data) {
			// check for equal length
			//if one of them has reached end
			if (headA.next == null || headB.next == null) {
				//check if both have reached end, if not - not equal
				if (headB.next == null && headB.next == null) {
					return 1;
				} else {
					return 0;
				}
			}
			headA = headA.next;
			headB = headB.next;
		}
		return 0;
	}

}
