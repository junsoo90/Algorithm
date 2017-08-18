package Algorithm.beakjoon.chapter23;
import java.util.*;

public class Main_1991 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		char data[] = new char[3];
		Tree_1991 tree = new Tree_1991();
		
		for(int i=0; i<n; i++){
			tree.insert(input.next().charAt(0), input.next().charAt(0), input.next().charAt(0));
		}
		
		tree.preorder(tree.root);
		System.out.println();
		
		tree.inorder(tree.root);
		System.out.println();
		
		tree.postorder(tree.root);
	}

}

class Tree_1991{
	
	static Node_1991 root;
	
	public static void insert(char data, char left, char right){
				
		if(root == null){
			if(data != '.')
				root = new Node_1991(data);
			if(left != '.')
				root.left = new Node_1991(left);
			if(right != '.')
				root.right = new Node_1991(right);

		}
		
		else{
			search(root, data, left, right);
		}
	}
	
	public static void search(Node_1991 root, char data, char left, char right){
		if(root == null)
			return;
		
		else if(root.data == data){
			if(left != '.')
				root.left = new Node_1991(left);
			if(right != '.')
				root.right = new Node_1991(right);
		}
		else{
			search(root.left, data, left, right);
			search(root.right, data, left, right);
		}
		
	}
	
	public static void preorder(Node_1991 root){ // ����
		System.out.print(root.data);
		
		if(root.left != null)
			preorder(root.left);
		
		if(root.right != null)
			preorder(root.right);
	
	}
	
	public static void postorder(Node_1991 root){ // ����
		if(root.left != null)
			postorder(root.left);
		
		if(root.right != null)
			postorder(root.right);
		
		System.out.print(root.data);
	}
	
	public static void inorder(Node_1991 root){ // ����
		if(root.left != null)
			inorder(root.left);
		
		System.out.print(root.data);
		
		if(root.right != null)
			inorder(root.right);
	}
	
}

class Node_1991{
	char data;
	Node_1991 left, right;
	
	public Node_1991(char data){
		this.data = data;
	}
}
