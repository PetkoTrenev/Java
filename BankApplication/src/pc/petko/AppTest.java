/*
 A customer opens an account in a bank, the customer must have an initial balance of 100$ 
 while opening the account,the customer can withdraw, deposit, and check his balance any time
 he wants, the bank does not charge any fees for the 1st withdrawal but for all subsequent withdrawals,
 the bank charges some transaction fees. The bank also calculates  a certain amount of interest
 on the amount deposited by the customer as per its interest  rate. 
 Create an object oriented program to automate this problem
 */

package pc.petko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AppTest {
	
	private static InputStreamReader isr = new InputStreamReader(System.in);
	private static BufferedReader br = new BufferedReader(isr);
	private static Bank bank = new Bank();
	private static ArrayList<Customer> customers = bank.getCustomers();
	
	public static void main(String args[]) throws IOException{
		

		// Main objective turn the program into a menu driven one
		while(true) {
			 System.out.println("Please Enter your choice:");
	         System.out.println("1: Add Customer");
	         System.out.println("2: Deposit Money");
	         System.out.println("3: Withdraw Money");
	         System.out.println("4: Check Balance");
	         System.out.println("5: Calculate Interest");
	         System.out.println("6: Exit");
	         
	         /*
	         try {
	        	 int choice = Integer.parseInt(br.readLine());
	         } catch (NumberFormatException nfe) {
	        	 nfe.getMessage();
	         } catch (IllegalArgumentException iae) {
	        	 iae.getMessage();
	         } catch (IOException ioe) {
	        	 ioe.printStackTrace();
	         }
	         */
	         int choice = Integer.parseInt(br.readLine());
	         
	         switch (choice) {
	         case 1:
	        	 addCustomer();
	        	 break;
	         case 2:
	        	 deposit();
	        	 break;
	         case 3:
	        	 withdraw();
	        	 break;
	         case 4:
	        	 checkBalance();
	        	 break;
	         case 5:
	        	 calculateInterest();
	        	 break;
	         case 6:
	        	 System.exit(0);
	        	 break;
	         }
	         
		}
	}
	
	/**
	 * If the option selected by the user is 1
	 * Ask the amount of money the customer wants to deposit the first time while creating the account
	 * Ask the person to enter an account number
	 * Create the Account object that contains the money and the accNumber
	 * Ask for the customer's name and create the customer object with that name
	 * Add the newly created customer to the list of customers, increment the number of customers in the bank
	 * Print his details
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void addCustomer() throws NumberFormatException, IOException {
		System.out.println("Creating an account for a new customer.");
		System.out.println("Please enter initial amount for your account");
		
		// Gather information
		double balance = Double.parseDouble(br.readLine());
		System.out.println("Please enter your account number.");
		String accNumber = br.readLine();
		Account account = new Account(balance, accNumber); 								// creating the account
		System.out.println("Please enter your name");
		String name = br.readLine();
		Customer customer = new Customer(name, account);  								// creating a new customer
		customers.add(customer);														// add customer to the ArrayList
		System.out.println("Number of customers : " + bank.getCustomers().size());
		for (int i = 0 ; i < customers.size(); i++) {
			System.err.println("Name: " + customers.get(i).getName());
		}
		//numberOfCustomers++;
		// Add the newly created customer to the ArrayList
		
	}
	
	/**
	 * If no customers are added to the list, print a message to the user
	 * Search for users account numbers: acc1,acc2,acc3,acc4 if search for acc5, print message to user
	 * else ask for the amount of money to be deposited
	 * @throws IOException 
	 */
	public static void deposit() throws IOException {
		
		// Ask for information
		System.out.println("Please enter your account number.");
		String accNumber = br.readLine();
		if (customers.size() == 0) {
			System.err.println("Account number not found, list is empty");
		}
		else {
			boolean found = false;
			// browse through all customers to check number
			for (int i = 0; i < customers.size(); i++) {
				Customer tempCustomer = customers.get(i);
				//Account tempAccount = customers.get(i).getAcc();
				if (tempCustomer.getAcc().getAccountNumber().equals(accNumber)) {
					System.out.println("Please enter the amount to deposit");
					double money = Double.parseDouble(br.readLine());
					tempCustomer.getAcc().deposit(money);
					found = true;
				}
			}
			if (found == false) {
				System.err.println("Account number not found");
			}
		}
	}
	
	public static void withdraw() throws IOException{
		System.out.println("Please enter your account number.");
		String accNumber = br.readLine();
		
		if (customers.size() == 0) {
			System.err.println("Account number not found, the list is empty");
		}
		else {
			boolean found = false;
			
			for (int i = 0; i < customers.size(); i++) {
				Account tempAccount = customers.get(i).getAcc();
				if (tempAccount.getAccountNumber().equals(accNumber)) {
					System.out.println("Enter amount of money to be withdrawn from the account.");
					double amount = Double.parseDouble(br.readLine());
					tempAccount.withdraw(amount);
					found = true;
				}
			}
			if (found == false) {
				System.err.println("Account number not found.");
			}
		}
		
	}
	
	public static void checkBalance() throws IOException{
		System.out.println("Please enter your account number.");
		String accNumber = br.readLine();
		
		if (customers.size() == 0) {
			System.err.println("Account number not found, the list is empty");
		}
		else {
			boolean found = false;
			
			for (int i = 0; i < customers.size(); i++) {
				Account tempAccount = customers.get(i).getAcc();
				if (tempAccount.getAccountNumber().equals(accNumber)) {
					Customer tempCustomer = customers.get(i);
					tempCustomer.display();
					found = true;
				}
			}
			if (found == false) {
				System.err.println("Account number not found.");
			}
		}
	}
	
	public static void calculateInterest() throws IOException{
		System.out.println("Please enter your account number.");
		String accNumber = br.readLine();
		
		if (customers.size() == 0) {
			System.err.println("Account number not found, list is empty");
		}
		else {
			boolean found = false;
			
			for (int i = 0 ; i < customers.size(); i++) {
				Account tempAccount = customers.get(i).getAcc();
				if (tempAccount.getAccountNumber().equals(accNumber)){
					bank.calculateInterest(customers.get(i));
					found = true;
				}
			}
			
			if (found == false) {
				System.err.println("Account number not found.");
			}
			
		}
		
	}

}
