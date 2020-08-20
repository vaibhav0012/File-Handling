package Module6;

import java.io.*;
import java.util.Scanner;

public class IO1 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter File name: ");
		String filename = scan.nextLine();
		System.out.println("Enter required character");
		String str = scan.nextLine();
		char ch = str.charAt(0);
		int count=0;
		File file = new File("C:\\Users\\Vaibhav\\Desktop\\"+filename+".txt");
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st; 
		  while ((st = br.readLine()) != null) 
		  {
			  for(int i=0;i<st.length();i++) 
			  {
				  if(Character.toUpperCase(st.charAt(i))==Character.toUpperCase(ch))
				  {
					  count++;
				  }
			  }
		  }
		    System.out.println("File '"+filename+".txt' has "+count+" instances of letter '"+ch+"'."); 
		    scan.close();
		
	}

}
