package BST;

public class Node {
	int value;
	Node rightChild;
	Node leftChild;
	
	public Node(int value) {
		this.value = value;
		this.leftChild = this.rightChild = null;
	}
}
