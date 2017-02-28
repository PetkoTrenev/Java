package solution;

/**
 * Created by Petko-PC on 2/21/2017.
 */
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            // validation
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
        // Every new printer has 0 pages printed
        this.pagesPrinted = 0;
    }

    public int addToner(int amount) {
        if (amount > 0 && amount <= 100) {
            // validation for more than 100percent full
            if (this.tonerLevel + amount > 100) {
                return -1;
            }
            this.tonerLevel += amount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.isDuplex) {
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode.");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }
}
