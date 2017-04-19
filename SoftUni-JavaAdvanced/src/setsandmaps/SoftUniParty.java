package setsandmaps;

import java.util.*;

/**
 * There is a party in SoftUni. Many guests are invited and they are two type VIP and regular. When guest come
 * check if he/she exist in any of two reservation lists
 * All reservation numbers will be with 8 chars
 * All VIP numbers start with digit
 * There will be 2 command lines. First is "PARTY" - party is on and guests start coming. Second is "END" – then
 * party is over and no more guest will come
 * Output have to all guest, who didnt come to the party (VIP must be first)
 */

public class SoftUniParty {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
        // FASTER
        HashSet<String> regulars = new HashSet<>();

        // Slower but ordered 0-9 A-Z
        TreeSet<String> vips = new TreeSet<>();

        while (true) {
            String input = sc.nextLine();
            // fill the list until the party starts
            if (input.equals("PARTY")) {
                break;
            }

            if (numbers.contains(input.charAt(0))) {
                vips.add(input);
            } else {
                regulars.add(input);
            }
        }

        while (true) {
            String guestCome = sc.nextLine();
            if(guestCome.equals("END")){
                break;
            }
            if (numbers.contains(guestCome.charAt(0))) {
                vips.remove(guestCome);
            } else {
                regulars.remove(guestCome);
            }
        }

        // add the remaining regulars to the vips, properly ordered
        vips.addAll(regulars);
        System.out.println(vips.size());
        // printing the resulting set
        for (String guest : vips) {
            System.out.println(guest);
        }

    }
}
