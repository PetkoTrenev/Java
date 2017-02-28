
package school2017;

import java.util.Scanner;

public class TestSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//String name = sc.nextLine();
		
		Teacher args[0] = new Teacher("GoshoUchitel", "778822121", new Course("Maths"));
		System.out.println("Teacher info: ");
		System.out.println("Teacher's name: " + teacher.getName() + "\n" + "Teacher's EGN: " + teacher.getEGN());
		System.out.println("Subject before change: " + teacher.getCourse().getSubject());
		teacher.getCourse().setSubject("Risuvane");
		System.out.println("Subject after change: " + teacher.getCourse().getSubject());
	}

}
