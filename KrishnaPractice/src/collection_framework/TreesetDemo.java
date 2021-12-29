package collection_framework;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreesetDemo {
	
	public static void main(String args[]) {
		
	SortedSet<Employee> treeset=new TreeSet<>();
	
	Employee adarsha=new Employee(1,"Adarsha");
	Employee darshan =new Employee(1,"Darshan");
	Employee rohith=new Employee(1,"Rohith");
	Employee akeef=new Employee(1,"Akeef");
	
	treeset.add(akeef);
	treeset.add(rohith);
	treeset.add(darshan);
	treeset.add(adarsha);
	
	System.out.println(treeset);
	
	
	
	}

}
