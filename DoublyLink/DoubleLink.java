			package DoublyLink;
			
			public class DoubleLink {
			Node first;
			Node last;
			
			
			public boolean isEmpty() {
				return (first == null);
			}
			
			
			public void insertAtFirst(int data) {
				
				
				Node newnode = new Node();
				newnode.data = data;
				if(isEmpty()) {
					last = newnode;
				}
				else {
				  first.previous = newnode;
				  
				}
				
				newnode.next = first;
				first = newnode;
			}
			
			public void insertAtLast(int data){
				Node newnode = new Node();
				newnode.data = data;
				if(isEmpty()) {
					first =newnode;
				}
				else {
					last.next = newnode;
					newnode.previous = last;
				}
				
				last =newnode;
			
			}
			
			//Delete
			
			public Node DeleteAtFirst() {
				Node temp = first;
				if(first.next ==null) {
					last = null;
				}else {
				first.next.previous  = null;
				
					}
				first = first.next;
			return temp;
			
			
			}
			
			public Node DeleteAtLast() {
				
				Node temp = last;
				
				if(first.next == null) {
					first = null;
				}
				else {
					last.previous.next = null;
					
				}
				last = last.previous;
				return temp;
			}
			
			public boolean InsertAfter(int key , int data){
			
				Node newnode = new Node();
				newnode.data = data;
				
				Node current = first;
				
				while(current.data != key) {
					
					current = current.next;
					if(current == null) {
						return false;
					}
				}
					if(current == last) {
						current.next=null;
						last=newnode;
					}else {
					current.next.previous = newnode;
					newnode.next = current.next;
					}
					newnode.previous = current;
					current.next = newnode;
					return true;
				
			}
			
			
			public boolean InsertBefore(int key ,int data) {
				

				Node newnode = new Node();
				newnode.data = data;
				
				Node current = first;
				
				while(current.data != key) {
					current = current.next;
					if(current == null) {
						return false;
					}
				}
				
					newnode.next = current;
					//current.previous =newnode;
					current.previous.next = newnode;

					newnode.previous= current.previous;
					current.previous = newnode;
                return true;
			}
			
			public Node deleteKey(int key) {
				
				Node current = first;
				
			while(current.data != key) {
				
				current = current.next;
				if(current == null) {
					//no node found
					return null;
				}
			}
				Node temp = current;
				if(current == first) {
					first = current.next;
				}
				else {
					
					current.previous.next = current.next;
				}
				if(current == last) {
					last = current.previous;
			}
				else {
					current.next.previous = current.previous;
				}
				
				return temp;
			}


		public void displayForward() {
			Node current = first;
			System.out.println("First - last");
			while(current != null) {
				System.out.print(current.data + " ");
				current = current.next;
				
			}
			System.out.println();
		}
		
		public void displayBackward() {
			
			Node current = last;
			System.out.println("last- first");

			while(current != null) {
				System.out.print(current.data + " ");
				current = current.previous;
				
			}
			System.out.println();
		}
		
			
		}
			
			
			
			

