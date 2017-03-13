package main.codility;

public class BinaryGap {

	public int solution(int N) {
		String s = Integer.toBinaryString(N);
		int maxCount = 0;

		if (s.contains("0")) {
			int count = 0;

			for (int i = 1; i < s.length() - 1; i++) {
				if (s.charAt(i) == '0') {
					count++;
				} else {
					if (count != 0) {
						if (maxCount < count) {
							maxCount = count;
						}
						count = 0;
					}
				}
			}

			if (s.charAt(s.length() - 1) == '1') {
				if (maxCount < count) {
					maxCount = count;
				}
			}
		}

		return maxCount;
	}
}
