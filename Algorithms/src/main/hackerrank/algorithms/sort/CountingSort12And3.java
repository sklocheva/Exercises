package main.hackerrank.algorithms.sort;

import java.util.Scanner;

public class CountingSort12And3 {

	public void solution() {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int[] arr = new int[100];
		while(count>0) {
			int number = in.nextInt();
			arr[number]++;
			count--;
		}
		//count 1
		in.close();
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		//count 2
		int countOccur = 0;
        for(int i=0; i<100; i++){
            countOccur = arr[i];
            while(countOccur>0){
                System.out.print(i + " ");
                countOccur--;
            }
        }
        //count 3
        int sum = 0;
        for(int i=0; i<100; i++){
            while(arr[i]>0){
                sum++;
                arr[i]--;
            }
            arr[i] = sum;
            System.out.print(sum + " ");
        }
	}
}
