package pc.petko.main;

import java.util.ArrayList;

public class Customer {
	private ArrayList<Double> transactions;
	private String name;
	
	public Customer(String name, double initialAmount) {
		this.name = name;
		this.transactions = new ArrayList<>();
		addTransaction(initialAmount); // first transaction of the new customer
	}
	
	public void setTransactions(ArrayList<Double> transaction) {
		this.transactions = transaction;
	}
	
	public ArrayList<Double> getTransactions() {
		return transactions;
	}
	
	public void setName(String name) {
		this.name = name;
	} 
	
	public String getName(){
		return name;
	}
	
	public void addTransaction(double amount) {
		transactions.add(amount); // add a transaction to the existing customer
	}

}
