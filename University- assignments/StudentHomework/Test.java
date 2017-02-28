package StudentHomework;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentGroup gr = new StudentGroup();
		Scanner sc = new Scanner(System.in);
		int students = sc.nextInt();
		gr.gatherInfo(students);
		System.out.println(Arrays.toString(gr.getGroup()));
		sc.close();
	}

}
