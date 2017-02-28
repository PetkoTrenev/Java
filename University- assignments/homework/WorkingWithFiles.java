
package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WorkingWithFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		////////////////////////// FILE CREATION ////////////////////////////////////
		/*
		 * The most important thing to remeber!!!!
		 * There is a method called createNewFile() which returns boolean value
		 * and creates the file in the project's directroy
		 */
		File myFile = new File("newfile.txt");
		/*try {
			boolean isCreated = myFile.createNewFile();
			if(isCreated) {
				System.out.println("Your file is created");
			} else {
				System.out.println("File wasn't created, or it's already there");
			}
		} catch (FileNotFoundException fnf){
			fnf.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} */
		
		////////////////////// WRITE TO A FILE //////////////////////////////
		/*
		 * 
		 */
		try{
		      byte[] writeArr = {1,2,3,4,5};
		      FileWriter os = new FileWriter("newfile.txt");
		      for(int i = 0; i < writeArr.length ; i++){
		         os.write( writeArr[i] ); 
		      }
		      os.close();
		     
		      
		      FileReader is = new FileReader("newfile.txt");
		      BufferedReader bfr = new BufferedReader((is));
		      bfr.readLine()
		      int size = is.available();
		      
		      for(int i=0; i< size; i++){
		         System.out.print(is.read() + "  ");
		      }
		      is.close();
		   }catch(IOException e){
		      System.out.print("Exception");
		   }	
		
		

	}

}
