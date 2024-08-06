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
		
		//System.out.println("The second largest element is "+ arr[size-2]);
		for (int i=size-1;i>=0;i--) {
			if(arr[i]==arr[i-1]) {
				System.out.println("There are two same element please enter unique elements");
				break;
			}else {
				System.out.println("The second largest element is "+arr[size-2]);
				break;
			}
		}
	}

	public static void main(String...strings) {
		int[] arr1 = {2,34,25,34};
		
		checkSecondLargest(arr1);
	}
}
