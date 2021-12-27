package collection_framework.collections_Problem_Statements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class ItemTypeMain {
	
	public static void main(String args[]) {
		
		Collection<ItemType> collection=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		Scanner scInt=new Scanner(System.in);
		int n=1;
		String str="";
		
		do {
			
			System.out.println("Enter the details of Type "+n++);
			System.out.println("Name:");
			String name=sc.next();
			System.out.println("Deposit:");
			double deposit=scInt.nextInt();
			System.out.println("CostPerDay:");
			double CostperDay=scInt.nextInt();
			System.out.println("Do you wnat to continue?y/n");
		        str=sc.next();
			
		}while("y".equals(str));
		
		Iterator<ItemType> itr=collection.iterator();
		System.out.printf("%-20s%-20s%-20s%\n", "name", "deposit", "costperDay");
		System.out.println();
		
		while(itr.hasNext()) {
			ItemType itemType=itr.next();
			System.out.println(itemType);
		}
		
		
		
	}

}
