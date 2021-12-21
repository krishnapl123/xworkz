package collection_framework;

import java.util.*;

public class Tester {
	
	public static void main(String args[]) {
		
		Collection collection=new ArrayList();

		
		collection.add(new String("Xworkz"));
		collection.add(false);
		collection.add(12);
		collection.add(new Tester());
		collection.add("banglore");
		collection.add(12.0);
		collection.add("Mysore");
		
		int collectionSize=collection.size();
		System.out.println("Collection size is "+collectionSize);
		
		System.out.println(collection);
		
		System.out.println(collection.isEmpty());
		
	   if(collection.contains("banglore"))
	   {
		   System.out.println("Banglore is present");
	   }
	   else
	   {
		   System.out.println("Banglore is not present");
	   }
	   
	   collection.remove("Xworkz");
	   System.out.println(collection);
		
	   Collection collection2=new ArrayList();
	   
	   collection2.add("Shivamogga");
	   collection2.add("Mandya");
	   collection2.add("Manglore");
	   collection2.add("Hassan");
	   collection2.add("BTM");
	   
	   System.out.println(collection2);
	   
	   collection.addAll(collection2);
	   System.out.println(collection);
	   
	   boolean isPresentcollection2=collection.containsAll(collection2);
	   
	   if(isPresentcollection2)
	   {
		   System.out.println("collection2 is present");
	   }
	   else {
		   System.out.println("collection2 is not present");
	   }
	   
	  boolean isRetainsCollection= collection.retainAll(collection2);
	  
	  if(isRetainsCollection)
	  {
		  System.out.println("retains only collection2");
	  }
	  else
	  {
		  System.out.println("not retains collection2");
	  }
	  
	  System.out.println(collection);
	  
	  
	     collection.clear();
	  System.out.println(collection);
	  System.out.println(collection2);
	   	}

}
