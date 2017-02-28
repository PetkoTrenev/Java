package recursion;

public class RecursionPractice {
	public static void main(String[] args) {
		System.out.println(reverseString("Hello"));
		System.out.println(allDollars("Hello"));
	}
	
	public static String reverseString(String s){
	    if (s.length() <= 1) 
	         return s;
	    		System.out.println(s.charAt(0) + reverseString(s.substring(1)));
	    return s.charAt(0) + reverseString(s.substring(1));
	}
	
	public static String allDollars(String str) {
		if (str.length() <= 1) {
			return str; // for the last letter
		} else {
			return str.charAt(0) + "$" + allDollars(str.substring(1));
		}
	}
	
	public static int myRecursiveMethod (int aVariable)  
	{  
	  System.out.println(aVariable); 
	  aVariable--;  
	   
	  if (aVariable == 0)  
	    return 0;  
	  return myRecursiveMethod(aVariable);  
	} 
}
