package JavaPIK.src.homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class EX6 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] array = new int[number];
		readNumbers(array);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] resultArray = resultArray(a,b,array);
		printArrays(array, resultArray);
		
	}

	public static void readNumbers(int[] numbers) {
		
		for(int i = 0 ; i < numbers.length; i++) {
			numbers[i] = i;
		}
	}
	
	public static int[] resultArray(int X, int Y, int[] numbers) {
		int[] result = new int[Y-X-1];
		int index = 0;	
		for (int i=0; i<numbers.length; i++){
            if (numbers[i] > X && numbers[i] < Y){
                result[index++] = numbers[i];
            }
        }		
		return result;		
	}

	public static void printArrays(int[] numbers, int[] result) {
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(result));
	}
}