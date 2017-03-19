package main.hackerrank.linkedlist;

public class PrintReverse {

	void ReversePrint(Node head) {

		if (head == null) {
			return;
		}
		ReversePrint(head.next);
		// writes after the recurrsion has reached its end
		System.out.println(head.data);
	}
}
