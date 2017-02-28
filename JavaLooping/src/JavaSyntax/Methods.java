package JavaSyntax;

/**
 * Created by Petko on 27.3.2016 г..
 */
public class Methods {
    public static void main(String[] args) {
        System.out.println("Razni raboti");
        printGreeting("Gosho", 18);
        printGreeting("Petko", 21);
    }

    static void printGreeting(String name, int age){
        System.out.println("Hello " + name + "!");
        if (age >= 18){
            System.out.println("Here is a beer");
        } else {
            System.out.println("Sorry kid, here is a lollipop");
    }
  }
}
