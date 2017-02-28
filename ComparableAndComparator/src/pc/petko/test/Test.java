package pc.petko.test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Test<T> {
	public static void main(String[] args) {
		Users user1 = new Users("Gosho", "123");
		Users user2 = new Users("Adash", "234");
		
		ArrayList<Users> list = new ArrayList<Users>();
		list.add(user1);
		list.add(user2);
		
		Collections.sort(list);
		
		printResult(list);
		
		
		String user3 = "gosho";
		String user4 = "Zebra";
		String user5 = "katq";
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add(user3);
		list2.add(user4);
		list2.add(user5);
		
		// Sorts particular variables based on a condition
		Collections.sort(list2, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});
		
		printResult(list2);
	}
	

	public static <T> void printResult(ArrayList<T> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("ArrayPosition " + i + " user position " + list.get(i));
		}
		
	}
}
