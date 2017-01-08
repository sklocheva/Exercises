package main.recursion;

import java.util.List;

public class BinarySearchRecursive {
	List<Integer> list;

	public BinarySearchRecursive(List<Integer> list) {
		this.list = list;
	}

	public boolean binarySearch(int target) {

		return search(target, 0, list.size() - 1);
	}

	private boolean search(int target, int low, int high) {
		if (low > high) {
			return false;
		} else {

			int mid = (low + high) / 2;
			if (list.get(mid) == target) {
				return true;
			} else if (list.get(mid) > target) {
				return search(target, low, mid - 1);
			} else {
				return search(target, mid + 1, high);
			}
		}
	}

}
