package main;

import main.set.Supplier;

public class ProductFixtures {

	public static Product door = new Product("Wooden Door", 35);
	public static Product window = new Product("Glass Window", 10);
	public static Product panel = new Product("Floor Panel", 25);

	public static Supplier bobs = new Supplier("Bob's Household supplies");
	public static Supplier kates = new Supplier("Kate's hoem goods");
	public static Supplier heavyProductSuppl = new Supplier("A Heavy product supplier");
	public static Supplier lightProductSuppl = new Supplier("A Light product supplier");

	
	static{
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
