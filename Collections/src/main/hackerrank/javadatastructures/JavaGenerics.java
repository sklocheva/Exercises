package main.hackerrank.javadatastructures;

public class JavaGenerics {

	public <T> void printArray(T[] arr){
	       for(T i : arr){
	           System.out.println(i);
	       }
	   }
}
