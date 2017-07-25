
public class Counter {

	String str = "";
	int counter =0;

	public Counter(String str) {
		super();
		this.str = str;
	}
	
	public void increment() {
		
		counter++;
	}
	
	public int getCurrentValue() {
		
		return counter;
	}
	
	public String toString() {
		return str + " " +  counter;
	}
}
