package binarySearchTree;

public class BinaryTree {



	Node root;

	public void add (int data) {

		Node node = new Node(data);

		if(root == null) {
			root = node;
			return;
		}
		traverseAdd(root,node);

	}

	public void traverseAdd(Node root, Node toAdd) {
		if(toAdd.data < root.data) {
			if(root.leftChild == null) {
				toAdd.parent = root;
				root.leftChild = toAdd;
			}
			else {
				traverseAdd(root.leftChild,toAdd);
			}

		}
		else {
			if(root.rightChild == null) {
				toAdd.parent = root;
				root.rightChild = toAdd;
			}
			else {
				traverseAdd(root.rightChild,toAdd);
			}
		}
	}


	public void traverse(){
		Node nodeToTraverse = root;
		if(nodeToTraverse != null) {
			if(nodeToTraverse.leftChild == null && nodeToTraverse.rightChild==null) {
				System.out.println(nodeToTraverse.data);
			}
			else {
				traverseTree(nodeToTraverse);
				//System.out.println(nodeToTraverse.data);

			}
		}
	}

	public void traverseTree(Node node) {
		if(node.leftChild != null) {
			traverseTree(node.leftChild);
		}
		System.out.print(node.data + " ");
		if(node.rightChild != null) {
			traverseTree(node.rightChild);
		}

	}




	public Node findNode(Node node , int key) {

		if(node == null)
			return null;
		if(node.data == key) {
			return node;
		}
		else {
			Node returnnode = findNode(node.leftChild,key);
			if(returnnode == null) {
				returnnode = findNode(node.rightChild,key);
			}
			return returnnode;
		}

	}

	public Node find(int val) {

		return findNode(root ,val);
	}

	public boolean delete(int val) {
		
		Node nodetoBedeleted = find(val);
		if(nodetoBedeleted !=null) {
			if(nodetoBedeleted.leftChild == null && nodetoBedeleted.rightChild ==null) {
				deleteCase1(nodetoBedeleted);
			}
			else if(nodetoBedeleted.leftChild !=null ) {
				
				deleteCase2(nodetoBedeleted);
			}
			else if( nodetoBedeleted.rightChild != null) {
				deleteCase3(nodetoBedeleted);
			}
		}
		return false;
	}
	
	
	
private void deleteCase2(Node nodetoBedeleted) {
	
	if(nodetoBedeleted.parent.leftChild == nodetoBedeleted){
		if(nodetoBedeleted.leftChild != null) {
			nodetoBedeleted.parent.leftChild = nodetoBedeleted.leftChild;

		}
		else if(nodetoBedeleted.rightChild != null) {
			nodetoBedeleted.parent.rightChild = nodetoBedeleted.rightChild;

		}
	}
	else if(nodetoBedeleted.parent.rightChild ==nodetoBedeleted){
	}
	if(nodetoBedeleted.leftChild != null) {
		nodetoBedeleted.parent.rightChild = nodetoBedeleted.leftChild;

	}
	else if(nodetoBedeleted.rightChild != null) {
		nodetoBedeleted.parent.leftChild = nodetoBedeleted.rightChild;

	}
	}

private void deleteCase1(Node nodetoBedeleted){
	if(nodetoBedeleted.parent.leftChild == nodetoBedeleted) {
		nodetoBedeleted.parent.leftChild = null;
	}
	else if(nodetoBedeleted.parent.rightChild == nodetoBedeleted) {
		nodetoBedeleted.parent.rightChild = null;
	}
}


private void deleteCase3(Node nodetoBeDeleted) {
	
}

}











