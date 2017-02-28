


public class Exercise02_Loops {
	public static void main(String[] args) {
		double kilograms = 0;
		double pounds = 0;
		//double kgToPounds = pounds * 2.2;
		System.out.print("Kilograms" + "\t" + "Pounds");
		System.out.println();
		for (int i = 1; i <= 200; i+=2) {
			kilograms = i;
			System.out.print(i + "\t \t");
			pounds = i * 2.2;
			System.out.printf("%.2f%n",pounds);
		}
		/*
		System.out.printf("Kilograms" + "\t" + "Pounds");
		for (int i = 1; i <= kilograms.length-1; i+=2) {
			if (i == 1) {
				System.out.println();
			}
			System.out.printf("%d",kilograms[i]);
			System.out.print("\t \t");
			System.out.printf("%.1f",pounds[i]);
			System.out.println(); */
		}
		
}	


