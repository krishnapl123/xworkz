package strings;

import java.util.Scanner;

public class ReverseDemo {

	
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num=scan.nextInt();
		
		int reverse=0;
		int remainder;
		
		while(num!=0)
		{
			remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
		}
		
		System.out.println(reverse);
	}
}
