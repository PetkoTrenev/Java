
package two.warmup;


public class StringTimes {
	
	public static void main(String[] args) {
		System.out.println(stringTimes("x", 4));
		
	}
	
	public static String stringTimes(String str,int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; ++i) {
			sb.append(str);
		}
		return sb.toString();
	}

}
