package JavaSyntax.JavaSyntaxHW;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        System.out.print("Enter width: ");
        double width = input.nextDouble();
        double area = height * width;
        System.out.println("The Area is: " + area); //calculateRectangleArea(20,7));
    }

   // static double calculateRectangleArea(double width, double height){
        //return height * width;
    //}
}
