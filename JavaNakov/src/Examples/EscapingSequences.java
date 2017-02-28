package Examples;

public class EscapingSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char symbol = 'a';
	    System.out.println(symbol);
	    
	    symbol = '\u003A';
	    System.out.println(symbol);
	    
	    // assign a single quote to a char
	    symbol = '\'';
	    System.out.println(symbol);
	    
	    // Assigning a backlash
	    symbol = '\\';
	    System.out.println(symbol);
	    
	    
	    // String quotations
	    String quotation = "\"Hello Jude\", he said";
	    System.out.println(quotation);
	    String path = "C:\\Windows\\Notepad.exe";
	    System.out.println(path);
	}

}
