package main.codewars;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateRotationTest {

	 @Test
	    public void test() {
	      assertEquals(-1, CalculateRotation.shiftedDiff("hoop","pooh"));
	      assertEquals(2, CalculateRotation.shiftedDiff("coffee","eecoff"));
	      assertEquals(4, CalculateRotation.shiftedDiff("eecoff","coffee"));
	    }
	 
	 @Test
	    public void test2() {
	      assertEquals(-1, CalculateRotation.shiftedDiff2("hoob","pooh"));
	      assertEquals(2, CalculateRotation.shiftedDiff2("coffee","eecoff"));
	      assertEquals(4, CalculateRotation.shiftedDiff2("eecoff","coffee"));
	    }


}
