package Example01.BinaryStream;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        // try with res
        try (
                FileInputStream fis =
                        new FileInputStream("res/binary_streams/java.jpg");
                FileOutputStream fos =
                        new FileOutputStream("res/binary_streams/java_out");
                ){
                    int i ;
                    // First reads every byte in the input stream
                    while ((i = fis.read()) != -1) {
                    // After every read byte we write it on the output stream
                        fos.write(i);
                    }
        }
        catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
    }
}
