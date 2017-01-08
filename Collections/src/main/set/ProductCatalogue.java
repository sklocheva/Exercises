package main.set;

import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

import main.Product;
import main.comparator.WeightComparator;
import main.list.ShipableItem;

/**
 * The catalogue can contain more than one type of items from the ShipableItem
 * interface, unlike the Shipment class that takes only a specific type
 * 
 * @author Sophie
 *
 */
public class ProductCatalogue {

	// no duplicates
	private final SortedSet<ShipableItem> catalogue;

	public ProductCatalogue() {
		catalogue = new TreeSet<>(new WeightComparator());
	}

	public void isSuppliedBy(Supplier supplier) {
		catalogue.addAll(supplier.products());
	}
	
	//
	public boolean contains(Collection<? super ShipableItem> items) {
		return catalogue.containsAll(items);
	}

	public SortedSet<ShipableItem> getLightProducts() {
		// exclusive of that break point
		return catalogue.headSet(findBreakPoint());
	}

	public SortedSet<ShipableItem> getHeavyProducts() throws NullPointerException {
		// inclusive
		return catalogue.tailSet(findBreakPoint());
	}

	private ShipableItem findBreakPoint() {
		for (ShipableItem product : catalogue) {
			if (product.getWeight() > 20) {
				return product;
			}
		}
		return null;
	}

}
