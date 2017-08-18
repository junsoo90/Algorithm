package Algorithm.beakjoon.chapter11;

import java.util.Scanner;
import java.util.Stack;

public class Main_10828 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		String input_str;
		Stack stack = new Stack();
		
		for(int i=0; i<=n; i++){
			input_str = input.nextLine();
			String[] split = input_str.split(" ");
			String str = split[0];
			
			if(str.equals("push")){ 
				stack.push(split[1]);
			}
			
			else if(str.equals("pop")){
				if(stack.isEmpty())
					System.out.println(-1);
				else{
					
					System.out.println(stack.pop());
				}
			}
			
			else if(str.equals("size")){
				System.out.println(stack.size());
			}
			
			else if(str.equals("empty")){
				if(stack.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			}
			
			else if(str.equals("top")){
				if(stack.isEmpty())
					System.out.println(-1);
				else
					System.out.println(stack.peek());
			}
		}
		
		/*
		int stack[] = new int[1000];
		int cnt = 0;
		
		for(int i=0; i<n; i++){
			String str = input.nextLine();
			
			if(str.equals("push")){ // push �Է�
				int nn = input.nextInt();
				stack[cnt] = nn;
				System.out.println(stack[cnt]);
				cnt++;
			}
			
			if(str.equals("pop")){
				if(cnt > 0){
					System.out.println(stack[cnt-1]);
					cnt--;
				}
				else{
					System.out.println(-1);
				}
			}
			else if(str.equals("size")){
				System.out.println(cnt);
			}
			
			else if(str.equals("empty")){
				
				if(stack != null)
					System.out.println(0);
				else
					System.out.println(1);
			}
			
			else if(str.equals("top")){
				if(cnt <= 0)
					System.out.println(-1);
				else
					System.out.println(stack[cnt-1]);
			}
			
		}
		*/
		
	}
}
