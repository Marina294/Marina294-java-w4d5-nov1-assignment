package marina1102w5d1assignment;

public class Employee {
//instanse valiable
private String firstName;
private String lastName;	
private String email;
private int startDate;
private String phoneNumber;

   //constractor
public Employee(String firstName, String lastName, String email, int startDate, String phoneNumber) {
	setFirstName(firstName);
	setLastName(lastName);
	setEmail(email);
	setStartDate(startDate);
	setPhoneNumber(phoneNumber);
	
}

//getter 
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public String getEmail() {
	return email;
}
public int getStartDate() {
	return startDate;
}
public String getPhoneNumber() {
	return phoneNumber;
}

//setter give a value and null
public void setFirstName(String firstName) {
	if(!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
		this.firstName = firstName;	
	}
}
public void setLastName(String lastName) {
	if(!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
	this.lastName = lastName;
	}
}
public void setEmail(String email) {
	if(!email.isEmpty() && !email.equalsIgnoreCase(null)) {
	this.email = email;
	}
}
public void setStartDate(int startDate) {
	if (startDate > 0) {
	this.startDate = startDate; 
	} else {
		this.startDate = 0;
	}
}	
public void setPhoneNumber(String phoneNumber) {
	if(!phoneNumber.isEmpty() && !phoneNumber.equalsIgnoreCase(null)) {
	this.phoneNumber = phoneNumber;			
	}
}	

//In this class we need another method called calculateIncome which the body of this method depends on child classes. 
////so we need only the header of the method.
// public abstract double getCalculateIncome();

//toString
@Override
public String toString() {
	return String.format("Name: %s %s \nemail: %s \nStart date: %d \nPhone number %s",
			firstName, lastName, email, startDate, phoneNumber);
}

}
