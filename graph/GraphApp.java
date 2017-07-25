package graph;

public class GraphApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graph graph = new Graph(5);
		
		graph.addEdge(0,1);
		graph.addEdge(0,2);

		graph.addEdge(0,3);

		graph.addEdge(0,4);

		graph.addEdge(2,1);
		graph.addEdge(4,1);
		graph.addEdge(2,4);
		graph.addEdge(3,2);

		
		Object[] values=graph.adjacent(0);
		for(Object val :values) {
			System.out.println(val);
		}
	}

}
