package fileio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FilePractice {
	/**
	 * Read 2 numbers from InputStreamReader in this case keyboard
	 * If any problem occurs, deals with it via catch blocks.
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			System.out.print("Enter a first number: ");
			String num1 = br.readLine();
			System.out.print("Enter second number: ");
			String num2 = br.readLine();
			int numberOne = Integer.parseInt(num1);
			int numberTwo = Integer.parseInt(num2);
			
			int sum = numberOne + numberTwo;
			
			System.out.println("Sum " + sum);
			
			
		} catch (NumberFormatException nfe) {
			System.err.println("An exception has occured: " + nfe.getMessage());
			nfe.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			isr.close();
		}
	}


}
