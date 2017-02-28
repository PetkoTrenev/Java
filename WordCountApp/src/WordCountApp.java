import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WordCountApp {
    public static void main(String[] args) throws IOException{

        String content = new String(Files.readAllBytes(Paths.get("src/test.txt")));

        String[] paragraps = content.split("\r\n");

        int numberOfWords = 0;

        for (int i = 0; i < paragraps.length; i++) {
            String[] words = paragraps[i].split(" ");
            if (!words[0].equals("")){
                numberOfWords = numberOfWords + words.length;
            }
        }
        System.out.println("There are " + numberOfWords + " words.");

        // Outputting to another file
        BufferedWriter writer = Files.newBufferedWriter(Paths.get("src/output.txt"));
        content = content + "\r\n\nThere are " + numberOfWords + " words.";
        writer.append(content);
        writer.close();
    }
}
