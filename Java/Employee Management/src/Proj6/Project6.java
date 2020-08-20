package Proj6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Project6 {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		int num;
		String empID;
		String empName;
		int age;
		double salary;
		Scanner scan = new Scanner(System.in);
		Employee employee =null;				
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Vaibhav\\Desktop\\EmployeeData.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		FileInputStream fis = new FileInputStream("C:\\Users\\Vaibhav\\Desktop\\EmployeeData.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		do
		{
			System.out.println("Main menu");
			System.out.println("1. Add an Employee");
			System.out.println("2. Display All");
			System.out.println("3. Exit");
			num = scan.nextInt();
			switch(num)
			{
			case 1:
				System.out.println("Enter Employee ID: ");
				empID=scan.next();
				System.out.println("Enter Employee Name: ");
				empName=scan.next();
				System.out.println("Enter Employee age: ");
				age=scan.nextInt();
				System.out.println("Enter Employee salary: ");
				salary=scan.nextDouble();
				employee= new Employee(empID,empName,age,salary);
				oos.writeObject(employee);
				break;
			case 2:
				System.out.println("----Report-----");
				employee = null;
				while (fis.available() > 0) {
					employee = (Employee) ois.readObject();
					System.out.println(employee);
				}
				System.out.println("----End of Report-----");
				break;
			case 3:
				System.out.println("Exiting the system.");
				System.exit(0);
			}
		}
		while(num!=3);
		fos.close();
		oos.close();
		fis.close();
		ois.close();
		scan.close();
	}

}
