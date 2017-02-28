
package two.warmup;


public class StringSplotionTest {
	public static void main(String[] args) {
		
		System.out.println(stringSplosion("Code"));
	}
	
	public static String stringSplosion(String str){
		StringBuffer s = new StringBuffer();
		for (int i = 1; i <= str.length(); i++) {
			s.append(str.substring(0, i));
			System.out.println(s.toString());
		}
		
		return s.toString();
	}
}
