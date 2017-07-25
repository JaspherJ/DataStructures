package que;

public class Queue {
	
	private int maxSize;
	private int[] queMem;
	private int front=-1;
	private int rear=-1;
	public Queue(int maxSize) {
		super();
		this.maxSize = maxSize;
		this.queMem = new int[maxSize];
	}
	
	
	public void enque(int num) throws Exception{
		if(maxSize())
			throw new Exception("Stack is full");
		front ++;
		queMem[front] = num;
	}

	public int deque() throws Exception {
		if(isEmpty())
			throw new Exception("Stack is full");
        rear++;
        front--;
		return queMem[rear];
		
	}
	
	public int peak () {
		return queMem[maxSize-1];
	}
	
	public boolean isEmpty() {
		if(front ==-1)
			return true;
		return false;
	}
	
	public boolean maxSize() {
		if(maxSize == front)
			return true;
		return false;
					
	}
}
