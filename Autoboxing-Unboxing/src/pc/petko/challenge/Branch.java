package pc.petko.challenge;

import java.util.ArrayList;

public class Branch {
	private String branchName;
	private ArrayList<Customer> customerList;
	
	// branch name
	public Branch(String name) {
		this.branchName = name;
		this.customerList = new ArrayList<>();
	}
	
	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}
	
	public String getBranchName() {
		return branchName;
	}
	
	// Add a new customer and initial transaction amount.
	public boolean addNewCustomToBranch(String customerName, double initialAmount) {
		if (findCustomer(customerName) == null) {
			customerList.add(new Customer(customerName, initialAmount));
			return true;
		} else {
			return false;
		}
	}
	
	// Add additional transaction to customer
	public boolean addTransaction(String customerName, double amount) {
		Customer existingCustomer = findCustomer(customerName);
		if (existingCustomer != null) {
			existingCustomer.addTransaction(amount);
			return true;
		} else {
			return false;
		}
	}
	
	private Customer findCustomer(String customerName) {
		for (int i = 0; i < customerList.size(); i++) {
			Customer eachCustomer = customerList.get(i); // gets the contact from ArrayList
			if (eachCustomer.getName().equals(customerName)) { // checks the name
				return eachCustomer;
			}
		}
		return null;
	}
	
	
}
