package main.queue;

public class Enquiry {

	private final Customer customer;
	private final Category category;
	
	public Enquiry(final Customer customer, final Category category){
		this.customer = customer;
		this.category = category;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Category getCategory() {
		return category;
	}
	
	@Override
	public String toString(){
		return String.format("Enquiry {customer=%s, category=%s}", customer, category);
	}
	
}
