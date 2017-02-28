package challenge.inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outlander outlander = new Outlander(36);
		
		outlander.steer(45);
		outlander.accelerate(9);
		System.out.println();
		outlander.accelerate(10);
		System.out.println();
		outlander.accelerate(20);
		System.out.println();
		outlander.steer(30);
		outlander.accelerate(-39);

	}

}
