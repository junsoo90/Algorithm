package Algorithm.beakjoon.chapter24;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_2606 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		//Scanner input = new Scanner(System.in);
		
		int n = Integer.parseInt(input.readLine());
		int m = Integer.parseInt(input.readLine());
		String str[];
		
		//int n = input.nextInt();
		//int m = input.nextInt();
		
		int arr[][] = new int[n][n];
		boolean visit[] = new boolean[n];
		int count = 0;
		
		for(int i=0; i<m; i++){
			StringTokenizer st = new StringTokenizer(input.readLine());
			
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			
//			int a = input.nextInt();
//			int b = input.nextInt();
			
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		
		Stack stack = new Stack();
		
		stack.push(0);
		visit[0] = true;
		
		while(stack.size() != 0){
			int temp = stack.peek();
			stack.pop();
			
			
			for(int i=0; i<n; i++){
				if(!visit[i] && arr[temp][i] == 1){
					visit[i] = true;
					stack.push(i);
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

}

class Stack{
	static int cnt;
	static int arr[];
	
	Stack(){
		cnt = -1;
		arr = new int[100];
	}
	public static int size(){
		return cnt+1;
	}
	public static int peek(){
		return arr[cnt];
	}
	public static void push(int temp){
		cnt++;
		arr[cnt] = temp;
	}
	
	public static void pop(){
		cnt--;		
	}
		
	
	
}