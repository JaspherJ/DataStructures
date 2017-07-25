package Stack;




public class Stack {
  
	
	int top = -1;
	int maxSize ;
	char[] stackMemory ;

	public Stack(int maxSize) {
		super();
		this.maxSize = maxSize;
		this.stackMemory = new char[maxSize];
		
	}

	public void push(char e) {
		top ++;
		stackMemory[top] = e;
		
	}
	
	public char pop () {
		
		return stackMemory[top--];
	}
}
