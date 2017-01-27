package main.hackerrank.algorithms;

import java.util.Scanner;

public class SuperReducedString {

	public static void solution(){
		Scanner in = new Scanner(System.in);
//		StringBuilder s = new StringBuilder();
//		s.append(in.nextLine());
		String s = in.nextLine();
        in.close();
        boolean flag = true;
        while(flag){
            flag = false;
        	for(int i=0; i<s.length()-1; i++){
        		if(s.charAt(i)==s.charAt(i+1)){
        			flag = true;
        			s = s.substring(0, i) + s.substring(i+1);
        			s = s.substring(0, i) + s.substring(i+1);
//        			s = s.deleteCharAt(i);
//        			s = s.deleteCharAt(i);
        			break;
        		}
        	}
        	
        }
        if(s.isEmpty()){
        	s = "Empty String";
        }
        System.out.println(s);
	}
}
