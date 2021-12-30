package collection_framework;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreesetDemo {
	
	public static void main(String args[]) {
		
	SortedSet<Employee> treeset=new TreeSet<Employee>();
	
	Employee adarsha=new Employee(1,"Adarsha",50000.00,"BEL","Banglore");
	Employee darshan =new Employee(2,"Darshan",60000.00,"hp","Mumbai");
	Employee rohith=new Employee(3,"Rohith",70000.00,"Dell","Noida");
	Employee akeef=new Employee(4,"Akeef",80000.00,"HCL","Chennai");
	
	treeset.add(akeef);
	treeset.add(rohith);
	treeset.add(darshan);
	treeset.add(adarsha);
	
	System.out.println(treeset);
	
	
	
	}

}
