package collection_framework.treeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SoftwareDemo {
	
	public static void main(String args[]) {
		
		
		List<SoftwareDTO> list=new ArrayList<SoftwareDTO>();
		
		SoftwareDTO software1=new SoftwareDTO(2,"faceBook",400,1.1,false,true);
		SoftwareDTO software2=new SoftwareDTO(1,"amazon",200,1.2,false,true);
		SoftwareDTO software3=new SoftwareDTO(3,"gpay",300,1.3,true,false);
		SoftwareDTO software4=new SoftwareDTO(4,"paytm",100,1.4,true,false);
		
		list.add(software4);
		list.add(software3);
		list.add(software2);
		list.add(software1);
		
		
//	Collections.sort(list,new SoftwarePriceComparator());
	
  //  Collections.sort(list,new SoftwareIDComparator() );
//		
//	Collections.sort(list,new SoftwarePriceComparator());
//		Collections.sort(list,new SoftwarePriceComparator());
  //   	Collections.sort(list,new SoftwareVersionComparator());	
		
	//	Collections.sort(list,new SoftwareAutoSaveSupportedComprator());
		

		
	Collections.sort(list,new SoftwareDTOCompareList(
				
				new SoftwareNameComparator(),             
				new SoftwareIDComparator(),
				new SoftwarePriceComparator(),
		    	new SoftwareVersionComparator(),
			    new SoftwareAutoSaveSupportedComprator(),
				new SoftwareInternetAppComparator()
			));

	    
     	for(SoftwareDTO softwareDTO:list) {
		
		System.out.println(softwareDTO);
	}
		
	} 

}
