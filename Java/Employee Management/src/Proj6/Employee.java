package Proj6;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Employee implements Serializable {

	private String EmployeeID;
	private String EmployeeName;
	private int age;
	private double Salary;
	
	Employee()
	{
		
	}
	@Override
	public String toString() {
		return EmployeeID + " "+ EmployeeName + " " + age + " "+ Salary;
	}
	Employee(String EmployeeID, String EmployeeName, int age, double Salary)
	{
		this.EmployeeID=EmployeeID;
		this.EmployeeName=EmployeeName;
		this.age=age;
		this.Salary=Salary;
	}

}
