package main.pluralsight;

import main.pluralsight.HouseholdItem;
import main.pluralsight.Product;
import main.pluralsight.set.Supplier;

public class ProductFixtures {

	public static Product door = new Product("Wooden Door", 35);
	public static Product window = new Product("Glass Window", 10);
	public static Product panel = new Product("Floor Panel", 25);
	//made up class to test generics
	public static HouseholdItem forks = new HouseholdItem();
	

	public static Supplier bobs = new Supplier("Bob's");
	public static Supplier kates = new Supplier("Kate's home goods");
	public static Supplier mary = new Supplier("Mary's household items");
	
	
	public static Supplier heavyProductSuppl = new Supplier("A Heavy product supplier");
	public static Supplier lightProductSuppl = new Supplier("A Light product supplier");

	
	static{

		mary.products().add(forks);
		
		bobs.products().add(door);
		bobs.products().add(panel);
		bobs.products().add(window);

		kates.products().add(panel);
		kates.products().add(new Product("Wooden Door", 35));
		kates.products().add(new Product("Glass Window", 10));
				
		heavyProductSuppl.products().add(door);
		heavyProductSuppl.products().add(panel);
		
		lightProductSuppl.products().add(window);
		lightProductSuppl.products().add(new Product("TV", 5));
		
		
	}
}
