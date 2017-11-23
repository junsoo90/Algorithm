package BST;

import java.security.acl.Permission;

public class BinaryTree {

	Node rootNode = null;

	public void insertNode(int element) {

		if (rootNode == null) {
			rootNode = new Node(element);
			return;
		}

		Node head = rootNode;
		Node currentNode;

		while (true) {
			currentNode = head;

			if (head.value > element) {
				head = head.leftChild;
				if (head == null) {
					currentNode.leftChild = new Node(element);
					break;
				}
			} else {
				head = head.rightChild;

				if (head == null) {
					currentNode.rightChild = new Node(element);
					break;
				}
			}
		}
	}

	public boolean removeNode(int element) {

		Node removeNode = rootNode;
		Node parent = null;

		while (removeNode.value != element) {
			parent = removeNode;

			if (removeNode.value > element)
				removeNode = removeNode.leftChild;
			else
				removeNode = removeNode.rightChild;

			if (removeNode == null)
				return false;
		}

		// 자식 노드가 모두 없을 때

		if (removeNode.leftChild == null && removeNode.rightChild == null) {

			if (removeNode == rootNode)
				rootNode = null;
			else if (removeNode == parent.rightChild)
				parent.rightChild = null;
			else
				parent.leftChild = null;
		}

		// 오른쪽 자식만 있는 경우
		else if (removeNode.leftChild == null) {
			if (removeNode == rootNode)
				rootNode = removeNode.rightChild;
			else if (removeNode == parent.rightChild)
				parent.rightChild = removeNode.rightChild;
			else
				parent.leftChild = removeNode.rightChild;

		}

		// 왼쪽만 있는 경우
		else if (removeNode.rightChild == null) {

			if (removeNode == rootNode)
				rootNode = removeNode.leftChild;
			else if (removeNode == parent.leftChild)
				parent.rightChild = removeNode.leftChild;
			else
				parent.leftChild = removeNode.leftChild;

		}

		// 두개의 자식 모두 있을 때
		else {

			Node parentReplace = removeNode;
			Node replaceNode = parentReplace.rightChild;

			while (replaceNode.leftChild != null) {
				parentReplace = replaceNode;
				replaceNode = replaceNode.leftChild;
			}

			if (replaceNode != removeNode.rightChild) {
				parentReplace.leftChild = replaceNode.rightChild;
				replaceNode.rightChild = removeNode.rightChild;
			}

			if (removeNode == rootNode)
				rootNode = replaceNode;
			else if (removeNode == parent.rightChild)
				parent.rightChild = replaceNode;
			else
				parent.leftChild = replaceNode;

			replaceNode.leftChild = removeNode.leftChild;
		}

		return true;
	}
	
	public void preorder(Node root, int h) {
		if(root != null) {
			System.out.println(root.value);
			preorder(root.leftChild, h+1);
			preorder(root.rightChild, h+1);
		}
	}
}
