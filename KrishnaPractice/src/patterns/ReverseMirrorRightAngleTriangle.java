package patterns;

public class ReverseMirrorRightAngleTriangle {
	
	public static void main(String args[]) {
		
		int i,j,row=3;                                        
		                                                       		
		for(i=0;i<row;i++) {
			
			for(j=3;j>i;j--) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
