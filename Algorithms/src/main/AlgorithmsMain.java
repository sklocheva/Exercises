package main;

import java.util.Scanner;

public class AlgorithmsMain {

	public static void main(String[] args) {
		// int[] inputArr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
		//
		Scanner s = new Scanner(System.in);
		String S = ".... . -.--   .--- ..- -.. .";
		S = S.replaceAll("-", "");
		S = S.replaceAll(" ", "");
		
		System.out.println(S);
	}

}
