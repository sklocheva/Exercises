package main.sort;

/**
 * Finds the smallest element and moves it to the front position.
 * 
 * @author Sophie
 *
 */
public class SelectionSort {
	int[] list;

	public SelectionSort(int[] list) {
		this.list = list;
	}

	/**
	 * finds the smallest item and brings it at the first unsorted location
	 */
	public void sort() {
		// iterates for every element in the list
		for (int number = 0; number < list.length - 1; number++) {
			int min = number;
			// iterates over the remaining unsorted el., finds the smallest
			for (int i = number + 1; i < list.length; i++) {
				if (list[min] > list[i]) {
					min = i;
				}
			}
			// if a smaller el. than the first one is found, moves it in the
			// first position
			if (min != number) {
				int temp = list[min];
				list[min] = list[number];
				list[number] = temp;
			}
		}

	}
}
