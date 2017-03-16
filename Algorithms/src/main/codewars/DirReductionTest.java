package main.codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DirReductionTest {
  @SuppressWarnings("deprecation")
@Test
  public void testSimpleDirReduc() throws Exception {
    assertEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
        new String[]{"WEST"},
        DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));

    assertEquals("\"NORTH\", \"WEST\", \"SOUTH\", \"EAST\"",
        new String[]{"NORTH", "WEST", "SOUTH", "EAST"},
        DirReduction.dirReduc(new String[]{"NORTH", "WEST", "SOUTH", "EAST"}));
    
//	  String[] arr = DirReduction.dirReduc(new String[]
//			  {"EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"});
//	  for(String x: arr){
//		  System.out.println(x);
//	  }
  }
}
