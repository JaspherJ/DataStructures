package BinarySearchRecursive;


public class BinaryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,20,30,40,50,60,70,80,90};
		
		
		//System.out.println(BinarySearch(arr,92));
		// Recursion(7);
		//System.out.println(RecursionLinear(arr,0,80));
		System.out.println(RecursiveBinarySearch(arr,100,0,8));
	}
	public static void Recursion(int n){
		
		if(n>=0) {
			
			Recursion(n-1);
		}
		System.out.println("Completed Call: " + n );
	}
	
	
	public static int RecursionLinear(int [] a ,int i ,int x) {
		
	
		int n = a.length-1;

		if(i>=n) {
			return -1;
		}
		else if(a[i] == x){
			return i;
		}
		else {
			System.out.println("Index at:" + i);
			return RecursionLinear(a,i+1,x);
		}
		
		
	}
	

	
public static int BinarySearch(int[] arr , int key) {
	int p =0;
	int r = arr.length-1;
	
	while(p <= r) {
		
		int q = (p +r)/2;
		
		if(arr[q] == key) {
		
		return q;
		
		}
		if(arr[q] > key) {
			
			r = q-1;
			
		}
		else {
			
			p = q+1;
		}
}
return -1;
}


public static int RecursiveBinarySearch(int[] arr , int key,int p , int r) {
	
	if(p >r) {
		return -1;
	}
	int q = (p+r)/2;
	if(arr[q]==key) {
		return q;
	}
	else if(arr[q] > key){
		return RecursiveBinarySearch(arr,key,p ,q-1);
		
	}
	else {
		return RecursiveBinarySearch(arr,key,q+1,r);
	}
	
}







}