package Example03.CharacterStreams;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
            URL url = new URL("http://www.gutenberg.org/cache/epub/51482/pg51482.txt");
        try (
                BufferedReader bfr = new BufferedReader(
                        new InputStreamReader(
                                url.openStream()));

                BufferedWriter bwr = new BufferedWriter(
                        new FileWriter("res/character_streams/pg.txt"));
                ) {
                    String line;
                    while ((line = bfr.readLine()) != null){
                    System.out.println(line);
                    bwr.write(line);
                    bwr.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
