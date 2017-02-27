package main.sort;

/**
 * Illustrates bubble sort.
 * 
 * @author Sophie
 *
 */
public class BubbleSort {

	private int[] list;

	public BubbleSort(int[] list) {
		this.list = list;
	}

	/**
	 * compares each item with next and swaps if next is smaller, performs until
	 * no more swaps; after each iter. the largest el. makes its way to the end
	 * of the list.
	 */
	public void sort() {

		boolean flag = true;
		// checks if a swap occurred during iteration
		while (flag) {
			flag = false;
			for (int i = 0; i < list.length - 1; i++) {
				if (list[i] > list[i + 1]) {

					int temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;

					flag = true;
				}
			}
		}
	}

	private void sortVariant2() {
		for (int i = 0; i < list.length - 1; i++) {
			// iterates over the remaining unsorted part of the list
			for (int j = 0; j < list.length - 1 - i; j++) {
				if (list[j] > list[j + 1]) {
					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
	}
}
