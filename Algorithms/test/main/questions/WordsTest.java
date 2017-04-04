package main.questions;

import java.util.Scanner;

import org.junit.Test;

public class WordsTest {

	@Test
	public void test() {
		Words w = new Words();
		Scanner s = new Scanner(System.in);
		String[] str = w.missingWords2(s.nextLine(), s.nextLine());
		
		for(String x : str){
			System.out.println(x);
		}
	}

}
