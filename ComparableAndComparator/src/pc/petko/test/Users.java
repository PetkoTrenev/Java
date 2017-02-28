package pc.petko.test;

// Comparable is an interface that is implemented by the class
// and I override the methods to do what I want
public class Users implements Comparable<Users>{
	private String username;
	private String password;
	
	public Users() {
		this("default_username", "default_password");
	}
	
	public Users(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// The actual useful sorting method
	// compares the instance variable with the one passed into the method
	@Override
	public int compareTo(Users username) {
		return this.password.compareTo(username.getPassword());
	}

	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + "]";
	}
	
	

}
