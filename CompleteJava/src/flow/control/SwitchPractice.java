package flow.control;

import java.util.Scanner;

public class SwitchPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		switch (c) {
		case 'A':
			System.out.println("You typed A");
			break;
		case 'B':
			System.out.println("You typed B");
			break;
		case 'C':
			System.out.println("You typed C");
			break;
		default:
			System.out.println("Not found");
		}
	}

}
