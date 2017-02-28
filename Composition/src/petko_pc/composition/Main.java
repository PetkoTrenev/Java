package petko_pc.composition;

public class Main {

	public static void main(String[] args) {
		
		// Testing the composition
		
		// First getting the case for my PC
		Dimension newDimension = new Dimension(800,600,200);
		Case theCase = new Case("BJ-400", "Intel", 240, newDimension);
		Monitor theMonitor = new Monitor("BNQ", "INTEL", 20, new Resolution(1400, 1200));
		Motherboard motherboard = new Motherboard("Intel", "microsoft", 4, 4, "BIOS");
		
		PC pc = new PC(theCase, theMonitor, motherboard);
		System.out.println(pc.getTheCase().getDimensions().getHeight());
	}

}
