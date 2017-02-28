package pc.petko.app.dao;

import pc.petko.app.domain.Employee;

// Purpose: carry out data specific operations on employees
// data access object -> 
// used for data deletion, data storage, data retrieval
public class EmployeeDAO  {
	
	public void saveEmployee(Employee anEmployee) {
		// to save an Employee first we should establish connection with DB
		/*DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();  // returns an object of type DCM
		connectionManager.connect(); // connect to the DB
		connectionManager.getConnectionObject().prepareStatement("insert into Employee_tbl");
		connectionManager.disconnect();
		*/
		// used to send commands to DB, has a lot of built in functionality
		System.out.println("Saved employee to DB \n" + anEmployee);
		
	}
	
	public void deleteEmployee(Employee anEmployee) {
		System.out.println("Deleted employee to DB \n" + anEmployee);
	}
}
