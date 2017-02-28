
package day14;


public class Calculator{
	
	int power(int a, int b) {
		int numberPower = 0;
		try {
			if (a < 0 || b < 0) {
				throw new IllegalArgumentException
				("n and p should be non-negative.");
			} else {
			numberPower = (int) Math.pow(a,b);
			}
		} catch (NumberFormatException nfe) {
			System.out.println("n and p should be "
					+ "non-negative.");
		}
		return numberPower;
	}

}
