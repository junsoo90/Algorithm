package Algorithm.beakjoon.chapter23;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_1967 {

	static int sum = 0;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int arr[][] = new int[n+1][n+1];
		
		for(int i=1; i<=n-1; i++){
			int root = input.nextInt();
			int child = input.nextInt();
			int dist = input.nextInt();
			arr[root][child] = dist;
			arr[child][root] = dist;
		}
		
		input.close();

		Node maxNode = dfs(arr,1);
		Node result = dfs(arr,maxNode.value);
		
		System.out.println(result.sum);
	}
	
	public static Node dfs(int graph[][], int n){

		boolean visit[] = new boolean[graph.length+1];
		Queue queue = new LinkedList();
	
		Node maxNode = new Node(n, 0);
	    queue.add(maxNode); // �������� ����
	 		
		while(!queue.isEmpty()){
			 Node vertex = (Node) queue.poll();
	            visit[vertex.value] = true;


	            for (int i = 1; i < graph.length; i++) {
	                if (graph[vertex.value][i] > 0 && !visit[i]) {
	                    queue.add(new Node(i, vertex.sum + graph[vertex.value][i]));
	                }
	            }
	            
                if (maxNode.sum < vertex.sum)
                    maxNode = vertex;
		}
		return maxNode;
	}
	
	static class Node {
	        int value;
	        int sum;
	 
	        public Node(int value, int sum) {
	 
	            this.value = value;
	            this.sum = sum;
	        }
	    }
	
	
}