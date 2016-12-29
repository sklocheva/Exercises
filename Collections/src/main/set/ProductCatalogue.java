package main.set;

import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

import main.Product;

public class ProductCatalogue {

	//no duplicates
	private final SortedSet<Product> catalogue;
	
	public ProductCatalogue(){
		catalogue = new TreeSet<>(Product.BY_WEIGHT);
	}
	
	public void isSuppliedBy(Supplier supplier){
		catalogue.addAll(supplier.products());
	}
	
	public boolean contains(Collection<Product> items){
		return catalogue.containsAll(items);
	}
	
	public SortedSet<Product> getLightProducts(){
		//exclusive of that break point
		return catalogue.headSet(findBreakPoint());
	}
	
	public SortedSet<Product> getHeavyProducts() throws NullPointerException{
		//inclusive
		return catalogue.tailSet(findBreakPoint());
	}

	private Product findBreakPoint() {
		for(Product product : catalogue){
			if(product.getWeight() > 20){
				return product;
			}
		}
		return null;
	}
	
}
