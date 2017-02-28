package ds.stack;

import java.util.Scanner;

public class App {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter your name");
		String info = sc.nextLine();
		char array[] = info.toCharArray();
		Stack stack = new Stack(info.length());
		for (int i = 0; i < array.length; i++) {
			//System.out.println(array[i]);
			stack.push((char)array[i]);
		}
		
		while (!stack.isEmpty()) {
			char value = (char) stack.pop();
			System.out.println(value);
		}
	}
}
