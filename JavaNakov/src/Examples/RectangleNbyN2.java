package Examples;

import java.util.Scanner;

public class RectangleNbyN2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		for (int row = 1; row <= n; row++) {
			System.out.print("*");
			for (int col = 1; col < n; col++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
