package strings;

import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String args[]) {
		
		
		
	//	System.out.println("enter the string");
		
	//	Scanner name=new Scanner(System.in);
		
		String name="madam";
		String rev="";
		
		int leng=name.length();
		
		System.out.println(name);
		
		for(int i=leng-1;i>=0;i--) {
			
			rev=rev+name.charAt(i);
		
		}
		
		System.out.println(rev);
		
		if(name.equals(rev)) {
			
			System.out.println("Given String is palindrome ");
		}
		
		else {
			
			System.out.println("Gine string is not palindrome");
	}

	}
}
