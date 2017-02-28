import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter required number of cases: ");
		int cases = sc.nextInt();
		String s;
		
		for(int i=0;i<cases;i++){
	        s = sc.next();

	        for(int j=0;j<s.length();j++){

	            if(j%2 ==0){
	                System.out.print(s.charAt(j));
	            }
	        } 
	        System.out.print(" ");
	        for(int j=0;j<s.length();j++){
	            if(j%2==1){
	                System.out.print(s.charAt(j));
	            }

	        }
	        System.out.println();
	    }
	}

}
