package Module6;

import java.io.*;
import java.util.Scanner;

public class IO2 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter input file: ");
		String filename = scan.nextLine();
		File file = new File("C:\\Users\\Vaibhav\\Desktop\\"+filename);
		System.out.println("Enter output file: ");
		String output = scan.nextLine();
		File fileout = new File("C:\\Users\\Vaibhav\\Desktop\\"+output);
		FileInputStream fis = new FileInputStream(file); 
        FileOutputStream fos = new FileOutputStream(fileout); 
  
        int b; 
        while  ((b=fis.read()) != -1) 
            fos.write(b);
        
        System.out.println("File is copied");
        fis.close();
        fos.close();
        scan.close();
	}

}
