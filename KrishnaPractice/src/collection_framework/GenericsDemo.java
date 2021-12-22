package collection_framework;

import java.util.ArrayList;

import java.util.*;

public class GenericsDemo {
	public static void main(String args[]) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Rajkumar");
		list.add("PunithRajkumr");
		//list.add(10); //compile time error,type mismatch
		
		String s=list.get(1);
		System.out.println("1st element:" +s);
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
