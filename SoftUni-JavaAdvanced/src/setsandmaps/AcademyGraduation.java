package setsandmaps;

import java.util.*;

/**
 * Created by Petko-PC on 4/13/2017.
 */
public class AcademyGraduation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(sc.nextLine());
        TreeMap<String, ArrayList<Double>> graduationList = new TreeMap<>();
        //int averageEach = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            String nameOfStudent = sc.nextLine();
            ArrayList<Double> scores = new ArrayList<>();
            String[] input = sc.nextLine().split(" ");
            for (int j = 0; j < input.length; j++){
                scores.add(Double.parseDouble(input[j]));
                //averageEach += score;
            }

            graduationList.put(nameOfStudent, scores);

        }


        for (Map.Entry<String, ArrayList<Double>> entry : graduationList.entrySet()) {
            double sum = 0;
            int counter = 0;

            // fill the list with the values form the entries
            List<Double> values = entry.getValue();
            for (double value : values) {
                sum += value;
            }

            double average = sum / values.size();

            System.out.println(entry.getKey() + " graduated with " + average);
        }

    }


}
