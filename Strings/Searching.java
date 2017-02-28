package Examples.Strings;

/**
 * Created by Petko on 15.3.2016 г..
 */
public class Searching {
    public static void main(String[] args) {
        String searchMe = "Green Eggs and Ham";
        String findMe = "Eggs";
        int searchMeLength = searchMe.length();
        int findMeLength = findMe.length();
        boolean foundIt = false;
        for (int i = 0; i < (searchMeLength-findMeLength); i++) {
            if (searchMe.regionMatches(i,findMe,0,findMeLength)){
                foundIt = true;
                System.out.println(searchMe.substring(i,i+findMeLength));
                break;
            }
            if(!foundIt){
                System.out.println("No match found");
            }
        }
    }
}
