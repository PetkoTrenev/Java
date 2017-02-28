package pc.petko.app.clients;

import pc.petko.app.dao.EmployeeDAO;
import pc.petko.app.domain.Employee;
import pc.petko.app.report.EmployeeReportFormatter;
import pc.petko.app.report.FormatType;

public class ClientModule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create Employee object
		Employee gosho = new Employee(1, "Gosho", "accounting", true);
		ClientModule.hireNewEmployee(gosho);
		ClientModule.terminateEmployee(gosho);
		printEmployeeReport(gosho, FormatType.XML);
	}
	
	public static void hireNewEmployee(Employee employee) {
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.saveEmployee(employee); 
	}
	
	public static void terminateEmployee(Employee employee) {
		EmployeeDAO employeeDao = new EmployeeDAO();
		employeeDao.deleteEmployee(employee);
	}
	
	public static void printEmployeeReport(Employee employee, FormatType formatType) {
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
		System.out.println(formatter.getFormattedEmployee());
	}
}
