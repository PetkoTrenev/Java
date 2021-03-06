package pc.petko.game;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// for getting input from user
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		// play again String
		String playAgain = "";
		
		// game loop
		do {
			// create a random number from 1-100
			int theNumber = (int) (Math.random() * 100 + 1);
			
			// number for the user guess
			int guess = 0;
			
			while (guess != theNumber) {
				System.out.println("Guess a number between 1 and 100: ");
				
				// get user's guess
				guess = sc.nextInt();
				
				counter++;
				
				// guess logic
				if (guess < theNumber) {
					System.out.println(guess + " is too low. Try again.");
					
				} else if (guess > theNumber) {
					System.out.println(guess + " is too high. Try again.");
					
				} else {
					
					System.out.println(guess + " is correct. You win! \n"
							+ "It took you " + counter  + " tries." + " Good work!");
				}
				
				
			} // end of while loop
			
			// ask for 'y' to play again
			System.out.println("Would you like to play again (y/n)?");
			playAgain = sc.next();
			
		} while (playAgain.equalsIgnoreCase("y"));
		
		// thank the user for playing
		System.out.println("Thank you for playing! Goodbye.");
		
	}

}
