package patterns;

public class ReverseRightAngleTriangle {  
	
	public static void main(String args[]) {
		
		int i ,j,row=6;
		
		for(i=0;i<row;i++) {
			
			for(j=6;j>i;j--) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
