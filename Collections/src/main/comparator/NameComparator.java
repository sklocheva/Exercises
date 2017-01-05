package main.comparator;

import java.util.Comparator;

import main.list.ShipableItem;

/**
 * A more abstract name comparator than the one in the Product class.
 * 
 * @author Sohpia
 *
 */
public class NameComparator implements Comparator<ShipableItem> {

	@Override
	public int compare(ShipableItem o1, ShipableItem o2) {
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

}
