package Basics;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		System.out.println("Orginal  : "+str);
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		System.out.println("Reversed : "+rev);
		
	}
}
