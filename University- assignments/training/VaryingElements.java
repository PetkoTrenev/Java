package training;

import java.util.Scanner;

public class VaryingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many books you would like to sum");
	
		
		printTotalAmountForBooks(5, 1.2, 1,3);
	}
	
	public static void printTotalAmountForBooks(double ... prices) {
		double amount = 0;
		for (int i = 0; i < prices.length; i++) {
			amount += prices[i];
		}
			
		System.out.println("The total amount of those books is " + amount);
	}

}
