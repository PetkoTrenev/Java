package training;

import java.util.Scanner;

public class Triangle {
	
	public static void main(String... args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		sc.close();
		
		printTriangles(n);
		
		
		
	}
	
	public static void printTriangles(int n){
	// Upper part of triangle
	for (int i = 1; i <= n; i++){
		printLine(1,i);
	}
	
	// Lower part
	for (int i = n-1; i >= 1; i--) {
		printLine(1, i);
	}
}
	
	private static void printLine(int start, int end) {
		for (int i = start; i <= end; i++) {
		System.out.print(" " + i);
		}
		System.out.println();
	}

}
