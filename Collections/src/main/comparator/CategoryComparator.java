package main.comparator;

import java.util.Comparator;

import main.queue.Enquiry;

/**
 * Used in the Queue examples
 * 
 * @author Sophie
 *
 */
public class CategoryComparator implements Comparator<Enquiry> {

	public int compare(Enquiry o1, Enquiry o2) {
		return o1.getCategory().compareTo(o2.getCategory());
	}
}
