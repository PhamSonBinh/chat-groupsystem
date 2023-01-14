package psb.chat;

public class User {
	private String firstName;
	private String lastName;
	private String userId;
	private String userName;
	private String password;
	private String gender;
	private String dateOfBirth;

	public User(String firstName, String lastName, String userId, String userName, String password, String gender,
			String dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
