package Stack;

public class StackImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str = "hello";
          reverse(str);
         /* 
          stack.push('h');
          stack.push('e');
          stack.push('l');
          stack.push('l');
          stack.push('0');

          
  		System.out.println(stack.pop());
  		System.out.println(stack.pop());
  		System.out.println(stack.pop());
  		System.out.println(stack.pop());
  		System.out.println(stack.pop());*/
          
	}
	public static String reverse(String str) {
		Stack stack = new Stack(str.length());
		for(int i=0 ;i< str.length(); i++) {
			char ch = str.charAt(i);
			stack.push(ch);
		}
		String result = "";
		
		return "";
	}

}
