package manualstringprocessnig;

import java.util.*;

/**
 * After that read N lines with students with their results in format
 {name} - {firstResult}, {secondResult}, {thirdResult}
 Print table on console. Each row must contain:
  JAdv - first result, align right with precision of 2
  OOP - second result, align right with precision of 2
  AdvOOP - third result, align right with precision of 2
  Average – average result with precision of 4
  Columns must be separated with &quot;|&quot;
  Don&#39;t forget heading row
 * Created by Petko-PC on 4/16/2017.
 */
public class StudentResults {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfStudent = Integer.parseInt(sc.nextLine());

        // For storing students
        TreeMap<String, List<Double>> results = new TreeMap<>();

        for (int i = 0; i < numberOfStudent; i++) {
            // Gather input in certain format
            String[] input = sc.nextLine().split(" - ");
            String[] examResultsString = input[1].split(", ");

            // Creating empty ArrayList
            List<Double> examResults = new ArrayList<>();
            double sum = 0;

            // populating the ArrayList
            for (String res : examResultsString) {
                double result = Double.parseDouble(res);
                sum += result;
                examResults.add(result);
            }
            // average
            examResults.add(sum / examResultsString.length);

            // populating the TreeMap
            results.put(input[0], examResults);
        }

        // Creating the formatted table
        System.out.println(String.format("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s",
                                         "Name", "JAdv", "JavaOOP", "AdvOOP", "Average"));
        for (Map.Entry<String, List<Double>> entry : results.entrySet()) {
            //System.out.println("%1$-10s|%2$.2f", entry.getKey(), entry.getValue());
        }
    }
}
