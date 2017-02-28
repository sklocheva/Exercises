package main.sort;

public class QuickSort {
	int[] array;

	public QuickSort(int[] array) {
		this.array = array;
	}

	public void sort() {
		quickSort(0, array.length - 1);
	}

	/**
	 * 
	 * @param cLeft
	 *            : current index of the left section
	 * @param cRight
	 *            : current index of the right section
	 */
	private void quickSort(int low, int high) {
		int cLeft = low;
		int cRight = high;
		int pivot = array[low + (high - low) / 2];

		while (cLeft <= cRight) {
			// find value bigger than pivot is found
			while (array[cLeft] < pivot) {
				cLeft++;
			}

			while (array[cRight] > pivot) {
				cRight--;
			}
			// if any are found for swap
			if (cLeft <= cRight) {
				swap(cLeft, cRight);
				cLeft++;
				cRight--;
			}

		}

		// when ordered by the pivot, resume sort
		// if low index is equal to cRight then we have reached the end of this
		// section
		if (low < cRight) {
			quickSort(low, cRight);
		}
		if (high > cLeft) {
			quickSort(cLeft, high);
		}
	}

	private void swap(int cLeft, int cRight) {
		int temp = array[cLeft];
		array[cLeft] = array[cRight];
		array[cRight] = temp;
	}
}
