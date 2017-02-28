package Exercises;

import java.util.Scanner;

public class TheFirm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String firstName = scan.nextLine();
		String familyName = scan.nextLine();
		int age = Integer.parseInt(scan.nextLine());
		String gender = scan.nextLine();
		int IDnumber = Integer.parseInt(scan.nextLine());
		
		System.out.println(firstName);
		System.out.println(familyName);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(IDnumber);
	}

}
