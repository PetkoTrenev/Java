import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hello {
	public static void main(String[] args) {
		System.out.println(reverseString("Hello"));
		
	}
	
	public static String reverseString(String s){
	    if (s.length() <= 1) 
	         return s;
	    		System.out.println(s.charAt(0) + reverseString(s.substring(1)));
	    return reverseString(s.substring(1) + s.charAt(0));
	}
}
