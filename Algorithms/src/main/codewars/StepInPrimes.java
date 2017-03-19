package main.codewars;

public class StepInPrimes {
	public static long[] step(int g, long m, long n) {
		// your code
		long[] result = new long[2];
		for (long i = m; i <= n - g; i++) {
			if (isPrime(i) && isPrime(i + g)) {
				result[0] = i;
				// check if these another prime with that gap after that (misunderstood)
//				for (long j = i + g; isPrime(j); j = j + g) {
					result[1] =i+g;
//				}
				return result;
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
