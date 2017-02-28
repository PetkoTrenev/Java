package JavaSyntax.JavaSyntaxHW;

import java.util.Scanner;

public class CalculatingTriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aX = input.nextInt();
        int aY = input.nextInt();
        int bX = input.nextInt();
        int bY = input.nextInt();
        int cX = input.nextInt();
        int cY = input.nextInt();

        int area = Math.abs(aX*(bY-cY) + bX*(cY-aY) + cX*(aY-bY))/2;
        System.out.println(area);
        isTriangle(aX,aY,bX,bY,cX,cY);

    }

    public static boolean isTriangle (int aX, int bX, int aY, int bY, int cX, int cY){
        if(Math.abs((aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2) != 0){
            System.out.printf("It is a triangle");
            return true;
        } else {
            return false;
        }
    }

}