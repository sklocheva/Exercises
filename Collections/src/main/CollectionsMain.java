package main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CollectionsMain
{
   public static void main(String[] args){
	   Scanner in = new Scanner(System.in);
       Deque<Integer> deque = new ArrayDeque<>();
       int n = in.nextInt();
       int m = in.nextInt();

       for (int i = 0; i < n; i++) {
           int num = in.nextInt();
           if(deque.size()==m){

           }else{
        	   deque.addLast(num);;
           }
       }
    }
}
