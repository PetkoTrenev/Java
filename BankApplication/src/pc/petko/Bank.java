package pc.petko;

import java.util.ArrayList;

public class Bank {
	
	// What does the bank have?

	private double interestRate = 8.5;			// has an interest rate of certain %
	private double transactionFees = 10;		// has a transaction fee
	private ArrayList<Customer> customers;  	// has several customers
	
	public Bank() {
		customers = new ArrayList<Customer>();
	}
	
	/**
	 * @param customer
	 * Get customer's account
	 * get customer's balance
	 * calculate interest amount on that balance
	 */

	public void calculateInterest(Customer customer) {
		Account acc = customer.getAcc();
		double tempBalance = acc.getBalance();
		double interestAmount = (tempBalance * interestRate/100);
		double totalBalance = tempBalance + interestAmount;
		System.out.println("Interest amount is: " + interestAmount + ". Total balance after adding interest rate of the bank: " + totalBalance);
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public double getTransactionFees() {
		return transactionFees;
	}
	
	public ArrayList<Customer> getCustomers() {
		return customers;
	}
}
