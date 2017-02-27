package main.other.recusrion;

public class LinearSum {

	// returns the sum of the first n number of the list (exclusive)
	public int sum(int[] data, int n) {
		
		if (n == 0) {
			return 0;
		}
		
		return data[n - 1] + sum(data, n - 1);
	}
}
