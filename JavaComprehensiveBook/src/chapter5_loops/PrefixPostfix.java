
package chapter5_loops;

public class PrefixPostfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				//System.out.println(i * j);
				count++;

			}
		}
		System.out.println(count);

	}
}
