package main.other.recusrion;

public class ReverseArray {
	int[] list;

	public ReverseArray(int[] list) {
		this.list = list;
	}

	public void reverseArray() {

		reverse(0, list.length - 1);
	}

	// reverses both ends inward
	private void reverse(int low, int high) {

		if (low < high) {
			
			int temp = list[low];
			list[low]= list[high];
			list[high] = temp;

			reverse(low + 1, high - 1);
		}

	}
}
