
package homework;

import java.util.Random;

public class RandomPasswordGenerator {
	
	private static final String CAPITAL_LETTERS = 
			"ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String SMALL_LETTERS = 
			"abcdefghijklmnopqrstuvwxyz";
	private static final String DIGITS = "01234556789";
	private static final String SPECIAL_CHARS = 
			"~!@#$%^&*()[]\\|':;.,/?<>";
	private static final String ALL_CHARS = 
			CAPITAL_LETTERS + SMALL_LETTERS + DIGITS + SPECIAL_CHARS;
	
	private static Random rnd = new Random();
	
	
	public static void main(String[] args) {
		StringBuilder password = new StringBuilder();
		
		// Generate two random capital letters
		for (int i = 1; i <= 2; i++) {
			char capitalLetter = generateChar(CAPITAL_LETTERS);
			insertAtRandomPosition(password, capitalLetter);
		}
		
		// Generate two random small letters
		for (int i = 1; i<=2; i++) {
			char smallLetter = generateChar(SMALL_LETTERS);
			insertAtRandomPosition(password, smallLetter);
		}
		
		// Generate a random digit
		char digit = generateChar(DIGITS);
		
		// Insert the random digit in the password
		insertAtRandomPosition(password, digit);
		
		// Generate 3 special characters
		for (int i = 1; i <=3; i++) {
			char specialChar = generateChar(SPECIAL_CHARS);
			insertAtRandomPosition(password, specialChar);			
		}
		
		// Generate the rest of the chars from 0-7
		int count = rnd.nextInt(8);
		for (int i = 1; i <= count; i++) {
			char specialChar = generateChar(ALL_CHARS);
			insertAtRandomPosition(password, specialChar);
		}
		System.out.println(password);
	}
	
	// Insert a char at a random position in the StringBuilder
	private static void insertAtRandomPosition(StringBuilder password, char character) {
		int randomPosition = rnd.nextInt(password.length()+1);
		password.insert(randomPosition, character);
	}
	
	// Generates a random character from the available String
	public static char generateChar(String availableChars) {
		int randomIndex = rnd.nextInt(availableChars.length());
		char randomChar = availableChars.charAt(randomIndex);
		return randomChar;
		
	}
	
}
