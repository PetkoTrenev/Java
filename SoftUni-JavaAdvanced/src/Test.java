import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Petko-PC on 4/18/2017.
 */
public class Test {
    public static void main(String[] args)
        {

            Scanner scan = new Scanner(System.in);
            String s=scan.nextLine();
            StringTokenizer st=new StringTokenizer(s," !,?._'@");
            System.out.println(st.countTokens());
            while(st.hasMoreTokens()){
                System.out.println(st.nextToken());
             }


    }
}