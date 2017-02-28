package pc.petko.app.report;

import pc.petko.app.domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter{
	
	private Employee anEmployee;
	
	public EmployeeReportFormatter(Employee employee, FormatType formatType) {
		super(employee, formatType);
	}

	public String getFormattedEmployee() {
		return getFormattedValue();
	}
}
