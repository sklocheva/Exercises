package main.codility;

public class FirstTestTask {
	public int solution(int[] A) {
		// write your code in Java SE 8`
		if(A.length==0 || A.length==1){
			return -1;
		}
		
		int index = 0;
		while (index < A.length) {
			long sum1 = 0;
			//long sum2 = 0;

			for (int i = 0; i < index; i++) {
				sum1 = sum1 + A[i];
			}

			for (int i = index + 1; i < A.length; i++) {
				sum1 = sum1 - A[i];
			}
			if(sum1==0){
				return index;
			}
			index++;
		}
		return -1;
	}
}
