package Basics;
import java.util.Scanner;
public class String_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String org = in.next().toString();
		
		int start = 0, end = org.length()-1, mid = end/2,count=0;
		
		for(;start<mid;start++) {
			
			if(org.charAt(start)==org.charAt(end)) {
				count++;
			}
			end--;
		}
		if(count==mid) {
			System.out.print("Palindrome String");
		}
		else {
			System.out.print("Not a Palindrome String");
		}
		}
// Okay
}


//if(org==val) {
//	
//}
//else{
//	
//}
//}
//public static String Reverse(String org) {
//
//String val="";
//for(int i=org.length()-1;i>=0;i--) {
//	val+=org.charAt(i);
//}
//
//
//
//return val;
//}