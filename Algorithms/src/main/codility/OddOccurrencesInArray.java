package main.codility;

import java.util.Arrays;

public class OddOccurrencesInArray {
	public int solutionO_N2(int[] A) {
		boolean flag;
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] == 0) {
				continue;
			}
			flag = true;
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] == A[j]) {
					A[j] = 0;
					flag = false;
					break;
				}
			}
			if (flag) {
				return A[i];
			}
		}
		return A[A.length - 1];
	}
	
	public int solutionO_N(int[] A) {
		Arrays.sort(A);
		for(int i=0; i<A.length-2; i= i+2){
			if(A[i]!=A[i+1]){
				return A[i];
			}
		}
		return A[A.length-1];
	}
}
