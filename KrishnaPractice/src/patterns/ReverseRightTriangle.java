package patterns;

public class ReverseRightTriangle {
	
	public static void main(String args[]) {
		
		int i,j,k,row=3;
		
		for(i=0;i<row;i++) {
			
			for(j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(k=3;k>i;k--) {
				System.out.print("*");
		    }
			
			System.out.println();
		}
	}

}
