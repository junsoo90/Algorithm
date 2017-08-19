package Algorithm.beakjoon.chapter30;

import java.util.*;

public class Main_2957 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeNode node = new TreeNode();

        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int in = input.nextInt();
            node.insertNode(node.getRoot(), in);
            System.out.println(node.getCnt());
        }
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node() {

    }

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}

class TreeNode {
    private Node root;
    private int cnt = 0;

    public Node getRoot() {

        return root;
    }

    public int getCnt() {
        return cnt;
    }

    public void insertNode(Node node, int n) {

        if (node == null) {
            root = new Node(n, null, null);
            return;

        }
        cnt++;

        if (node.getData() > n) {
            if (node.getLeft() == null) {
                node.setLeft(new Node(n, null, null));
            } else
                insertNode(node.getLeft(), n);
        } else {
            if (node.getRight() == null) {
                node.setRight(new Node(n, null, null));
            } else
                insertNode(node.getRight(), n);
        }


    }
}

