package strings;

public class StringClassMethods {
	
	public static void main(String args[]) {
		
		String name="KRishna";
		
		//lenght of string
		System.out.println(name.length());
		
		// convert into lowercase
		String lower=name.toLowerCase();
		System.out.println(lower);
		
		// convert into uppercase
		String upper=name.toUpperCase();
		System.out.println(upper);
		
		
		//joins the given string with old refernced string
		String concat=name.concat(" Student");
		
		System.out.println("Concatenated tring");
		System.out.println(concat);
		
		
		
		//gives the character at the given position
		System.out.println(concat.charAt(8));
		
		//checks foe whether the string contains given string or not
		System.out.println(concat.contains("dent"));
		
		
		//checks for whether string ends with the given character or not
		  System.out.println(concat.endsWith("t"));
		  System.out.println(name.endsWith("a"));
		  
		   
		  //returns postion of given string
		 System.out.println(concat.indexOf("t")); 
		  
		 
		 System.out.println("krishna".isEmpty());
		 
		 
		 
		 // give index value of given character
		System.out.println( name.lastIndexOf("a"));
		
         //replace the old character with given character
		String replace=name.replace("K", "R");
		
		System.out.println(replace);
		
       System.out.println(name);
       
       
       // split the strings if they have space between them
      String[] split=concat.split(" ");
      
               for(int i=0;i<2;i++) {
            	   
            	   System.out.println(split[i]);
               }
               
               
               //convet the given string interms of array of character
             char[] namearray=name.toCharArray(); 

             
             for(int j=0;j<namearray.length;j++) {
            	 
            	 System.out.print(namearray[j] +" ");
            	 
            	
             }

             
             //checks whether the string starts with given character or not
           System.out.println(concat.startsWith("K"));
           
           
           //returns the string starts with given index vale
           System.out.println(name.substring(3));
           
           
           // erase the beginning  and ending spaces
           System.out.println(" Banglore City     ".trim());
           
           
        
           
           
	}
	

}
