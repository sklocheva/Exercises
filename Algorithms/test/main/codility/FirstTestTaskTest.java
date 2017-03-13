package main.codility;

import org.junit.Test;

public class FirstTestTaskTest {

	FirstTestTask sol;

	@Test
	public void test() {
		sol = new FirstTestTask();
		int[] arr = {0, -2147483648, -2147483648};
		System.out.println(sol.solution(arr));
	}

}
