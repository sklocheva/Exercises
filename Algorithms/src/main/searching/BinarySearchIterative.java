package main.searching;

import java.util.List;

public class BinarySearchIterative {
	private List<Integer> list;

	public BinarySearchIterative(List<Integer> list) {
		this.list = list;
	}

	public boolean binarySearch(int target) {
		int high = list.size() - 1;
		int low = 0;
		int mid;

		while (!(low > high)) {
			mid = (low + high) / 2;

			if (list.get(mid) == target) {
				return true;
			} else if (list.get(mid) > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return false;
	}

}
