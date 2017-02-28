
package chapter3_selections;

import java.util.Scanner;

/*(Algebra: solve 2 * 2 linear equations) 
 * You can use Cramer’s rule to solve the following 2 * 2 system of linear equation:
	ax + by = e
	cx + dy = f
	x = ed - bf / ad - bc
	y = af - ec / ad - bc
*/
public class CramersRule {
	public static void main(String[] args) {
		S	canner sc = new Scanner(System.in);
		
		// Prompt user to get numbers
		System.out.println("Enter numbers for a b c d e f: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		
		if (a * d - b * c == 0) {
			System.out.println("The program has no solution");
		} else {
			double x = (e * d) - (b * f) / (a * d - b * c);
			double y = (a * f) - (e * c) / (a * d - b * c);
			System.out.println("x is: " + x + " and " + "y is: " + y);
		}
		
		
		sc.close();
	}

}
