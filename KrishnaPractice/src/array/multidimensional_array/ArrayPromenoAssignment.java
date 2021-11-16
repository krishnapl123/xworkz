package array.multidimensional_array;

public class ArrayPromenoAssignment {
	
	public static void main(String args[]) {
		
		int[][] arr2= {{2,5,7},{11,13,17}};
		
		for(int i=0;i<arr2.length;i++) {
			
			for(int j=0;j<arr2[i].length;j++) {
				
				System.out.print(arr2[i][j]+ " ");
			}
			
			System.out.println();
		}
	}

}
