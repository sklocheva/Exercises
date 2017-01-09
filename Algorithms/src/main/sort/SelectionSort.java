package main.sort;

import java.util.List;

/**
 * Finds the smallest element and moves to the first position.
 * 
 * @author Sophie
 *
 */
public class SelectionSort {
	List<Integer> list;

	public SelectionSort(List<Integer> list) {
		this.list = list;
	}

	public void sort() {
		// iterates for every element in the list
		for (int number = 0; number < list.size() - 1; number++) {
			int min = number;
			// iterates over the remaining unsorted el., finds the smallest
			for (int i = number + 1; i < list.size(); i++) {
				if (list.get(min) > list.get(i)) {
					min = i;
				}
			}
			// if a smaller el. than the first one is found, moves it in the
			// first position
			if (min != number) {
				int temp = list.get(min);
				list.set(min, list.get(number));
				list.set(number, temp);
			}
		}

	}
}
