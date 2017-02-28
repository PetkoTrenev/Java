package lesson4;

public class Nurse extends Employee {

	public Nurse(int id, String name, String departament, boolean working) {
		super(id, name, departament, working);
		System.out.println("Nurse in action....");
	}

	// Nurses responsibility
	private void checkVitalSigns() {
		System.out.println("Checking vital signs");
	}

	private void drawBlood() {
		System.out.println("Drawing blood.");
	}

	@Override
	public void performDuties() {
		// TODO Auto-generated method stub
		checkVitalSigns();
		drawBlood();
	}

}
