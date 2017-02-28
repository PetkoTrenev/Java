
package homework;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileExample{

   public static void main(String args[]){
   
   try{
      byte[] writeArr = {1,2,3,4,5};
      OutputStream os = new FileOutputStream("test.txt");
      for(int i = 0; i < writeArr.length ; i++){
         os.write( writeArr[i] ); 
      }
      os.close();
     
      InputStream is = new FileInputStream("test.txt");
      int size = is.available();

      for(int i=0; i< size; i++){
         System.out.print((char)is.read() + "  ");
      }
      is.close();
   }catch(IOException e){
      System.out.print("Exception");
   }	
   }
}
