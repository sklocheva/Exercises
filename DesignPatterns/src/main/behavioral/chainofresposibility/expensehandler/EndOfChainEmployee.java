package main.behavioral.chainofresposibility.expensehandler;

public class EndOfChainEmployee implements Handler{

	@Override
	public String handleRequest(double expense) {
		return String.format("Your request for %s has been denied.", expense);
	}

}
