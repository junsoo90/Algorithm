package Algorithm.beakjoon.etc;

import java.util.*;

public class Main_2583 {
	static int arr[][], arr_x, arr_y;
	static int visit[][], result[];
	
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	
	static int t =0;
	static int m,n,paper[][],result2[];
	
	public static void main(String[] args) {
		part2();
		
		
	}
	public static void part2(){
		Scanner input = new Scanner(System.in);
		
		m = input.nextInt();
		n = input.nextInt();
		int k = input.nextInt();
		
		paper = new int[m][n];
		result2 = new int[m*n+1];
		for(int i=0; i<k; i++){
			int y1= input.nextInt();
			int x1 = input.nextInt();
			int x2 = input.nextInt();
			int y2 = input.nextInt();
			
			for(int a = x1; a<x2; a++){
				for(int b= y1; b<y2; b++){
					paper[a][b] = -1;
				}
			}
		}
		
		int color = 1;
		
		for(int a = 0; a<m; a++){
			for(int b=0; b<n; b++){
				if(paper[a][b] == 0){
					search2(a,b,color);
					color++;
				}
			}
		}
		System.out.println(color-1);
		Arrays.sort(result2, 1, color);
		for(int i=1; i<color; i++)
			System.out.print(result2[i] + " ");
		 
	}
	public static void search2(int a, int b, int t){
		paper[a][b] = t;
		result2[t]++;
		for(int i=0; i<4; i++){
			int nx = i + dx[i];
			int ny = i + dy[i];
			if( nx>=0 && ny >=0 && nx<m && ny < n){
				if(paper[nx][ny]==0)
					search2(nx,ny,t);
			}
		}
			
	}
	public static void part1(){
		Scanner input = new Scanner(System.in);
		
		arr_x = input.nextInt();
		arr_y = input.nextInt();
		
		int n = input.nextInt();
		int cnt = 0;
		arr = new int[arr_x][arr_y];
		visit = new int[arr_x][arr_y];
		result = new int[arr_x * arr_y];
		
		for(int i=0; i<arr_x; i++){
			for(int j=0; j<arr_y; j++){
				visit[i][j] = 0;
			}
		}
		for(int k = 0; k<n; k++){
			int x_first = input.nextInt();
			int y_first = input.nextInt();
			int x_second = input.nextInt();
			int y_second = input.nextInt();
			
			for(int i=y_first; i<y_second; i++){
				for(int j=x_first; j<x_second; j++){
					visit[i][j] = 1;
				}
			}
		}
		
		for(int i=0; i<arr_x; i++){
			for(int j=0; j<arr_y; j++){
				if(visit[i][j] == 1)
					cnt++;
				System.out.print(visit[i][j] + " ");
			}
			System.out.println();
		}
		int t = 1;
		for(int i=0; i<arr_x; i++){
			for(int j=0; j<arr_y; j++){
				if(visit[i][j] == 0){
					search(i, j, t);
					t++;
				}
			}			
		}
	}
	
	public static void search(int a, int b, int t){
		arr[a][b] = t;
		result[t]++;
		for(int i=0; i<4; i++){
			int nx = i + dx[i];
			int ny = i + dy[i];
			if( nx>=0 && ny >=0 && nx<arr_x && ny < arr_y){
				search(nx,ny,t);
			}
		}
			
	}

}
