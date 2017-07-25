package MergeSort;

import java.util.Arrays;

public class MergeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {32,22,11,59,23,1};
		
		MergeSort(arr,0,arr.length-1);
	}

	
	public static void MergeSort(int[] arr ,int start , int end) {
		
		if(end <= start) {
			return;
		}
		
		int mid = (start + end)/2;
		
		MergeSort(arr,start,mid);
		MergeSort(arr,mid+1, end);
		Merge(arr,start,mid,end);
	}
	
	
	public static void Merge(int arr[], int start, int mid , int end){
	    int[] tempArray = new int[end -start + 1];
		int k = 0;
	    int leftSlot = start;
	    int rightSlot = mid +1;
	  
	    while(leftSlot <= mid && rightSlot <= end) {
	    	
	    	if(arr[leftSlot] < arr[rightSlot]) {
	    		
	    		tempArray[k] = arr[leftSlot];
	    		leftSlot ++;
	    		
	    	}else{
	    		tempArray[k] = arr[rightSlot];
	    		rightSlot ++;
	    	
	    	}
	    	k++;
	    	
	    }
	   
		if(leftSlot <= mid) {
			while(leftSlot <= mid) {
				tempArray[k] = arr[leftSlot];
				leftSlot = leftSlot +1;
				k= k+1;
			}
			}else if(rightSlot <= end) {
				tempArray[k] = arr[rightSlot];
				rightSlot = rightSlot + 1;
				k = k+1;
			}
		for(int i =0 ; i < tempArray.length; i++) {
			arr[start + i] = tempArray[i];
		}
		System.out.println(Arrays.toString(arr));

		}
	

}