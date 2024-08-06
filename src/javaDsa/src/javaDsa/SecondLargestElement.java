package javaDsa;

import java.util.Arrays;

public class SecondLargestElement {

	public static void checkSecondLargest(int arr[]) {
		int size = arr.length;
		
		if(size<2) {
			System.out.println("Invalid input");
			return;
		}
		
		Arrays.sort(arr);
		
		System.out.println("The second largest element is "+ arr[size-2]);
		
	}

	public static void main(String...strings) {
		int[] arr1 = {2,44,56,5,8};
		
		checkSecondLargest(arr1);
	}
}
