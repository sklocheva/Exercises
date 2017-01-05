package main.comparator;

import java.util.Comparator;

import main.list.ShipableItem;

/**
 * A more abstract name comparator than the ones in the Product class.
 * 
 * @author Sophie
 *
 */
public class WeightComparator implements Comparator<ShipableItem> {

	@Override
	public int compare(ShipableItem o1, ShipableItem o2) {
		//-1* to flip the order
		return Integer.compare(o1.getWeight(), o2.getWeight());
	}

}