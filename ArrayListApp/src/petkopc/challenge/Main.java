package petkopc.challenge;

import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	private static MobilePhone phoneContactList = new MobilePhone();

	public static void main(String args[]) {
		// TODO Auto-generated constructor stub
		boolean quit = false;
		int choice = 0;
		printInstructions();
		
		while (!quit) {
			System.out.print("Enter your choice");
			
			choice = sc.nextInt();
			// flush buffer
			sc.nextLine();

			switch (choice) {
				case 0:
					printInstructions();
					break;
				case 1:
					phoneContactList.printContactList();
					break;
				case 2:
					addContact();
					break;
				case 3:
					modifyContactName();
					break;
					
			}
		}
	}
	
	public static void modifyContactName(){
		//phoneContactList.modifyContactName();
	}
	
	// Adds a contact to the list
	public static void addContact() {
		phoneContactList.addContact(new Contacts("Gosho","123"));
	}
	
	// Prints the menu for the user
	public static void printInstructions() {
		System.out.println("\nPress");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To print list of contacts.");
		System.out.println("\t 2 - To add a new contact to the list.");
		System.out.println("\t 3 - To update an existing contact.");
		System.out.println("\t 4 - To remove an existing contact");
		System.out.println("\t 5 - To search/find a contact.");
		System.out.println("\t 6 - To quit the application");
	}

}
