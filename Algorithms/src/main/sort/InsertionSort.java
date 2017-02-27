package main.sort;

/**
 * Takes elements one by one and inserts them in the right position.
 * 
 * @author Sophie
 *
 */
public class InsertionSort {

	int[] arr;

	public InsertionSort(int[] arr) {
		this.arr = arr;
	}

	/**
	 * items are inserte in the left sorted part of the list.
	 */
	public void sort() {
		// iterate over the list from the second el. till the end
		for (int number = 1; number < arr.length; number++) {

			int current = arr[number];
			int i = number;
			// goes backwards to the already sorted list to find el. smaller
			// than current
			while (i > 0 && (current < arr[i - 1])) {
				arr[i] = arr[i - 1];
				i--;
			}
			// after there are no longer smaller than current, put it into place
			arr[i] = current;

		}

	}

}
