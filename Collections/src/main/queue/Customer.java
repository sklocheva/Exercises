package main.queue;

public class Customer {

	private String name;
	
	public Customer(String name){
		this.name = name;
	}
	
	public void relpy(final String message){
		System.out.printf("%s %s \n", name, message);
	}
}
