

//Create HourlyEmployee class which is child class of Employee 
//including instance variables (payRate, hoursWorking) ,
//constructor, getters and setters and toString

//(you should add totalIncome to the toString too). 

//make sure payRate should be more than 0 
//and hoursWorking should be between 0 and 40. 
//Now in this class you should provide implementation of calculateIncome.

package marina1102w5d1assignment;

//Create HourlyEmployee class which is child class of Employee 
public class HourlyEmployee extends Employee {

	//including instance variables (payRate, hoursWorking) , 
	private double payRate;
	private int hoursWorking;
	
	public HourlyEmployee(String firstName, String lastName, String email, 
			int startDate, String phoneNumber, double payRate, int hoursWorking) {
		super(firstName, lastName, email, startDate, phoneNumber);
		setPayRate(payRate);
		setHoursWorking(hoursWorking);
	}
	

	
//	private ArrayList<Employee> Employees;
	
//	constructor
//	public void HourlyEmployee (double payRate, int hoursWorking) {
//		setPayRate(payRate);
//		setHoursWorking(hoursWorking);
		
//		this.Employees = new ArrayList <Employee>();
		
	
	
//	getters 
	public double getPayRate() {
		return payRate;
	}
	public int getHoursWorking() {
		return hoursWorking;
	}
	
	public double getCalculateIncome() {
		return payRate * hoursWorking;
	}

//	public ArrayList<Employee> getEmployee() {
//		return 
//	}
	
	
//	setters 
	//make sure payRate should be more than 0 
	public void setPayRate(double payRate) {
		if(payRate > 0) {
		this.payRate = payRate; 
		} else {
			this.payRate = 0; 
		}
	}
	//and hoursWorking should be between 0 and 40. 
	public void setHoursWorking(int hoursWorking) {
		if(hoursWorking > 0 && hoursWorking <= 40) {
		this.hoursWorking = hoursWorking;
		} else {
			this.hoursWorking = 0;
		}
	}
	
//	toString
	//Now in this class you should provide implementation of calculateIncome.
	
	
	@Override
	public String toString() {
		return "\nHourly Employee\n--------------------\n" + super.toString() + 
				"\nIncome: " + getCalculateIncome();
	}

}
