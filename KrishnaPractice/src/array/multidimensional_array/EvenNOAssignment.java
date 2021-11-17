package array.multidimensional_array;

public class EvenNOAssignment {
	
	public static void main(String args[]) {
		
		int[][] arr=new int[2][3];
		
		int num=2;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				arr[i][j]=num;
				
				num=num+2;
				System.out.print(arr[i][j] +" ");
			}
			
                 System.out.println();			
		}
		
	}

}
