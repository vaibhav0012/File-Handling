package Module6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class OS1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner scan = new Scanner(System.in); 
	    Employee emp = new Employee();
	    Date date = new Date();
	    SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
	    System.out.println("Enter name: ");
	    emp.setName(scan.next());
	    System.out.println("Enter Date of Birth: ");
	    String DOB = scan.next();
	    try {
			date = ft.parse(DOB);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    emp.setDateOfBirth(date);
	    System.out.println("Enter Department: ");
	    emp.setDepartment(scan.next());
	    System.out.println("Enter Designation: ");
	    emp.setDesignation(scan.next());
	    System.out.println("Enter salary: ");
	    emp.setSalary(scan.nextDouble());
	    
	    FileOutputStream fos = new FileOutputStream("C:\\Users\\Vaibhav\\Desktop\\Data.txt");
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(emp);
	    FileInputStream fis = new FileInputStream("C:\\Users\\Vaibhav\\Desktop\\Data.txt");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    
		Employee emp2 = (Employee) ois.readObject();
		System.out.println("Name: " + emp2.getName());
		System.out.println("D.O.B.: " + emp2.getDateOfBirth());
		System.out.println("Department: " + emp2.getDepartment());
		System.out.println("Designation: " + emp2.getDesignation());
		System.out.println("Salary: " + emp2.getSalary());
		
		fos.close();
		oos.close();
		fis.close();
		ois.close();
		scan.close();

	}

}
