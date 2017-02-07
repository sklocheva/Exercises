package main.builderpattern.mealpacker;

import java.util.ArrayList;
import java.util.List;

import main.builderpattern.mealpacker.items.Item;

public class Meal {

	List<Item> items;
	float cost;
	
	Meal(){
		items = new ArrayList<Item>();
	}
	
	public void addItem(Item item){
		cost = cost + item.price();
		items.add(item);
	}
	
	public float getCost(){
		return cost;
	}
	
	public void showItems(){
		for(Item x : items){
			System.out.println("Items name: " + x.name());
			System.out.println("Packaging: " + x.packing().pack());
			System.out.println("Items price is: " + x.price());
		}
	}
}
