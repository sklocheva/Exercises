package main;

import main.set.Supplier;

public class ProductFixtures {

	public static Furniture door = new Furniture("Wooden Door", 35);
	public static Furniture window = new Furniture("Glass Window", 10);
	public static Furniture panel = new Furniture("Floor Panel", 25);
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
		kates.products().add(new Furniture("Wooden Door", 35));
		kates.products().add(new Furniture("Glass Window", 10));
				
		heavyProductSuppl.products().add(door);
		heavyProductSuppl.products().add(panel);
		
		lightProductSuppl.products().add(window);
		lightProductSuppl.products().add(new Furniture("TV", 5));
		
		
	}
}
