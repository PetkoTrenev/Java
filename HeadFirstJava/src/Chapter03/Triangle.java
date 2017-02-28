package Chapter03;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Petko on 5.4.2016 г..
 */
public class Triangle {
    double area;
    int height;
    int lenght;

    public static void main(String[] args) {
        Triangle[] ta = new Triangle[4];

        int x = 0;
        while ( x < 4 ) {
            ta[x] = new Triangle();
            ta[x].height = (x + 1) * 2;    // 2
            ta[x].lenght =  x + 4;         // 4
            ta[x].setArea();
            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);
            x++;
        }

        int y = x;
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);
    }

    void setArea(){
        area = (height * lenght) / 2;
    }
}
