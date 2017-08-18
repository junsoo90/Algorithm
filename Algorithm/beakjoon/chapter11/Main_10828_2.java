package Algorithm.beakjoon.chapter11;

import java.util.Scanner;

public class Main_10828_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		String input_str;
		CStack stack = new CStack(n);
		
		for(int i=0; i<=n; i++){
			input_str = input.nextLine();
			String[] split = input_str.split(" ");
			String str = split[0];
			
			if(str.equals("push")){ 
				stack.push(Integer.parseInt(split[1]));
			}
			
			else if(str.equals("pop")){
				stack.pop();
				
			}
			
			else if(str.equals("size")){
				stack.size();
			}
			
			else if(str.equals("empty")){
				stack.empty();
			}
			
			else if(str.equals("top")){
				stack.top();
			}
		}
	}
}


class CStack {
	private int stack[];
	private int top = -1;
	
	public CStack(){}
	
	public CStack(int n){
		stack = new int[n];
	}
	
	public void push(int n){
		top++;
		stack[top] = n;		
	}
	
	public void pop(){
		if(top < 0)
			System.out.println(-1);
		else{
			System.out.println(stack[top]);
			top--;
		}				
	}
	
	public void top(){
		if(top < 0 )
			System.out.println(-1);
		else
			System.out.println(stack[top]);
	}
	
	public void empty(){
		if(top < 0)
			System.out.println(1);
		else
			System.out.println(0);
	}
	
	public void size(){
			System.out.println(top+1);
	}
	

}
