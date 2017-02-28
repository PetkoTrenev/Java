package Example02.BufferedFileStreamReader;

import java.io.*;


public class StreamsDemo {
    public static void main(String[] args) {
        // The try with res
        try (BufferedReader bfr = new BufferedReader
                (new FileReader(new File("res/pesho")))) {
            System.out.println(bfr.readLine());
        }
        // Attempt to catch an exceptions
        catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
