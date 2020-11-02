package marina1102w5d1assignment;

import java.util.ArrayList;

import marina1030w4d5assignment.Employee;
import marina1030w4d5assignment.HourlyEmployee;
import marina1030w4d5assignment.SalesEmployee;

public class Driver {


	public static void main(String[] args) {
//	create two objects of HourlyEmployee and two objects of SalesEmployee
		
				
		HourlyEmployee h1 = new HourlyEmployee("John", "Doh", "john@mail", 20121105, "111-111-111", 20, 30);
		HourlyEmployee h2 = new HourlyEmployee("Janne", "Li", "li@mail", 20180125, "222-222-222", 18, 40);
		
		SalesEmployee s1 = new SalesEmployee("Mike", "Smith", "mike@mail", 20121105, "111-111-111", 20, 100);
		SalesEmployee s2 = new SalesEmployee("Alice", "wander", "alice@mail", 20180125, "222-222-222", 40, 100);

				
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(h1);
		employeeList.add(h2);	
		
		employeeList.add(s1);
		employeeList.add(s2);
		
		for(int i =0; i < employeeList.size(); i++) {
			System.out.println(employeeList.get(i));
			
		}

	}

}
