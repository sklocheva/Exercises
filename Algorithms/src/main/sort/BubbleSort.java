package main.sort;

import java.util.List;

public class BubbleSort {

	private List<Integer> list;

	public BubbleSort(List<Integer> list) {
		this.list = list;
	}

	public void sort() {

		// for (int i = 0; i < list.size()-1; i++) {
		// iterates over the remaining unsorted part of the list
		// for (int j = 0; j < list.size()-1-i; j++) {
		// if(list.get(j)>list.get(j+1)){
		// int temp = list.get(j);
		// list.set(j, list.get(j+1));
		// list.set(j+1, temp);
		// }
		// }
		// }
		
		boolean flag = true;
		// checks if a swap occurred during iteration
		while (flag) {
			flag = false;
			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i) > list.get(i + 1)) {

					int temp = list.get(i);
					list.set(i, list.get(i + 1));
					list.set(i + 1, temp);

					flag = true;
				}
			}

		}

	}
}
