package main.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import main.Product;
import main.Supplier;

public class ProductCatalogue {

	private final Set<Product> catalogue;
	
	public ProductCatalogue(){
		catalogue = new HashSet<>();
	}
	
	public void isSuppliedBy(Supplier supplier){
		catalogue.addAll(supplier.products());
	}
	
	public boolean contains(Collection<Product> items){
		return catalogue.containsAll(items);
	}
	
}
