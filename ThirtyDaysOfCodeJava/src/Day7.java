import java.util.Scanner;

public class Day7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numbers = sc.nextInt();
		int[] myArray = new int[numbers];
		
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = sc.nextInt();
			
		}
		if (myArray.length == numbers) {
			for (int j = myArray.length-1; j >= 0; j--)
			System.out.print(myArray[j] + " ");
		}
		
	}

}
