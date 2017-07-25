package Circular;


public class CircularLink {
	Node first;
	Node last;
	Node temporary;
	int i;
	
	
	private boolean isEmpty() {
		return first==null;
	}
	public void insertAtFirst(int data) { 
		
		Node newnode = new Node();
		newnode.data = data;
		if(isEmpty()) {
			last =newnode;
		}
		newnode.next = first;
	    first = newnode;
	    
	}
	
	
	public void insertAtLast(int data) {
		
		Node newnode  = new Node();
		newnode.data = data;
		if(isEmpty()) {
			first =newnode;
		}else {
			
			last.next = newnode;
			//System.out.println("Inserted" + newnode.data);

		}
		last =newnode;

	}
	 
	public void DisplayList() {
		Node temp = first;
		while(temp!= null) {
			System.out.print(temp.data + " ");
			temp  = temp.next;
			
		}
	}
	/*public void DisplayReverse() {
		Node temp = null;
		Node current = first;
		Node next = null;
		while(current != null) {
			next = current.next;
			current.next = temp;
			temp = current;
			current = next;
			System.out.print(temp.data + " ");
		}
		
	}*/
public void DisplayReverse(){
	
	Reverse(first);
}

	public void Reverse(Node temporary) {
		System.out.println();

		if(temporary.next !=null) {
			
			Reverse(temporary.next);
		}
		System.out.print(temporary.data + " ");
		
	}
	
	
	
	
	
	
	
	
	
	
}
