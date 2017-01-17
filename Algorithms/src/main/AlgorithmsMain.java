package main;

import main.other.MaxSumOfNumbers;
import main.other.MissingWords;

public class AlgorithmsMain {

	public static void main(String[] args) {
		int[] inputArr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
//		MergeSort sort = new MergeSort();
//		sort.sort(inputArr);
//		for (int i : inputArr) {
//			System.out.print(i);
//			System.out.print(" ");
//		}
//		
//		int a,b,c;
//		b=10;
//		a=b=c=20;
//		int k=1;
//		int i = ++k+k++ + + k;
//		System.out.println(4<=4);
		
		int[] arr = MaxSumOfNumbers.findMax(10, inputArr);
		for(int i:arr){
			System.out.println(i);
		}
		
		String[] stringArr = MissingWords.missingWords("I have jjj koo", "have jjj");
		for(String i: stringArr){
			System.out.println(i);
		}
	}

}
