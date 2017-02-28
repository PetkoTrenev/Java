
package two.warmup;


public class countXX {
	
	public static void main(String[] args) {
		System.out.println(countXX("abcxxadwbxx"));
	}
	
	public static int countXX(String str) {
		
		if (str.length() > 2) {
			return 0;
		} 
		
		int result = 0;
		
		for (int i = 0; i < str.length()- 1; i++) {
			if(str.substring(i, i+2).equals("xx")) {
				result++;
			}
		}
		return result;
	}

}
