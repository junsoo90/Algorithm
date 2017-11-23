package BST;

public class BinarySearchTreeTest {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		
		tree.insertNode(5);
		tree.insertNode(8);
		tree.insertNode(7);
		tree.insertNode(10);
		tree.insertNode(9);
		tree.insertNode(11);
		
		tree.removeNode(8);
		
		tree.preorder(tree.rootNode, 0);

	}

}
