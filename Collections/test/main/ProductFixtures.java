package main;

public class ProductFixtures {

	public static Product door = new Product("Wooden Door", 35);
	public static Product window = new Product("Glass Window", 10);
	public static Product panel = new Product("Floor Panel", 25);

	public static Supplier bobs = new Supplier("Bob's Household supplies");
	public static Supplier kates = new Supplier("Kate's hoem goods");

	
	static{
		bobs.products().add(door);
		bobs.products().add(panel);

		kates.products().add(panel);
		kates.products().add(door);
	}
}
