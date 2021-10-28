package blocks;

public class SIBTest {
	
	static String name;
     static String color;
     static int age;
     
     SIBTest(){
    	 
    	name="ostrich";
    	color="brown";
    	age=3;
    	System.out.println("constructor called");
     }
         
           {
        	   name="peacock";
        	   color="green";
        	   age=1;
        	   System.out.println("IIB called");
        	   
           }
           
           
           static {
        	   name="parrot";
        	   color="red";
        	   age=2;
        	   System.out.println("SIB called");
        	   
           }

}
