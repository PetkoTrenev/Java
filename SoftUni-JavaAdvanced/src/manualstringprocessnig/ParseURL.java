package manualstringprocessnig;

import java.util.Scanner;

/**
 * Created by Petko-PC on 4/17/2017.
 */
public class ParseURL {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.next().split("://");

        if (input.length != 2) {
            System.out.println("Invalid URL");
        }
        else{
            System.out.println(String.format("Protocol %s", input[0]));
            int index = input[1].indexOf("/");
            String server = String.format("Server %s", input[1].substring(0,index));
            String resources = String.format("Resources %s", input[1].substring(index, input[1].length()));
            System.out.println(server);
            System.out.println(resources);
        }

    }
}
