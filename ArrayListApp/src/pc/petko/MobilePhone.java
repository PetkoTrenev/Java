package pc.petko;

import java.util.ArrayList;

public class MobilePhone {
	// declare
	public ArrayList<Contact> contacts;
	
	// constructor
	public MobilePhone() {
		contacts = new ArrayList<Contact>(); // initialize
	}
	
	// prints contact list
	public void printContactList() {
		for (int i = 0; i < contacts.size(); i++) {
			System.out.println((i+1) + "." + contacts.get(i).getName() + " -> " + contacts.get(i).getPhoneNumber());
		}
	}
	
	// adds a new contact to current list
	public boolean addNewContact(Contact contact) {
		if(findContact(contact.getName()) >= 0) {
			System.out.println("Contact is already in the list.");
			return false;
		} else {
			contacts.add(contact);
			System.out.println("Added " + contact.getName() + ".");
			return true;
		}
	}
	
	// removes a contact from the current list if found
	public boolean removeContact(Contact contact) {
		int foundPosition = findContact(contact);
		if (foundPosition < 0) {
			System.out.println(contact.getName() + ", was not found.");
			return false;
		} else {
			contacts.remove(foundPosition);
			System.out.println(contact.getName() + ", was removed.");
			return true;
		}
	}
	
	// updates an existing contact
	public boolean updateContact(Contact oldContact, Contact newContact) {
		int foundPosition = findContact(oldContact);
		if (foundPosition < 0) {
			System.out.println(oldContact.getName() + ", was not found.");
			return false;
		}
		contacts.set(foundPosition, newContact);
		System.out.println(oldContact.getName() + ", was replaced by " + newContact.getName());
		return true;
	}
	
	// query contact if it's in list
	public String queryContact(Contact contact) {
		if (findContact(contact) >= 0) {
			return contact.getName();
		}
		return null;
	}
	
	
	// Find contact by index
	private int findContact(Contact contact) {
		return contacts.indexOf(contact);
	}
	
	
	// Find contact by name
	private int findContact(String contactName) {
		for(int i = 0; i < contacts.size(); i++) {
			Contact contact = contacts.get(i);
			if (contact.getName().equals(contactName));
			return i;
		}
		return -1;
	}
}
