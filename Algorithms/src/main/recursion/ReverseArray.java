package main.recursion;

import java.util.List;

public class ReverseArray {
	List<Integer> list;

	public ReverseArray(List<Integer> list) {
		this.list = list;
	}

	public void reverseArray() {

		reverse(0, list.size() - 1);
	}

	// reverses both ends inward
	private void reverse(int low, int high) {

		if (low < high) {
			int temp = list.get(low);
			list.set(low, list.get(high));
			list.set(high, temp);

			reverse(low + 1, high - 1);
		}

	}
}
