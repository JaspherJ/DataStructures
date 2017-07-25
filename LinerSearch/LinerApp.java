 package LinerSearch;

public class LinerApp {

	
	 public static int linearSearch(int find ,int[] arr) {
   	  
		 
		 for(int i= 0 ; i< arr.length;i++) {
			 if(arr[i]==find) {
				return i;
			 }
		 }
   	  return -1;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int[] arr = {1,2,3,4,5};
		
		System.out.println(linearSearch(2,arr));
		
	}

}
