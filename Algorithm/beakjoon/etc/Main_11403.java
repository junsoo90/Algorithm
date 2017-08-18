package Algorithm.beakjoon.etc;

import java.util.*;

public class Main_11403 {
	static int arr[][];
	//static int visit[];
	static boolean printarr[][];
	static boolean visit[];
	static int n;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
		arr = new int[n+1][n+1];
		//visit = new int[n+1];
		
		printarr = new boolean[n+1][n+1];
		
		visit = new boolean[n+1];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				arr[i][j] = input.nextInt();
			}
		}
		//dfs(1);
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++)
				visit[i] = false;
			DFS(1);
			
			for(int j=0; j<n; j++){
				printarr[i][j] = visit[j];
			}
		}
		
		//DFS(1);
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print( printarr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void DFS(int v)	{
		visit[v] = true;
		System.out.println("visit[v] = " + visit[v]);
		System.out.println();
		
		for(int i=0; i<n; i++){
			if(arr[v][i] == 1 && !visit[i]){
				printarr[v][i] = true;
				
				DFS(i);
			}
		}
	}


	/*
	public static void dfs(int n){
		

		Stack CheckStack = new Stack(); // DFS�� ����
		for (int i = 0; i < arr.length; i++){
			CheckStack.push(i); // 0�� ������ üũ ����	
			
			while (!CheckStack.isEmpty()){
				int nCheckNode = (int)CheckStack.peek();
				CheckStack.pop();
				for (int j = 0; j < arr.length; j++){
					// ���� üũ���� ��忡�� j���� ����Ǿ� �ְ�, j���� �湮�� ���� ���� ���
					if (arr[nCheckNode][j] == 1&& visit[j] == 0){
						visit[j] = 1; // �湮�ߴٰ� ǥ��
						printarr[i][j] = 1; // i���� j�� ����Ǿ��ٰ� ǥ��
						CheckStack.push(j); // j�� ����						
					}
					
				}
			}
			
		}


		
	}
*/
}
