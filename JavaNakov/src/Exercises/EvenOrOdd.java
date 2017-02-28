package Exercises;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 35;
		
		// First exercise
		System.out.println((number % 2==0) ? "isEven" : "isOdd");
		
		// Second exercise
		boolean isDivisible = ((number % 5 == 0)&& (number % 7 == 0));
		System.out.println(isDivisible);
		
		
	}

}
