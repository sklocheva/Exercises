package main.searching;

/**
 * Illustrates the iterative version of the binary search.
 * 
 * {@link} main.other.recursion.BinarySearchRecursive
 * 
 * @author Sophie
 *
 */
public class BinarySearchIterative {
	private int[] list;

	public BinarySearchIterative(int[] list) {
		this.list = list;
	}

	public boolean binarySearch(int target) {
		int high = list.length - 1;
		int low = 0;
		int mid;

		while (low < high) {
			mid = (low + high) / 2;
			/*
			 * Interpolation approach: mid = low + ((target - list.get(low)) *
			 * (high - low) /(list.get(high) - list.get(low)));
			 */

			if (list[mid] == target) {
				return true;
			} else if (list[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return false;
	}

}
