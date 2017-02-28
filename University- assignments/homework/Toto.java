
package homework;

import java.util.Random;

public class Toto {
	public static void main(String[] args) {
		Random rnd = new Random();
		for (int j = 0; j < 5; j++) {
		    for (int i = 1; i <= 6; i++) {
			int randomNum = (rnd.nextInt(49) + 1);
			System.out.printf(rnd.nextInt(49) + 1 + " ");
		    }
		    System.out.println();
	    }
	}
}
