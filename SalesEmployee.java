

//Create SalesEmployee class which is child class of Employee 
//including instance variables (commitionRate, totalSales), 
//constructor, getters and setters and toString 

//(you should add totalIncome to the toString too). 

//make sure both instance variables should be more than zero. 
//Now in this class you should provide implementation of calculateIncome.


package marina1102w5d1assignment;
//Create SalesEmployee class which is child class of Employee 
public class SalesEmployee extends Employee {
	//including instance variables (commitionRate, totalSales), 
	private double commissionRate;
	private double totalSales;
	//private double calculateIncome;
	
	public SalesEmployee(String firstName, String lastName, String email, 
			int startDate, String phoneNumber, double commissionRate, double totalSales) {
		super(firstName, lastName, email, startDate, phoneNumber);
		setCommissionRate(commissionRate);
		setTotalSales(totalSales);
	}


	
	//	public void Employee (double commissionRate, double totalSales) {
	//		setCommissionRate(commissionRate);
	//		setTotalSales(totalSales);
	//	}
	//	
//	getters
	public double getCommissionRate() {
		return commissionRate;
	}
	public double getTotalSales() {
		return totalSales;
	}


	public double getCalculateIncome() {
		return commissionRate * totalSales; 
	}
	
//	setters
	//make sure both instance variables should be more than zero. 
	public void setCommissionRate (double commissionRate) {
		if(commissionRate > 0) {
		this.commissionRate = commissionRate;
		} else {
			this.commissionRate = 0;	
		}
	}	
	public void setTotalSales(double totalSales) {
		if(totalSales > 0) {
			this.totalSales = totalSales;
		} else {
			this.totalSales = 0;
		}
	}
	
	//public void setCalculateIncome(double calculateIncome) 
	//	if(calculateIncome > 0) {
	//		this.calculateIncome = calculateIncome;
	//	} else {
	//			this.calculateIncome = 0;
	//	}
	//}
	//	

	
//	toString 
//(you should add totalIncome to the toString too). 
//Now in this class you should provide implementation of calculateIncome.
	




	@Override
	public String toString() {
		return "\nSales Employee\n--------------------\n" + super.toString() + 
				"\nIncome: " + getCalculateIncome();
	}
}
