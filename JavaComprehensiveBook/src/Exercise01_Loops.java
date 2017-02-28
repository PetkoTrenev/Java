import java.util.Scanner;

public class Exercise01_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int positiveCount = 0;
		int negativeCount = 0;
		double positiveSum = 0.0;
		double negativeSum = 0.0;

		System.out.println("Enter an integer, the input ends if it is 0");
		while (sc.hasNextDouble()) {

			double input = sc.nextDouble();

			if (input > 0) {
				positiveSum += input;
				positiveCount++;
			} else if (input < 0) {
				negativeSum += input;
				negativeCount++;
			} else {
				;
			}

		}
		if (positiveSum > 0 || negativeSum < 0) {
			System.out.println("The number of positives is " + positiveCount);
			System.out.println("The number of negatives is " + negativeCount);
			System.out.println("The total is " + (positiveSum + negativeSum));
			System.out.println("The average is " + (positiveSum + negativeSum) / (positiveCount + negativeCount));
		} else {
			System.out.println("No numbers are entered except 0");
		}

	}

}
