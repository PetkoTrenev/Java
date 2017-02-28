package pc.petko.app.database;

// Purpose: connection object to interact with DB
public class DatabaseConnectionManager {
	private Connection conn;
	
	private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();
	
	private DatabaseConnectionManager() {
		
	}
	
	public static DatabaseConnectionManager getManagerInstance() {
		return connectionInstance;
	}
	
	/*
	 * contains connection details
	 * 
	 * @throws SQLException		
	 */
	
	public void connect() throws SQLException {
		// processing specific database connection details..
		conn = DriverManager.getConnection("Some/Database/URL");
		System.out.println("Established Database Connection");
	}
	
	public Connection getConnectionObject() {
		return conn;
	}
}
