package petkopc.challenge;

import java.util.ArrayList;

public class MobilePhone {
	
	private ArrayList<Contacts> contacts;
	
	public MobilePhone() {
		contacts = new ArrayList<>();
	}
	
	public void addContact(Contacts contact) {
		if (findContact(contact.getName()) >= 0) {
			System.out.println("Contact already in the list");
		} else {
		contacts.add(contact);
		}
	}
	
	public void printContactList() {
		System.out.println("You have " + contacts.size() + " contact in the phone book.");
		for (int i = 0; i < contacts.size(); i++) {
			System.out.println((i+1) + ". " + contacts.get(i));
		}
	}
	
	public void modifyContactName(Contacts currentName, Contacts newName){
		int position = findName(currentName);
		if(position >= 0) {
			contacts.set(position, newName);
		} else {
			System.out.println("Not present in the ArrayList");
		}
	}
	
	// find the index at which the name is that at the parameter
	private int findContact(String contactName) {
		for (int i = 0; i < contacts.size(); i++) {
			Contacts contact = contacts.get(i);
			if (contact.getName().equals(contactName)) {
				return i;
			}
		}
		return -1;
	}
	
	// finds the index of the contact
	private int findName(Contacts contact) {
		return contacts.indexOf(contact);	
	}
	
	public boolean inList(Contacts name) {
		int position = findName(name);
		if (position >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
