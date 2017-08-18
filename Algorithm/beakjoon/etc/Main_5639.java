package Algorithm.beakjoon.etc;
import java.util.*;

public class Main_5639 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Tree_5639 tree = new Tree_5639();
		Node_5639 node = null;

		for(int i=1; i<=9; i++){			
			node = tree.insert(node, input.nextInt());
			//tree.insert2(node, input.nextInt());
		}

		//tree.postorder(node);
		tree.preorder(node);
		

	}
}

class Tree_5639{
	static Node_5639 root;

	public static Node_5639 insert(Node_5639 node, int value){
		
		Node_5639 temp = null;
		
		if(node == null){
			node = new Node_5639(value);
			return node;
		}
		
		temp = node;
		if(node.data < value){
			temp = insert(temp.right, value);
			node.right = temp;
		}

		else{
			temp = insert(temp.left, value);
			node.left = temp;
		}

		
		return node;
		
	}
	public static void insert2(Node_5639 node, int value){
		Node_5639 temp = node;
		Node_5639 p = null;
		while(temp != null){
			if(temp.data == value)
				return;
			p = temp;
			if(temp.data < value)
				temp = temp.right;
			else
				temp = temp.left;
		}
	
	
		Node_5639 newNode = new Node_5639(value);
		System.out.println(".");
		if(node == null){
			node = newNode;
			System.out.println("..");
		}
		else if(value > p.data)
			p.left = newNode;
		else
			p.right = newNode;
				
		System.out.println("..1");
		System.out.println();
		System.out.println("=============================");
		postorder(temp);
		
		
	}
	
	
	public static void postorder(Node_5639 root){
		//System.out.println(root.data);
		if(root.left != null)
			postorder(root.left);
		//System.out.println(root.data);
		if(root.right != null)
			postorder(root.right);

		System.out.println(root.data);
	}

	public static void preorder(Node_5639 root){
		
		System.out.println(root.data);
		if(root.left != null)
			preorder(root.left);
		//System.out.println(root.data);
		if(root.right != null)
			preorder(root.right);

		//System.out.println(root.data);
	}

	
	}

class Node_5639{
    Node_5639 left, right;
    int data;

    Node_5639(){
        left = null;
        right = null;
    }
    Node_5639(int data){
        this.data = data;

        left = null;
        right = null;
    }
}
	
	
