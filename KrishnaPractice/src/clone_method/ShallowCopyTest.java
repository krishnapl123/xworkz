package clone_method;

public class ShallowCopyTest {
public static void main(String args[]) throws CloneNotSupportedException {
	
	Mobile mobile=new Mobile();
	
	Mobile copiedmobile= (Mobile) mobile.clone();
	
	System.out.println("Mobile object-------");
	mobile.brand="MOTO";
	System.out.println("moblie brand:"+mobile.brand);//Honor
	
        mobile.sim.serviceProvider="Vodafone";
	System.out.println("mobile Sim:"+mobile.sim.serviceProvider);
	
	System.out.println("Copied Mobile object-------");
	
	System.out.println("moblie brand:"+copiedmobile.brand);//sony
	System.out.println("mobile Sim:"+copiedmobile.sim.serviceProvider);
	
}
}
