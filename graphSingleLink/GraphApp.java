package graphSingleLink;

public class GraphApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BetterGraph bet = new BetterGraph(5);
		
		bet.addVertex("State");
		bet.addVertex("State1");
		bet.addVertex("State2");
		bet.addVertex("State3");
		bet.addVertex("State4");

		
		bet.addEdge("State","State1");
		bet.addEdge("State1","State4");
		bet.addEdge("State1","State4");
		bet.addEdge("State","State1");
		bet.addEdge("State","State2");

		bet.print();
		
	}

}
