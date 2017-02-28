
package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
	public static void main (String args[]) {
		// Creating ArrayList
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		// populating my list
		arrList.add(0);
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		
		// printing the list
		System.out.println("Before modification: " + arrList);
		// modifing the lsit
		arrayModifier(arrList);
		// printing the modified list
		System.out.println("Modified: " + arrList);
	}
	
	// Method for modifing my list
	public static void arrayModifier (ArrayList<Integer> num) {
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0; i < num.size(); i++) {
			//int number = sc.nextInt();
			// num.get(i) = 0, 1, 2, 3
			// num.get(i) + 2 = 2, 3, 4, 5 
			// num[i] = num.get(i);
			num.set(i, num.get(i) + 2);
		}
	}

}
