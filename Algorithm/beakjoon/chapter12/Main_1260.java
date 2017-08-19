package Algorithm.beakjoon.chapter12;

import java.util.*;

public class Main_1260 {

	static int arr[][];
	static boolean visit[];
	static int n, v;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
		int m = input.nextInt();
		v = input.nextInt();
		arr = new int[n+1][n+1];
		
		visit = new boolean[n];
		for(int i=1; i<=m; i++){
			int a = input.nextInt();
			int b = input.nextInt();
			
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		bfs2(1);
		dfs();
		System.out.println();
		bfs();
		System.out.println();
		System.out.println("======================================");
		System.out.println();
		dfs2(1);
		System.out.println();
		dfs3(1);
		System.out.println();
	
		
	}
	
	public static void dfs(){
		visit[v] = true;
		System.out.print(v + " ");
		Stack stack = new Stack();
		stack.push(v);
		int next = -1;
		

		while(!stack.isEmpty()){
			int temp = (int) stack.peek();
			
			next = VertexValue(temp);
			if(next == -1)
				stack.pop();

			else{
				 visit[next] = true;
				 System.out.print(next + " ");
				 stack.push(next);
			 }
			
		}
		
		for(int i=0; i<n+1; i++)
			visit[i] = false;
	}
	
	public static void bfs(){
		visit[v] = true;
		System.out.print(v + " ");
		Queue queue = new LinkedList();
		queue.add(v);
		int next = -1;
		
		while(!queue.isEmpty()){
			int temp = (int) queue.remove();
			while( (next = VertexValue(temp) )  != -1){
				visit[next] = true;
				System.out.print(next + " ");
				queue.add(next);
			}
		}
		for(int i=0; i<n+1; i++)
			visit[i] = false;
	}
	
	
	public static int VertexValue(int v){
		for(int i=1; i<=n; i++){
			if(arr[v][i] == 1 && visit[i] == false)
				return i;
		}
		return -1;
	}
	
	
	public static void bfs2(int value){
		visit[value] = true;
		Queue queue = new LinkedList();
		queue.add(value);
		System.out.print(value + " ");
		while(!queue.isEmpty()){
			int temp = (int)queue.remove();
			for(int i=1; i<=n; i++){
				if(!visit[i] && arr[temp][i]==1){
					visit[i] = true;
					queue.add(i);
					System.out.print(i + " ");
				}
				if(n==i)
					queue.remove();
			}
		}

		for(int i=0; i<n+1; i++)
			visit[i] = false;
	}
	
	public static void dfs2(int value){
		Stack stack = new Stack();
		
		visit[value] = true;
		stack.push(value);
		System.out.print(stack.peek() + " ");
		
		while(!stack.isEmpty()){
			int temp = (int) stack.peek();
			for(int i=1; i<=n; i++){
				if(!visit[i] && arr[temp][i] == 1){
					visit[i] = true;
					System.out.print(i + " ");
					stack.push(i);		
					break;
				}
				if(i==n)
					stack.pop();
			}
			
			
		}
		for(int i=0; i<n+1; i++)
			visit[i] = false;
	}
	
	public static void dfs3(int value){
		
/*
		visit[i] = true;
        System.out.print(i+" ");
          
        for(int j=1; j<=n; j++){
            if(arr[i][j]==1&& visit[j]==false){
                dfs3(j);
            }
        }
*/

		
		visit[value] = true;
		System.out.print(value + " ");
		
		for(int i=1; i<=n; i++){
			if(!visit[i] && arr[value][i] == 1){
				dfs3(i);	
			}
		}
		
	}
}