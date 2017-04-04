package main.questions;

import java.util.Arrays;

public class Task2 {
	int solution(int[] A, int[] B) {
		int n = A.length;
		int m = B.length;
		Arrays.sort(A);
		Arrays.sort(B);
		int i = 0;
		boolean flag;
		if (A.length > B.length) {
			flag = false;
		} else {
			flag = true;
		}
		if (flag) {
			for (int k = 0; k < n; k++) {
				if (i < m-1 && B[i] < A[k])
					i += 1;
				if (A[k] == B[i])
					return A[k];
			}
		}else{
			for (int k = 0; k < m; k++) {
				if (i < n-1  && B[k] > A[i])
					i += 1;
				if (A[i] == B[k])
					return A[i];
			}
		}
		return -1;
	}
}
