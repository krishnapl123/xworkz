package array;

import java.util.Arrays;

public class ArraysClassMethod {
	
	public static void main(String args[]) {
		int[] arr= {2,4,1,5,6};
		
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(arr));
		
	     Arrays.sort(arr);
	     System.out.println("After sorting");
			
	     
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.binarySearch(arr, 5));//says given no in which position

		
		int[] copiedArray=Arrays.copyOf(arr,4);//copy upto the no of given position
		System.out.println(Arrays.toString(copiedArray));
		
		int[] copiedRangeArray=Arrays.copyOfRange(arr, 0,3);//copy the range from 0 to 2 except 3rd position
		System.out.println(Arrays.toString(copiedRangeArray));

		
	     Arrays.fill(copiedRangeArray,10);
		
	}

}
