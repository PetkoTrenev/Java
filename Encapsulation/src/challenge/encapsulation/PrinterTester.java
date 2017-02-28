package challenge.encapsulation;

/**
 * Created by Petko-PC on 2/20/2017.
 */
public class PrinterTester {
    public static void main(String[] args) {
        Printer printer = new Printer(100, 0, false);
        printer.printPages();
        printer.printPages();
        printer.printPages();
        System.out.println("tonerLevel: " + printer.getTonerLevel());

        Printer printer2 = new Printer(10, 0, true);
        printer2.printPages();
        System.out.println("P2 :" + printer2.getTonerLevel());
        printer2.printPages();
        System.out.println("P2 :" + printer2.getTonerLevel());
    }
}
