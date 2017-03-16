package main.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * a man was given directions to go from one point to another. The directions
 * were "NORTH", "SOUTH", "WEST", "EAST". Clearly "NORTH" and "SOUTH" are
 * opposite, "WEST" and "EAST" too. Going to one direction and coming back the
 * opposite direction is a needless effort. Since this is the wild west, with
 * dreadfull weather and not much water, it's important to save yourself some
 * energy, otherwise you might die of thirst!
 * 
 * You can immediatly see that going "NORTH" and then "SOUTH" is not reasonable,
 * better stay to the same place! So the task is to give to the man a simplified
 * version of the plan. A better plan in this case is simply:
 * 
 * 
 * @author Sophie
 *
 */
public class DirReduction {
	public static String[] dirReduc(String[] arr) {
		// Your code here.
		List<String> arrList = Arrays.asList(arr);
		List<String> helper = new ArrayList<String>();

		boolean isFin = false;
		boolean ignoreNext = false;
		// loop till there are no needless instructions
		while (!isFin) {
			isFin = true;
			// loop through the list checking for mistakes
			for (int i = 0; i < arrList.size() - 1; i++) {
				if (!ignoreNext) {
					if (arrList.get(i + 1).equals(getOposite(arrList.get(i)))) {
						ignoreNext = true;
						isFin = false;
					} else {
						helper.add(arrList.get(i));
					}
				} else {
					ignoreNext = false;
				}
			}
			// add last element
			if (!ignoreNext) {
				helper.add(arrList.get(arrList.size() - 1));
			}
			ignoreNext = false;

			arrList = new ArrayList<String>(helper);
			helper.clear();
		}
		String[] arr2 = new String[arrList.size()];
		return arrList.toArray(arr2);
	}

	private static Object getOposite(String string) {
		switch (string.toUpperCase()) {
		case "NORTH":
			return "SOUTH";
		case "SOUTH":
			return "NORTH";
		case "WEST":
			return "EAST";
		case "EAST":
			return "WEST";
		default:
			return "";
		}
	}
}
