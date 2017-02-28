package petkopc.challenge;

public class Contacts {
	
	private String name;
	private String phoneNumber;
	
	public Contacts(String name) {
		this.setName(name);
	}
	
	public Contacts(String name, String phoneNumber) {
		this.setPhoneNumber(phoneNumber);
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.equals("") || name == null) {
			throw new IllegalArgumentException("Invalid name.");
		} else {
			this.name = name;
		}
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		
		if (phoneNumber == null || phoneNumber.equals("")) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		this.phoneNumber = phoneNumber;
	}
	
	// That is how a user will make a contact
	public static Contacts createContact(String name, String phoneNumber){
		return new Contacts(name, phoneNumber);
	}

	@Override
	public String toString() {
		return "Name: " + name + "\tPhone number: " + phoneNumber;
	}

	
}
