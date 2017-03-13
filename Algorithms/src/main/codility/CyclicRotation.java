package main.codility;

public class CyclicRotation {
	public int[] solution(int[] A, int K) {
		// write your code in Java SE 8
		int[] B = new int[A.length];

		for (int i = 0; i < B.length; i++) {
			B[(i + K) % B.length] = A[i];
		}
		return B;

	}

	public int[] solution2(int[] A, int K) {
		// write your code in Java SE 8
		if (A.length == 1 || A.length == K) {
			return A;
		}
		if (A.length == 2) {
			int temp = A[1];
			A[1] = A[0];
			A[0] = temp;
			return A;
		}

		int[] B = new int[A.length];
		int n = B.length - 1;
		for (int i = 0; i < B.length; i++) {
			if (i + K > n) {
				B[((i + K) - n) - 1] = A[i];
			} else {
				B[i + K] = A[i];
			}
		}
		return B;
	}

}
