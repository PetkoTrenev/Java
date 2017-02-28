
package day12;

public class Person {

	private String firstName;
	private String lastName;
	private int idNumber;

	// Constructor
	public Person(String firstName, String lastName, int idNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
	}

	// Instance method
	// Print person data
	public void printPerson() {
		System.out.println("Name: " + this.lastName + ", " + this.firstName + "\nID: " + this.idNumber);
	}
}
