package collection_framework.collections_Problem_Statements;

import java.util.*;
import java.util.Collection;
import java.util.Scanner;


public class Main {
	
	public static void main(String args[]) {
		
		Collection<String> collection = new ArrayList<>();
			Scanner sc = new Scanner(System.in);
			int n = 1;
			String str = "";

			do {
				System.out.println("Enter the Username " +n++);
				collection.add(sc.next());
				System.out.println("Do you want to continue?(y/n)");
				str = sc.next();
			} while ("y".equals(str));
			
			System.out.println("The Names entered are");
			Iterator<String> itr = collection.iterator();
	     	while (itr.hasNext()) {
	
				String string =itr.next();
				System.out.println(string);
			}
		
		
	}
}