import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "files/text.txt";
        String targetFile = "files/gosho.txt";

        try (
                FileReader fr = new FileReader(sourceFile);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(targetFile);
                ) {
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                fw.write(line + "\n");
            }
            System.out.println("File copied!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
