package setsandmaps;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Write program that:
 * Record car number for every car that enter in parking lot
 * Remove car number when the car go out
 * Input will be string in format [direction, carNumber]
 * input end with string "END";
 * Print the output with all car numbers which are in parking lot
 * Created by Petko-PC on 4/13/2017.
 */
public class ParkingLot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // stores the cars in the parking
        HashSet<String> parking = new HashSet<>();

        while (true) {
            String input = sc.nextLine();
            String[] tokens = input.split(", ");

            if (input.equals("END")) {
                break;
            }

            if (tokens[0].equals("IN")){
                // add to the parking lot
                parking.add(tokens[1]);
            }
            else {
                // remove from parking lot
                parking.remove(tokens[1]);
            }

        }

        if (parking.isEmpty()) {
            System.out.println("Parking lot is empty");
        } else {
            for (String s : parking) {
                System.out.println(s);
            }
        }


    }


}
