package lesson4;

public class EmergencyRoomProcess {
	public static void main(String[] args) {
		HospitalManagement ERDirector = new HospitalManagement();
		Employee gosho = new Nurse (1, "Gosho", "emergency", true);
		Employee gosho2 = new Doctor(2, "Gosho", "emergency", true);
		ERDirector.callUpon(gosho);
		ERDirector.callUpon(gosho2);
		
		
		// Object responsibility
	}
}
