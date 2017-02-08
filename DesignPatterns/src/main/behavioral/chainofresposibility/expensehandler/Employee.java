package main.behavioral.chainofresposibility.expensehandler;

public class Employee implements Handler {
	private String name;
	private double range;
	private Handler manager = new EndOfChainEmployee();
	
	public Employee(String name, double range){
		this.name = name;
		this.range = range;
	}
	
	public void setManager(Employee manager){
		this.manager = manager;
	}
	
	public String handleRequest(double expense){
		if(range>=expense){
			return String.format("Expense approved by %s.", name);
		}else{
			return manager.handleRequest(expense);
		}
	}
	
}
