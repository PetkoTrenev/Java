import java.util.Scanner;

public class Practice {
	
	/* Make those patterns
	1*****		12345&		@
	12****		1234&&		@ @
	123***		123&&&		@   @
	1234**		12&&&&		@     @
	12345*		1&&&&&		@      @
	123456		&&&&&&		@ @ @ @ @
	 */
	
	public static void main(String[] args) {
		
		//printPattern();
		System.out.println("---------------------------");
		//printSecondPattern();
		System.out.println("---------------------------");
		printThirdPattern();
		System.out.println("-----------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n = sc.nextInt();
		sc.nextLine(); // clear buffer
		floydTriangle(n);
		System.out.println("-----------------------------");
		printTriangle2();
		
	}
	
	/**
	 * Floyd triangle
	 */
	
	public static void printTriangle2() {
		for (int row = 1; row <= 5; row++) {
			for (int col = 4; col >= row; col--){
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			
			System.out.println();
		}
	}
	
	public static void printTriangle() {
		for (int row = 1; row <= 6; row++) {
			for (int col = 5; col >= row; col--) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
	
	public static void floydTriangle(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
	
	public static void printThirdPattern() {
		System.out.println("@");
		for (int row = 1; row <= 5; row++) {
			System.out.print("@");
			for (int i = 1; i <= row; i++) {
				System.out.print(i);
			}
			System.out.println("@");
		}
	}
	
	public static void printSecondPattern() {
		for (int row = 1; row <= 6; row++) {
			// print numbers
			for (int i = 5; i >= row; i--) {
				System.out.print(i);
			}
			// print ampersands
			for (int j = 1; j <= row; j++) {
				System.out.print("&");
			}
			System.out.println();
		}
	}
	
	public static void printPattern() {
		// for the number part
		for (int row = 1; row  <= 6; row++) {
			// print the numbers
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			// stars part
			for (int k = 5; k >= row; k--) {
				System.out.print("*");
			}
				System.out.println();
			}	
	}

}
