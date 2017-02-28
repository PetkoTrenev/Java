package StudentHomework;

import java.util.Scanner;

public class StudentGroup {

	private Student[] group;
	Scanner sc = new Scanner(System.in);
	//int numberOfStudents = sc.nextInt();
    
	
	public StudentGroup() {
		group = new Student[numberOfStudents];
	}
	
	public Student[] getGroup() {
		return group;
	}
	
	
	// Защо трябва да не е статик за да мога да използвам group[i]
	public void gatherInfo(int students) {
		
		
		for (int i = 0; i < students; i++) {
			
			System.out.println("Enter your first name: ");
			String fName = sc.nextLine();
			System.out.println("Enter your second name: ");
			String sName = sc.nextLine();
			System.out.println("Enter you fac number: ");
			String facN = sc.nextLine();
			System.out.println("Enter your mark");
			double mark = sc.nextDouble();
			
			group[i] = new Student(fName, sName, facN, mark);
		}
	}
}
