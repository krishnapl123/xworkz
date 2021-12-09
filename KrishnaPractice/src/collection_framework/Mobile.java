package collection_framework;

import java.util.*;

public class Mobile {
	
	public static void main(String args[]) {
		
		MobileDetails mobiledetails=new MobileDetails();
		MobileDetails mobiledetails1=new MobileDetails();
		
		
		mobiledetails.setMobileName("Nokia");
		mobiledetails.setPrice(20000.00);
		mobiledetails.setRam(4);
		mobiledetails.setRom(28);
		
		mobiledetails1.setMobileName("Samsung");
		mobiledetails1.setPrice(30000.00);
		mobiledetails1.setRam(5);
		mobiledetails1.setRom(30);
		
		
		
		System.out.println("Nokia Mobile details");
		System.out.println("name:"+mobiledetails.getMobileName());
		System.out.println("price:" +mobiledetails.getPrice());
		
		System.out.println("ram:" +mobiledetails.getRam());
		System.out.println("rom:"+mobiledetails.getRom());
		
		
		
		System.out.println("Samsung Mobile details");
		System.out.println("name:"+mobiledetails1.getMobileName());
        System.out.println("price:" +mobiledetails1.getPrice());
		
		System.out.println("ram:" +mobiledetails1.getRam());
		System.out.println("rom:"+mobiledetails1.getRom());
		
		Collection collection=new ArrayList();
		
		
	
	      
	
	
	
				
	}
	 

}
