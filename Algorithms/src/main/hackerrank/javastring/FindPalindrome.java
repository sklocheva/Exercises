package main.hackerrank.javastring;

public class FindPalindrome {

	public String find(String A){
		boolean isDiff = false;
		int mid = (A.length()/2)-1;

		for(int i=0; i<mid;i++){
		   if(A.charAt(i)!=A.charAt((A.length()-1)-i)){
		       isDiff = true;
		       break;
		   }    
		    
		 }
		if(isDiff){
		    return "No";
		}else{
		    return "Yes";
		}
	}
}
