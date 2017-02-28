import java.util.Scanner;

public class Day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String binary = Integer.toBinaryString(n);
        //System.out.println(binary);
        int count = 0;
        int largest = 0;
        for (int i = 0; i < binary.length(); i++) {
        	if (binary.charAt(i) == '1') {
        		count++;        		
        		if (count > largest) {
        			largest = count;
        		}
        		//largest = Math.max(largest, count);
        	} else {
        		count = 0;
        	}
        }
        System.out.println(largest);
   }
}


