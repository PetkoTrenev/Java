package pc.petko.main;

import java.util.ArrayList;

public class Branch {
	private String name;
	private ArrayList<Customer> customers;
	
	public Branch(String name) {
		this.name = name;
		customers = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	// new Customer if doesn't exist makes a new one
	public boolean newCustomer(String customerName, double initialAmount) {
		if (findCustomer(customerName) == null) {
			customers.add(new Customer(customerName, initialAmount)); //adds a new customer to the list
			return true;
		} else {
			return false;
		}	
	}
	
	public boolean addCustomerTransaction(String name, double amount) {
		Customer existingCustomer = findCustomer(name);
		if (existingCustomer != null) {
			existingCustomer.addTransaction(amount);
			return true; // done transaction to existing one
		} else {
			return false; // no transactions
		}
	}
	
	// searches for a customer
	private Customer findCustomer(String customerName) {
		for (int i = 0; i < customers.size(); i++) { // loop through all of the objects
			Customer tempCustomer = customers.get(i);
			if (tempCustomer.getName().equals(customerName)) {
				return customers.get(i);
			}
		}
		return null;
	}
}
