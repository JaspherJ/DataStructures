package graphSingleLink;


public class Neighbour {

	int vertexID ;
	Neighbour next;
	public Neighbour(int vertexID, Neighbour next) {
		super();
		this.vertexID = vertexID;
		this.next = next;
	}
	
	
}

class BetterGraph{
	
	Vertex[] arrayOfLists;
	int indexCounter = 0;
	
	public BetterGraph(int no) {
		
		arrayOfLists = new Vertex[no];
	}
	
	public void addVertex(String vertexName) {
		
		arrayOfLists[indexCounter] = new Vertex(vertexName,null);
		indexCounter++;
	}
	
	
	public void addEdge(String find , String toInsert) {
		int id1 = indexPosition(find);
		int id2 = indexPosition(toInsert);
		
		arrayOfLists[id1].adjList = new Neighbour(id2,arrayOfLists[id1].adjList);
		
		
		
	}
	public int indexPosition(String name) {
		
		for(int i = 0 ; i< arrayOfLists.length ; i++) {
			if(arrayOfLists[i].Name.equals(name)) {
				return i;
			}
		}
		return -1;
		
	}
	public void print() {
		
		for(int i = 0 ; i < arrayOfLists.length; i++) {
			System.out.print(arrayOfLists[i].Name);
			for(Neighbour aNode = arrayOfLists[i].adjList;aNode != null; aNode = aNode.next) {
				System.out.print(" --> " + arrayOfLists[aNode.vertexID].Name);
			}
			System.out.println("\n");
		}
		
	}
}