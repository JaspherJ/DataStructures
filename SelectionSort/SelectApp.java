package SelectionSort;

public class SelectApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {32,22,11,59,23,1,9};
       SortArray(arr);
	}

	
	public static void SortArray(int arr[]) {
		for(int i= 0 ; i< arr.length; i++) {
			int min = i;
			for(int j=i+1 ; j < arr.length;j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			System.out.println(arr[i]);
		}
		
	}
}