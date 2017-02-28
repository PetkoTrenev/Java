package homework;


public class Employee {
	
	/**
	 * Local variables do not have a default value
	 * Whereas instance variables have a default value
	 * int = 0;
	 * boolean = false;
	 * Objects = NULL;
	 * floating point numbers = 0.0;
	 */
	
	public String name;
	private double salary;
	
	/**
	 * 
	 * 
	 * 
	 */
	public Employee(String n) {
		name = n;
		//this.salary = salary;
	}
	
	public void setSalary(double newSalary) {
		this.salary = newSalary;
	}
	
	public void printInfo(){
		System.out.println("name: " + name);
		System.out.println("salary: "+ salary );
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Gosho");
		emp1.setSalary(100);
		emp1.printInfo();

	}

}
