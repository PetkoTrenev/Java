package lesson4;

public class Doctor extends Employee {

	public Doctor(int id, String name, String departament, boolean working) {
		super(id, name, departament, working);
	}

	// Doctors
	public void perscribeMedicine() {
		System.out.println("Perscribing medicine");
	}

	public void diagnosePatients() {
		System.out.println("Examing...");
	}

	@Override
	public void performDuties() {
		// TODO Auto-generated method stub
		performDuties();
		diagnosePatients();
	}
}
