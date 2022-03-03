package users;

public class User {
	private String username;
	private String password;
	
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setUsername(String newUsername) {
		this.username = newUsername;
	}
	
	public void setPassword(String newPassword) {
		this.password = newPassword;
	}
	
	public User() {
	}
	
	public User(String newUsername, String newPassword) {
		this.username = newUsername;
		this.password = newPassword;
	}
}
