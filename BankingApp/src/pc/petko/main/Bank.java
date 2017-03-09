package pc.petko.main;

import java.util.ArrayList;

public class Bank {
	
	private String name;
	private ArrayList<Branch> branches;
	
	public Bank(String name) {
		this.name = name;
		branches = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Branch> getBranch() {
		return branches;
	}
	
	public boolean addCustomer(String branchName, String customerName, double amount) {
		Branch branch = findBranch(branchName);       // if branchName is present
		if (branch != null) {
			branch.newCustomer(customerName, amount); // creates new customer based on branch name
			return true;
		}
		return false;
	}
	
	public boolean addBranch(String branchName) {
		Branch branch = findBranch(branchName);
		if (branch == null) {
			branches.add(new Branch(branchName));
			return true;
		} 
		return false;
	}
	
	public boolean listCustomers(String branchName, boolean showTransactions) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			System.out.println("Customer details for branch " + branch.getName());
			
			ArrayList<Customer> branchCustomers = new ArrayList<>();
			
			for (int i = 0; i < branchCustomers.size(); i++) {
				Customer tempCustomer = branchCustomers.get(i);
				System.out.println("Customer: " + tempCustomer.getName() + "[" + i + "]");
				if (showTransactions) {
					System.out.println("Transactions: ");
					ArrayList<Double> transactions = tempCustomer.getTransactions();
					for (int j = 0; j < transactions.size(); i++) {
						System.out.println("[" + (j+1) + "]" + " Amount " + transactions.get(j));
					}
					
				}
				
			}
		}
		return false;
	}
	
	
	public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.addCustomerTransaction(customerName, amount);   // tuk ne go razbiram :(
		}
		return false;
	}
	
	// find branch if already exists ?
	private Branch findBranch(String branchName) {
		for (int i = 0; i < branches.size(); i++) {
			Branch tempBranch = branches.get(i); // gets temp branch
			if (tempBranch.getName().equals(branchName)) {
				return tempBranch; // already exists
			}
		} 
		return null; // no such branch
	}

}
