package pc.petko.app.report;

// Set's standards
public class ReportFormatter {
	
	String formattedOutput;
	
	public ReportFormatter(Object obj, FormatType formatType) {
		switch (formatType) {
		case XML:
			formattedOutput = convertToXML(obj);
			break;
		case CSV:
			formattedOutput = convertToCSV(obj);
			break;
		}
	}
	
	// Can be any object because any type extends Object class!!!
	
	private String convertToXML(Object obj) {
		return "XML : <title>" + obj.toString() + "</title>";		
	}
	
	private String convertToCSV(Object obj) {
		return "CSV : ,,,," + obj.toString() + ",,,,";  // comma separated values (CSV)
	}
	
	protected String getFormattedValue() {
		return formattedOutput;
	}
}
