package Examples;

import java.util.Scanner;

public class FindingMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount of numbers: ");
		int n = Integer.parseInt(sc.nextLine());
		
		int max = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= n-1; i++) {
			int num = Integer.parseInt(sc.nextLine());
			
			if (num > max) {
				max = num;
			}
		}
		
		System.out.println("Max number is: " + max);
	}

}
