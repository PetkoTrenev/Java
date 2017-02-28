package pc.petko.app.domain;

// Represent an Employee at a hospital
 public class Employee {
	
	// fields
	private long id;
	private String name;
	private String departament;
	private boolean working;
	
	// Constructor
	public Employee(long id, String name, String departament, boolean working) {
		this.id = id;
		this.name = name;
		this.departament = departament;
		this.working = working;
	}
	

	// Good practice to override to show info about instances
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", departament=" + departament + ", working=" + working + "]";
	}
	
	
}
