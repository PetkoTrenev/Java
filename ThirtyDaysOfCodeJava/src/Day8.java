import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Map<String,Integer> phoneBook = new HashMap<String,Integer>();
	    int n = in.nextInt();
	    String name = "";
	    int phone = 0;
	    for(int i = 0; i < n; i++){
	    	// takes the key
	         name = in.next();
	         // takes the value
	         phone = in.nextInt();
	         phoneBook.put(name, phone);
	        }
	        while(in.hasNext()){
	            String s = in.next();
	            if (phoneBook.containsKey(s)) {
	            	System.out.println(s + "=" + phoneBook.get(s));	            	
	            } else {
	            	System.out.println("Not found");
	            }
	        }
	        in.close();
	}

}
