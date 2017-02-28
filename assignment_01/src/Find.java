
public class Find {
	public static void main(String[] args) {
		String str = "We have a large inventory of things in our warehouse falling in " + 
					"the category:apperal and the slightly " +
					"more in demand category:makeup along with the category:furniture and ..";
		
		printCategories(str);
	}
	
	public static void printCategories(String str) {
		int i = 0; // index
		
		while (true) {
			// find position in the String
			i = str.indexOf("category:", i);
			if (i == -1) {
				break;
			} 
			
			int start = i + 9; // starts word after the specified word
			int end = str.indexOf(" ", start); // finds the white space
			System.out.println(str.substring(start, end));
			
			i = i + 1; 
			
		}
	}

}
