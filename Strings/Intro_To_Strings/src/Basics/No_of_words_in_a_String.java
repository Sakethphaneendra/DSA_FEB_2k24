package Basics;
import java.util.Scanner;
public class No_of_words_in_a_String {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String str = in.nextLine();
		
		CountWords(str);
	}
	
	 static void CountWords(String str) {
		 
		 int count =1;
		 for(int i=0;i<str.length();i++) {
			 
			 if(str.charAt(i)==' ') {
				 if(str.charAt(i+1)==' ') {
					 
				 }
				 else {
					 count+=1;
				 } 
				
			 }
		 }
		
		 System.out.println("The Number of Words in the String are : "+count);
	}
	

}
