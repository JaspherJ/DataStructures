package SingleLinkList;

public class SingleLink {

	Node first;
	Node last;
	
	
	public void insertAtFirst(int data) {
		Node newnode = new Node();
		newnode.data = data;
		newnode.next = first;
	    first = newnode;
	     
	     
	}
	public void insertAtLast(int data) {
		
		Node temp = first;
		Node newnode = new Node();
	     newnode.data = data;
		  
		  while(temp.next!= null) {
		    	temp = temp.next;
		    }
		  
		  temp.next = newnode; 
	
	}
	
	public int deleteAtFirst() {
		
		int temp = first.data;
		first = first.next;
        return temp;
	}
	
	public void displayList() {
		
	    while(first != null) {
	    	System.out.println(first.data);
	    	first = first.next;
	    }
		
	}
	
}
