package assignment_11;

import ignore.TestingUtils;

public class App {


	/**

	Given a string, return a string where for every char in the original, append another. 
	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		repeatChar("The")  <b>---></b>"TThhee"<br>
		repeatChar("AAbb")    <b>---></b> "AAAAbbbb" <br>
		repeatChar("Hi-There") <b>---></b> "HHii--TThheerree" <br>
	 */
	
	public static String repeatChar(String str) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			sb.append(str.substring(i,i+1));
			sb.append(str.substring(i,i+1));
		}
		return sb.toString();
		
	}
	
	public static String repeatAChar(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			result = result + letter + letter;
		}
		return result;
	}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}
