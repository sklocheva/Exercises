package main.codewars;

import java.util.ArrayList;
import java.util.List;

public class RemovedNumbers {
	public static List<long[]> removNb(long n) {
		// your code
		List<long[]> result = new ArrayList<long[]>();
		long fullSum = (n / 2) * (1 + n);
		for (long i = 1; i < n; i++) {
			if ((i * n) >= fullSum - (i + n)) {
				for (long j = i + 1; j <= n; j++) {
					if ((i * j) == (fullSum - (i + j))) {
						result.add(new long[] { i, j });
						result.add(new long[] { j, i });
					}
				}
			}
		}
		return result;
	}
	
	public static List<long[]> removNb2(long n) {
		// your code
        long sum = (n * n + n) / 2;
        List<long[]> list = new ArrayList<>();
        long halfN = n / 2;
        long sqrtN = (long) Math.sqrt(n);
        for (long i = halfN; i <= n - sqrtN; i++) {
            long sumMinusI = (sum - i);
            if ((sumMinusI % (i + 1)) == 0) {
                double j = (sumMinusI / (i + 1));
                list.add(new long[]{i, (long) j});
            }
        }
        return list;
	}
}
