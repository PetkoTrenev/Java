package homework;

public class StringBuilderBufferTest {
	public static void main(String args[]){
		StringBuilder sb = new StringBuilder("Petko");
		sb.append(" Trenev");
		sb.append(" its good");
		String name = sb.toString();
		System.out.println("Name: "+name);
		
		float floatVar = 2.0f;
		int intVar = 2;
		String stringVar = "Nothing";
		
		String fs;
		fs = String.format("The value of the float variable is " +
                "%.2f, while the value of the integer " +
                "variable is %d, and the string " +
                "is %s", floatVar, intVar, stringVar);
		System.out.println(fs);
	}

}
