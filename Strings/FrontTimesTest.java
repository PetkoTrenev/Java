
package two.warmup;

public class FrontTimesTest {

	public static void main(String[] args) {
		System.out.println(frontTimes("", 2));
	}

	public static String frontTimes(String str, int n) {
		StringBuilder sb = new StringBuilder();
		if (str.length() < 3) {
			sb.append(str);
		} else {
			String front = str.substring(0, 3);
			for (int i = 0; i < n; i++) {
				sb.append(front);
			}
		}
		return sb.toString();
	}

}
