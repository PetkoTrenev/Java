package Exercises;

import java.util.Scanner;

public class WeightOnMoon {
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		double weightOnEarth = Double.parseDouble(sc.nextLine());
		double weightOnMoon = weightOnEarth * 0.17;
		
		System.out.printf("The weight is %.2f ",weightOnMoon);
		
	}

}
