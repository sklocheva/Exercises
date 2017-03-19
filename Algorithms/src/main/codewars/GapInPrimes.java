package main.codewars;

public class GapInPrimes {
	public static long[] gap(int g, long m, long n) {
		// your code
		boolean flag = true;
		for (long i = m; i < n; i++) {
			if (isPrime(i) && isPrime(i + g)) {
				// check for another prime number in this gap
				for (long j = i + 1; j < i + g; j++) {
					if (isPrime(j)) {
						flag = false;
					}
				}
				// if another prime not found return else continue searching
				if (flag) {
					return new long[] { i, i + g };
				}
				flag = true;
			}
		}
		return null;
	}

	static boolean isPrime(long number) {
		if (number > 2 && (number & 1) == 0)
			return false;
		// only odd factors need to be tested up to n^0.5
		for (int i = 3; i * i <= number; i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
