package pc.petko;

import java.util.Scanner;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);
	private static MobilePhone mp = new MobilePhone();
	
	public Main() {
		// TODO Auto-generated constructor stub
		System.out.println("This app is made by Petko Trenev");
		startPhone();
		printInstructions();
		boolean quit = true;
		
		while (quit) {
			// input from user to take control of the flow
			System.out.println("\n Enter action: (6 to show available actions)");
			int action = sc.nextInt();
			sc.nextLine(); // flush buffer
			
			switch (action) {
			case 0:
				System.out.println("Exiting the program...");
				quit = false;
				break;
			case 1:
				mp.printContactList();
				break;
			case 2:
				addNewContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				queryContact();
				break;
			case 6:
				printInstructions();
				break;
			}
		}
	}
	
	private static void addNewContact() {
		// TODO Auto-generated method stub
		System.out.println("Enter new contact name.");
		String name = sc.nextLine();
		System.out.println("Enter phone number");
		String phoneNumber = sc.nextLine();
		
		// Should this be an actual object or not ???????
 		Contact newContact = Contact.createContact(name, phoneNumber);
 		if (mp.addNewContact(newContact)) {
 			System.out.println("Contact added " + name + ", phone " + phoneNumber);
 		} else {
 			System.out.println("Can't add, " + name + " already in the list.");
 		}
	}
	
	public static void queryContact() {
		
	}
	
	public static void updateContact() {
		
	}
	
	

	private static void startPhone() {
		// TODO Auto-generated method stub
		System.out.println("Starting phone.....");
	}

	public static void printInstructions() {
		System.out.println("Press a number: ");
		System.out.println("0 - To stop the program.");
		System.out.println("1 - To print all contacts.");
		System.out.println("2 - To add a new contact.");
		System.out.println("3 - To update an existing contact.");
		System.out.println("4 - To remove an existing contact.");
		System.out.println("5 - To query if it the contact is already present.");
		System.out.println("6 - To print a list for available actions.");
	}

}
