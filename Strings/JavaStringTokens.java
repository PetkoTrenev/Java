
package practice.java.strings;

import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] splitted = str.split("\\s");
		
		for (int i = 0 ; i < splitted.length; i++){
			System.out.println(splitted[i]);
		}
//		
		
		for (String s : splitted) {
			System.out.println(s);
		}
		
	}

}
