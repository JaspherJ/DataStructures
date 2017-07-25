package DoublyLink;

public class DoubleApp {

	public static void main(String[] args) {
 
		DoubleLink link = new DoubleLink();
		
		link.insertAtFirst(20);
		link.insertAtFirst(30);
		link.insertAtFirst(40);
		link.insertAtFirst(50);
        link.insertAtLast(21);
        link.insertAtLast(26);
        link.insertAtLast(28);

		link.displayForward();
	
		
		link.DeleteAtFirst();
		link.DeleteAtFirst();
		link.displayForward();
		
		link.DeleteAtLast();
		link.DeleteAtLast();
		link.displayForward();
		
		
		link.InsertAfter(20, 100);
		link.InsertAfter(21, 68);
		
		link.displayForward();
		
		
		link.InsertBefore(100, 25);
		
		link.displayForward();


	}

}
