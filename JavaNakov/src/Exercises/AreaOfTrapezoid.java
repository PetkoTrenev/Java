package Exercises;

import java.util.Scanner;

public class AreaOfTrapezoid {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int base = Integer.parseInt(scan.nextLine());
		int base2 = Integer.parseInt(scan.nextLine());
		int height = Integer.parseInt(scan.nextLine());
		
		double area = ((base + base2)/2) * height;
		
		System.out.println(area);
		
	}

}
