package Basics;

import java.util.Scanner;
public class StringBasics1 {

		public static void main(String ar[]) {
//			System.out.println("HEllo World");
			String val = "Hello World \n";
//			System.out.print(val);
			
			Scanner in = new Scanner(System.in);
//			char value[] = {'S','J'}; 
//			System.out.print(value);
//			
//			System.out.print("\nSize : "+val.length());
//			
//			System.out.print("\nCharAt : "+val.charAt(6));
//		
			
			
//			String Methods or Functions in Strings
			
			String str = "Saketh Phaneendra Hema";
			System.out.println(str);
			String v1="Hema";
			String v2 = "JayaSree";
			String fullName = str+" Kondisetti";
			System.out.println(fullName);
			System.out.println(v1.compareTo("Waste"));
			
			
//		SubString
			System.out.print(str.substring(18));
			
//			Input
			System.out.println("Enter Name : ");
			String name = in.nextLine();
			System.out.println("Hello " +name);
			

		}
}
