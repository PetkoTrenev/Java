package Chapter07;

public class Boat {
    private int length;

    public void setLength(int newLength){
        this.length = newLength;
    }

    public int getLength(){
        return this.length;
    }

    public void move(){
        System.out.println("Object \"+this.toString()+ \" which is from "+ this.getClass()+ " goes drift");
    }
}
