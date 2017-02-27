package main.other.recusrion;

/**
 * Representation of binary search using recursion.
 * 
 * @author Sophie
 *
 */
public class BinarySearchRecursive {
	int[] list;

	public BinarySearchRecursive(int[] list) {
		this.list = list;
	}

	public boolean binarySearch(int target) {

		return search(target, 0, list.length - 1);
	}

	private boolean search(int target, int low, int high) {
		if (low > high) {
			return false;
		} else {

			int mid = (low + high) / 2;
			if (list[mid] == target) {
				return true;
			} else if (list[mid] > target) {
				return search(target, low, mid - 1);
			} else {
				return search(target, mid + 1, high);
			}
		}
	}

}
