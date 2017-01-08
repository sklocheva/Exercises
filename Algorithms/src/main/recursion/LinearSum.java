package main.recursion;

import java.util.List;

public class LinearSum {

	// returns the sum of the first n number of the list (exclusive)
	public int sum(List<Integer> data, int n) {
		
		if (n == 0) {
			return 0;
		}
		
		return data.get(n - 1) + sum(data, n - 1);
	}
}
