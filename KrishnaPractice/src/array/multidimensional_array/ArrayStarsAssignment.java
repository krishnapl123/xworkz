package array.multidimensional_array;

public class ArrayStarsAssignment {
	
	public static void main(String args[]) {
		
		int[][] arr=new int[2][3];
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(  "*" + " ");
			}
			
			System.out.println();
		}
	}

}
