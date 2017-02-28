package Examples;

import java.util.Scanner;

public class rectangleNbyN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int row = 0; row < n; row++) {
			for(int col = 0; col < n; col++){
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
