package dogtrouble;

public class Test {
	public static void main(String[] args) {
		System.out.println(dogTrouble(true, 6)); // true
		System.out.println(dogTrouble(false, 7)); // false
		System.out.println(dogTrouble(false, 6)); // false
	}
	
	public static boolean dogTrouble(boolean barking, int hour) {
		return (barking && (hour < 7 || hour > 20));
	}
	
}
