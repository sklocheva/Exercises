package main.hackerrank;

import java.util.Scanner;

import org.junit.Test;

public class FindNegativeSumSequenceTest {

	@Test
	public void test() {

		Scanner s = new Scanner(System.in);
		int n = Integer.valueOf(s.nextLine());
		String[] stringArr = s.nextLine().split("\\s+");
		int[] arr = new int[n];
		for(int i=0; i<arr.length;i++){
			arr[i] = Integer.valueOf(stringArr[i]);
		}
		s.close();
		System.out.println(FindNegativeSumSequence.find(arr));
	}

}
