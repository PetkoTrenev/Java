package flow.control;

public class WhilePractice {
	public static void main(String[] args) {
		int totalCount = 0;
		int countLoops = 0;
		int sentinel = 5;
		
		while (sentinel != 20) {
			if (countLoops == 5) {
				System.out.println("We got our five");
				break;
			}
			if (!isEvenNumber(sentinel)) {
				sentinel++;
				continue;
			}
			System.out.println("Even number " + sentinel);
			totalCount += sentinel;
			sentinel++;
			countLoops++;
		}
		
		System.out.println("The total count is " + totalCount);
		System.out.println("The number of even numbers found were " + countLoops);
	}
	
	public static boolean isEvenNumber(int number) {
		if (number % 2 == 0) {
			//System.out.println("The number is even");
			return true;
		} else {
			//System.out.println("The number is odd");
			return false;
		}
	}

}
