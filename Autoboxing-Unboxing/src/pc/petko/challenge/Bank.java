package pc.petko.challenge;

import java.util.ArrayList;

public class Bank {
	private String name;
	private ArrayList<Branch> branches;
	
	public Bank (String name) {
		this.name = name;
		this.branches = new ArrayList<>();
	}
	
	public ArrayList<Branch> getBranchArrayList() {
		return branches;
	}
	
	// add new branch
	public boolean addNewBranch(String branchName) {
		if (findBranch(branchName) == null) {
			branches.add(new Branch(branchName));
			return true;
		}
		return false;
	}
	
	// add a customer to the branch with initial transaction
	public boolean addCustomer(String branchName, String customerName, double amount) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.addNewCustomToBranch(customerName, amount);
		}
		return false;
	}
	// add a transaction for an existing customer in the branch
	public boolean addTransaction(String branchName, String customerName, double amount) {
	   Branch branch = findBranch(branchName);
	   if (branch != null) {
		   branch.addTransaction(customerName, amount);
		   return true;
	   }
	   return false;
	}
	// show list of customers for a certain branch and a list of their transactions
	public boolean listCustomers (String branchName, boolean showTransactions) {
		// checks if the branch name is present
		Branch branch = findBranch(branchName); // if its found != null else == null
		if (branch != null) {
			System.out.println("Customer details for branch: " + branch.getBranchName());
			// gets array list of customers
			ArrayList<Customer> branchCustomerList = branch.getCustomerList();
			for (int i = 0; i < branchCustomerList.size(); i++) {
				// takes each customer
				Customer branchCustomer = branchCustomerList.get(i);
				System.out.println("Customer: " + branchCustomer.getName() + "[ " + (i+1) + " ]");
				
				// 
				if (showTransactions) {
					System.out.println("Transactions: ");
					ArrayList<Double> transactions = branchCustomer.getTransactions();
					for (int j = 0; j < transactions.size(); i++) {
						System.out.println("[" + (j+1) + "]" + " Amount " + transactions.get(j));
					}
 				}
			}
			return true;
		}
		return false;
	}
	
	// find branch
	private Branch findBranch(String branchName) {
		for (int i = 0; i < branches.size(); i++) {
			Branch existingBranch = branches.get(i);
			if (existingBranch.getBranchName().equals(branchName)) {
				return existingBranch;
			} 
		}
		return null;
	}
}
