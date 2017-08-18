package Algorithm.beakjoon.etc;

import java.util.*;

public class Main_1012 {
	static int t,n,m,k;
	static int arr[][];
	
	static boolean visit[][];
	
	static int nx[] = {1,-1,0,0};
	static int ny[] = {0,0,1,-1};
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		t =  input.nextInt();
		arr = new int[2500][2500];
		visit = new boolean[2500][2500];
		for(int a=0; a<t; a++){
			n = input.nextInt();
			m = input.nextInt();
			k = input.nextInt();
		
			
			for(int s=0; s<n; s++){
				for(int d=0; d<m; d++){
					visit[s][d] = false;
					arr[s][d] = 0;
				}
			}
			
			for(int j=0; j<k; j++){
				int xx = input.nextInt();
				int yy = input.nextInt();
				arr[xx][yy] = 1;				
			}
			
			/*
			for(int q=0; q<n; q++){
				for(int w=0; w<m; w++)
					System.out.print(arr[q][w] + " ");
				System.out.println();
			}
			*/
			
			int cnt = 0;
			for(int q=0; q<n; q++){
				for(int j=0; j<m; j++){
					if(arr[q][j] == 1 && !visit[q][j]){
						dfs(q,j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
			
		}

	}
	
	public static void dfs(int a, int b){
		visit[a][b] = true;
		for(int i=0; i<4; i++){
			int x = nx[i] + a;
			int y = ny[i] + b;
			if(x<n && y<m && x>=0 && y>=0 && arr[x][y] == 1 && !visit[x][y]){
				dfs(x,y);				
			}
		}
		
	}

}
