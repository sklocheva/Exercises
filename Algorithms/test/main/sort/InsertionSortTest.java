package main.sort;

import static main.ListFixture.arr;

import org.junit.Test;

public class InsertionSortTest {

	@Test
	public void test() {
		for(int i : arr){
			System.out.print(i);
		}
		System.out.println();
		InsertionSort sort = new InsertionSort(arr);
		sort.sort();
		for(int i : arr){
			System.out.print(i);
		}
//		assertEquals(list, orderedList);
	}


}
