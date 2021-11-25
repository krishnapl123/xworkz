package strings;

public class StringBufferMethodsDemo {

	public static void main(String args[]) {
		
		StringBuffer strbuf=new StringBuffer("Bird");
		
		
		// joins the given string with existing string
		strbuf.append(" is Flyable");
		
		System.out.println(strbuf);
		
		System.out.println(strbuf.capacity());
		
		System.out.println(strbuf.length());
		
	         
	System.out.println(	strbuf.delete(0, 4));
	
	System.out.println(strbuf.insert(0, "Bird"));
	
	System.out.println(strbuf.reverse());
	

	System.out.println(strbuf.charAt(3));
	

   //  System.out.println(strbuf.setLength(25));
     

	System.out.println(strbuf.subSequence(0, 5));
	
	System.out.println(strbuf.substring(10, 15));
	
	
	}
	
}
