package Examples;

import java.util.Scanner;

public class MinValue {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter amount of numbers: ");
		int n = Integer.parseInt(sc.nextLine());

		int min = Integer.MAX_VALUE;

		for (int i = 1; i <= n; i++) {
			int num = Integer.parseInt(sc.nextLine());

			if (num < min) {
				min = num;
			}
		}

		System.out.println("Min number is: " + min);
	}
}
