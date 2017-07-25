package SingleLinkList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      SingleLink link = new SingleLink();
      
      link.insertAtFirst(1);
      link.insertAtFirst(2);
      link.insertAtFirst(3);
      link.insertAtFirst(4);
      link.insertAtFirst(5);
      link.insertAtFirst(6);
      link.insertAtFirst(7);
      link.insertAtFirst(8);
      link.insertAtFirst(9);
      link.insertAtLast(4848484);

      link.displayList();
      
      System.out.println(link.deleteAtFirst());
     
      
	}

}
