package graph;

import java.util.ArrayList;

public class Graph {

	int vCount ;
	int ECount;
	 @SuppressWarnings("rawtypes")
	ArrayList[] adjacents;
	public Graph(int vCount) {
		super();
		this.vCount = vCount;
		
		adjacents = new ArrayList[vCount];
		
		for(int i = 0 ; i< adjacents.length; i++) {
			
			adjacents[i] = new ArrayList<>();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void addEdge(int index,int connect) {
		
		
		adjacents[index].add(connect);
	}
	
	
	public Object[] adjacent(int find) {
		
		return adjacents[find].toArray();
	}
}
