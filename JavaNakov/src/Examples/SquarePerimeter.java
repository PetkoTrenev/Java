package Examples;

public class SquarePerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int squarePerimeter = 17;
		double squareSide = squarePerimeter / 4.0;
		double squareArea = squareSide * squareSide;
		System.out.println(squareSide);
		System.out.println(squareArea);
		System.out.println();
		
		int a = 5;
		int b = 4;
		System.out.println(a + b);  // 9
		System.out.println(a + b++); // before print 9 after is 10
		System.out.println(a + b); // 10
		System.out.println(a + (++b)); // 11
		System.out.println(a + b); // 11
		System.out.println(14 / a); // 2
		System.out.println(14 % a); // 4
		
		
	}

}
