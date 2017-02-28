package challenge.encapsulation;

public class Printer {

    private int tonerLevel;
    private int printedPages;
    private boolean isDuplex;

    public Printer(int tonerLevel, int printedPages, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        this.printedPages = printedPages;
        this.isDuplex = isDuplex;
    }

    public void printPages() {
        if (tonerLevel < 15) {
            refillToner();
        } else {
            if (isDuplex) {
                tonerLevel -= 20;
                System.out.println("Printing double the pages " + (this.printedPages + 2));
            } else {
                tonerLevel -= 10;
                System.out.println("Printing a page " + this.printedPages++);
            }
        }
    }

    public void refillToner(){
        System.out.println("Refill in process..");
        this.tonerLevel = 100;
    }

    public int getTonerLevel() {
        return this.tonerLevel;
    }
}
