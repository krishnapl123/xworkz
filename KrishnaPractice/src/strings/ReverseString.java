package strings;

public class ReverseString {
	
	public static void main(String args[]) {
		
		String name="Welcome";
		String rev="";
		
		int leng=name.length();
		
		System.out.println(name);
		
		for(int i=leng-1;i>=0;i--) {
			
			rev=rev+name.charAt(i);
		
		}
		
		System.out.println(rev);
			
	}

}
