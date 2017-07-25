package binarySearchTree;

public class BInarySearchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		BinaryTree tree = new BinaryTree();
		
		tree.add(50);
		tree.add(25);
		tree.add(75);
		tree.add(10);
		tree.add(30);
		tree.add(45);
		tree.add(96);
		tree.add(55);
		tree.add(12);
		tree.add(65);

		tree.traverse();
		
		tree.find(30);
		tree.delete(65);
		//sysout
		
	}

}
