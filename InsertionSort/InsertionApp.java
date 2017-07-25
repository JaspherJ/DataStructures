package InsertionSort;

import java.util.Arrays;

public class InsertionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {32,22,11,59,23,1,9};
		
		InsertionSort(arr);
	}

	
	
	public static void InsertionSort(int[] arr) {
		
		for(int i = 1; i< arr.length; i++) {
			int j= i-1;
			int element = arr[i];
			while(j>=0 && arr[j] > element) {
				
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = element;
		}
		System.out.println(Arrays.toString(arr));

	}
}
