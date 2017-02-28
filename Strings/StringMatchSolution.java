
package two.warmup;

//Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. 
//So"xxcaazz" 
//and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
/*
stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0 */

public class StringMatchSolution {
	public static void main(String[] args) {
		stringMatch("xxcaazz","xxbaaz");
	}
	
	public static int stringMatch(String a, String b) {
		
		  // finding the shorter string
		  int len = Math.min(a.length(), b.length());
		  int count = 0;
		  
		  // getting the 2 letters and comapre them
		  for (int i = 0; i < len - 1; i++) {
			  String aTwos = a.substring(i, i+2);
			  String bTwos = b.substring(i, i+2);
			  
			  if (aTwos.equals(bTwos)) {
				  count++;
			  }
		  }
		  System.out.println(count);
		  return count;
		}

}
