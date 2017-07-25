package graphSingleLink;

public class Vertex {

	String Name;
	Neighbour adjList ;
	public Vertex(String name, Neighbour adjList) {
		super();
		Name = name;
		this.adjList = adjList;
	}
	
}
