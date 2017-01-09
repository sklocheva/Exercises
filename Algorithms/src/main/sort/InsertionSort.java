package main.sort;

import java.util.List;

/**
 * Takes elements one by one and inserts them in the right position.
 * 
 * @author Sophie
 *
 */
public class InsertionSort {

	List<Integer> list;

	public InsertionSort(List<Integer> list) {
		this.list = list;
	}

	public void sort() {
		// iterate over the list from the second el. till the end
		for (int number = 1; number < list.size(); number++) {

			// for (int i = number; i > 0; i--) {
			// if (list.get(i) < list.get(i - 1)) {
			// int temp = list.get(i);
			// list.set(i, list.get(i - 1));
			// list.set(i - 1, temp);
			// }
			// }

			int k = number;
			// iterate backwards until an element smaller than 'k' is found (all
			// elements before that are already sorted) or reached the first
			// element;
			while ((k > 0) && (list.get(k) < list.get(k - 1))) {
				int temp = list.get(k);
				list.set(k, list.get(k - 1));
				list.set(k - 1, temp);
				k--;
			}

		}

	}

}
