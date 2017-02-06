package main.pluralsight;

import main.pluralsight.list.ShipableItem;

public class Product implements ShipableItem {

	private String name;
	private int weight;
	
//	public static final Comparator<Product> BY_NAME = comparing(Product :: getName);
//	public static final Comparator<Product> BY_WEIGHT = comparing(Product :: getWeight);
	
	public Product(String name, int weight) {
		
		this.name = name;
		this.weight = weight;
	}
	
	public String getName(){
		return name;
	}
	@Override
	public int getWeight(){
		return weight;
	}
	
	@Override
	public String toString(){
		
		return String.format("Product {name = %s, weight = %d}", name, weight);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	
	
}
