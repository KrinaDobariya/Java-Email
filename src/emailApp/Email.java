package emailApp;


import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 10;
	private String department;
	private String email;
	private int mailBoxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "xyzcompany.com";

//  Constructor to receive the first name and last name.
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Employee name: " + this.firstName);

//		Call a method asking for a department and "return department type".
		this.department = setDepartment();


//		Call a method that return random password.
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is:" + this.password);

//		combine elements to generate email.
		email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}

// Ask for the department.

	private String setDepartment() {
		System.out.print(
				"\nDepartment Codes:\n1 for Sales\n2 for Developement\n3 for Accounting\n0 for None\nEnter department code-");
		Scanner scanner = new Scanner(System.in);
		int deptChoice = scanner.nextInt();
		if (deptChoice == 1) {
			return "Sales";
		} else if (deptChoice == 2) {
			return "Development";
		} else if (deptChoice == 3) {
			return "Accounting";
		} else {
			return " ";
		}

	}

//	Generate random password.

	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());

			password[i] = passwordSet.charAt(rand);
		}
		// new String is used to convert char array into string literals.
		return new String(password);
	}

// Set the mailbox capacity

	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
//	Set alternate email.

	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

//	Change the password.

	public void changePassword(String password) {
		this.password = password;
	}

//Get methods
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}

//	Display whole information.

	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email + "\nMAILBOX CAPACITY: " + mailBoxCapacity + "mb";
	}
}
