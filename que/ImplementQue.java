package que;

public class ImplementQue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
          Queue q = new Queue(5);
          
          q.enque(1);
          q.enque(2);
          q.enque(3);
          q.enque(4);
          q.enque(5);
          while(!q.isEmpty()) {
        	  
        	  System.out.println(q.deque());
          }
	}

}
