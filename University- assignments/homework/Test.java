package homework;

import java.util.concurrent.SynchronousQueue;


public class Test {
	public void agePup() {
		int age = 0;
		age = age + 7;
		System.out.println("Your puppy is "+ age + " years old");
	}
	
	public static void main(String args[]) {
		Test pup = new Test();
		pup.agePup();
	}
	
	

}
