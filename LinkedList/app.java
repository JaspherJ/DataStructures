package LinkedList;

public class app {

	public static void main(String[] args) {
		Node nodeA = new Node();
		nodeA.data =2;
		
		Node nodeB= new Node();
		nodeB.data =7;
		
		Node nodeC = new Node();
		nodeC.data =8;
		
		Node nodeD = new Node();
		nodeD.data =1;
		
		
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		
		System.out.println(NodeLength(nodeA));
		System.out.println(NodeLength(nodeB));
		System.out.println(NodeLength(nodeC));
		System.out.println(NodeLength(nodeD));


		
	}

	public static int NodeLength(Node node) {
		int count = 0;
		while(node !=null) {
			count ++;
			node = node.next ;
		};
		return count;
	}
	
}
