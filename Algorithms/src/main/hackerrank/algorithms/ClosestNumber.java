package main.hackerrank.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ClosestNumber {

	public static void solutionLinkedList(int n, int[] a) {
		//Scanner in = new Scanner(System.in);
		//int n = in.nextInt();
		//int[] a = new int[n];

//		for (int a_i = 0; a_i < n; a_i++) {
//			a[a_i] = in.nextInt();
//		}
		//in.close();
		Arrays.sort(a);
		int diff = 0;
		int smallest = Math.abs(a[0] - a[1]);
		List<Integer> list = new LinkedList<Integer>();
		// StringBuilder s = new StringBuilder();
		for (int i = 0; i < n - 1; i++) {
			diff = a[i + 1] - a[i];
			if (diff < smallest) {
				smallest = diff;
				// s.setLength(0);
				// s.append(String.valueOf(a[i])+ " " + String.valueOf(a[i+1]) +
				// " ");
				list.clear();
				list.add(a[i]);
				list.add(a[i + 1]);
			} else if (diff == smallest) {
				list.add(a[i]);
				list.add(a[i + 1]);
				// s.append(String.valueOf(a[i])+ " " + String.valueOf(a[i+1]) +
				// " ");
			}
		}
		for (int x : list) {
			System.out.print(x + " ");
		}
		System.out.println();
		// System.out.println(s.toString());
	}
	
	public static void solutionArrayList(int n, int[] a) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int[] a = new int[n];
//
//		for (int a_i = 0; a_i < n; a_i++) {
//			a[a_i] = in.nextInt();
//		}
//		in.close();
		Arrays.sort(a);
		int diff = 0;
		int smallest = Math.abs(a[0] - a[1]);
		List<Integer> list = new ArrayList<Integer>();
		// StringBuilder s = new StringBuilder();
		for (int i = 0; i < n - 1; i++) {
			diff = a[i + 1] - a[i];
			if (diff < smallest) {
				smallest = diff;
				// s.setLength(0);
				// s.append(String.valueOf(a[i])+ " " + String.valueOf(a[i+1]) +
				// " ");
				list.clear();
				list.add(a[i]);
				list.add(a[i + 1]);
			} else if (diff == smallest) {
				list.add(a[i]);
				list.add(a[i + 1]);
				// s.append(String.valueOf(a[i])+ " " + String.valueOf(a[i+1]) +
				// " ");
			}
		}
		for (int x : list) {
			System.out.print(x + " ");
		}
		System.out.println();
		// System.out.println(s.toString());
	}
	public static void solutionStringBuilder(int n, int[] a) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int[] a = new int[n];
//
//		for (int a_i = 0; a_i < n; a_i++) {
//			a[a_i] = in.nextInt();
//		}
//		in.close();
		Arrays.sort(a);
		int diff = 0;
		int smallest = Math.abs(a[0] - a[1]);
		//List<Integer> list = new LinkedList<Integer>();
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < n - 1; i++) {
			diff = a[i + 1] - a[i];
			if (diff < smallest) {
				smallest = diff;
				 s.setLength(0);
				 s.append(String.valueOf(a[i])+ " " + String.valueOf(a[i+1]) +
				 " ");
//				list.clear();
//				list.add(a[i]);
//				list.add(a[i + 1]);
			} else if (diff == smallest) {
//				list.add(a[i]);
//				list.add(a[i + 1]);
				 s.append(String.valueOf(a[i])+ " " + String.valueOf(a[i+1]) +
				 " ");
			}
		}
//		for (int x : list) {
//			System.out.print(x + " ");
//		}
//		System.out.println();
		 System.out.println(s.toString());
	}
}
