package strings;

public class NumberOfWordsIngivenString {
	
	public static void main(String args[]) {
		
		String str="Welcome to Xworkx Institute in Banglore";
		
		int count=0;
		
		String[] split=str.split(" ");
		
		for(int i=0;i<split.length;i++) {
			
			System.out.print(split[i]+" ");
			
			count++;
			
			
		}
		
		System.out.println();
		
		System.out.println("Number of words in given string is: " +count);
	}

}
