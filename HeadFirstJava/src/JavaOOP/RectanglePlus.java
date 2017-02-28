package JavaOOP;

public class RectanglePlus implements Relatable {
    public int height = 0;
    public int width = 0;
    public Point origin;

    // Declaring four Constructors

    public RectanglePlus(){
        origin = new Point(0,0);
    }
    public RectanglePlus(Point p){
        origin = p;
    }
    public RectanglePlus(int w, int h){
        origin = new Point(0,0);
        int width = w;
        int height = h;
    }
    public RectanglePlus(Point p, int w, int h){
        origin = p;
        width = w;
        height = h;
    }

    // A method for moving the rectangle

    public void move (int x, int y){
        origin.x = x;
        origin.y = y;
    }

    // a method for computing
    // the area of the rectangle
    public int getArea(){
        return width*height;
    }

    // a method required to implement
    // the Relatable interface

    public int isLargerThan(Relatable other){
        RectanglePlus otherRect = (RectanglePlus)other;
        if (this.getArea() < otherRect.getArea()){
            return -1;
        }
        else if (this.getArea() > otherRect.getArea()){
            return 1;
        }
        else {
            return 0;
        }

    }
}
