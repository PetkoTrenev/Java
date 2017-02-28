package Exercises;

public class DeclaringVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Primitive types(whole numbers): ");
		byte firstNumber = -115;
		byte secondNumber = 97;
		short thirdNumber = -10000;
		int fourthNumber = 4_825_932;
		
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		System.out.println(thirdNumber);
		System.out.println(fourthNumber);
		System.out.println();
		
		System.out.println("Primitive types(floating-point numers): ");
		float first = 12.345f;
		float second = 3456.091f;
		double third = 8923.1234857f;
		double fourth = 34.567839023;
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(fourth);
		System.out.println();
		
		System.out.println("Decima to hex: ");
		int input = 256;
		String myNumber = Integer.toHexString(input);
		System.out.println("0x" + myNumber);
		System.out.println();
		
		System.out.println("Using chars: ");
		char myGender = 'm';
		System.out.println(myGender);
		System.out.println();
		
		System.out.println("String concatenation + objects");
		String hello = "Hello";
		String world = "World";
		Object obj = hello + " " + world;
		System.out.println(obj);
		
		String quotationsDifficulty = 
				"The \"use\" of quotations causes difficulties";
		System.out.println(quotationsDifficulty);
	}

}
