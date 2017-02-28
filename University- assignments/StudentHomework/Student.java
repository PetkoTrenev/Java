package StudentHomework;

public class Student {
	
	private String firstName;
	private String secondName;
	private String facNumber;
	private double mark;
	
	public Student() {}
	
	public Student(String firstName, String secondName, String facNumber, double mark){
		this.firstName = firstName;
		this.secondName = secondName;
		this.facNumber = facNumber;
		this.mark = mark;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSecondName() {
		return this.secondName;
	}
	
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	public String getFacNumber() {
		return this.facNumber;
	}
	
	public void setFacNumber(String facNumber) {
		this.facNumber = facNumber;
	}
	
	public double getMark() {
		return this.mark;
	}
	
	public void setMark(double mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", secondName=" + secondName + ", facNumber=" + facNumber + ", mark="
				+ mark + "]";
	}
	
	
}
