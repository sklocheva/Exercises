package main.hackerrank.algorithms;

import java.util.Scanner;

public class CamelCase {

	public static void solution() {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		int count = 1;
		for(int i=0; i<s.length()-1; i++){
//			if(Character.isUpperCase(s.charAt(i))){
			if(s.charAt(i)>=65 && s.charAt(i)<=90){
				count++;
			}
		}
		System.out.println(count);
	}
}
