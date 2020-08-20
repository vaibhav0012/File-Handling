package Module6;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Employee implements Serializable
{
	private String name;
	private Date dateOfBirth;
	private String department;
	private String designation;
	private double Salary;
	
	Employee()
	{
		
	}
	Employee(String name, Date dateOfBirth, String department, String designation, double Salary)
	{
		this.name=name;
		this.dateOfBirth=dateOfBirth;
		this.department=department;
		this.designation=designation;
		this.Salary=Salary;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
