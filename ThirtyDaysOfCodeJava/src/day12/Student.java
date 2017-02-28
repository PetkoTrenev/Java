
package day12;


public class Student extends Person{
	
	private int[] testScores;
	
	public Student(String firstName, String lastName, int idNumber, int[] testScores) {
		super(firstName, lastName, idNumber);
		this.testScores = testScores;
	}
	
	public char calculate() {
		double average = 0.0;
		char ch;
		for (int i = 0; i < testScores.length; i++) {
			average += testScores[i];
		}
		average /= testScores.length;
		if (average >= 90 && average <= 100) {
			ch = 'O';
			//System.out.println("O");
		} else if (average >= 80 && average < 90) {
			ch = 'E';
			//System.out.println("E");
		} else if (average >= 70 && average < 80) {
			ch = 'A';
			//System.out.println("A");
		} else if (average >= 55 && average < 70) {
			ch = 'P';
			//System.out.println("P");
		} else if (average >= 40 && average < 55) {
			ch = 'D';
			//System.out.println("D");
		} else {
			ch = 'T';
			//System.out.println("T");
		}
		
		return ch;
		
	}

}
