package patterns;

public class PlusPattern {
	
	public static void main(String args[]) {
		
		int i,j,row=5	;
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=row;j++) {
				if(i==(row/2)+1||j==(row/2)+1) {
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			
				
				System.out.println();
				
			}
		}
	}

}
