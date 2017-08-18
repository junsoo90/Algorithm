package Algorithm.beakjoon.chapter11;

import java.util.Scanner;
import java.util.Stack;


public class Main_2054 {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		String str = input.next();
		if(str.length() < 1 && str.length() > 30)
			return;
		int temp = 0;
		Stack stack = new Stack();
		
		for(int i=0; i<str.length(); i++){
			
			if(str.charAt(i) == '(' || str.charAt(i) == '['){
				stack.push(str.charAt(i));
			}
			
			else if(str.charAt(i) == ')'){
				if(stack.empty())
					break;
				else if(stack.peek().equals('(')){
					stack.pop();
					stack.push('2');
				}
				else if(stack.empty())
					System.out.println("0");
				else					
					temp = stackLoop(stack, str.charAt(i));				
			}
			
			else if(str.charAt(i) == ']'){
				if(stack.empty())
					break;
				else if(stack.peek().equals(('['))){
					stack.pop();
					stack.push('3');
				}
				else{
					temp = stackLoop(stack, str.charAt(i));
				}
			}
		}
		
		 int sum = 0;
		 while (!stack.isEmpty()) {
				if (stack.peek().equals('(') || stack.peek().equals(')') || stack.peek().equals('[')
						|| stack.peek().equals(']')) {
					System.out.println(0);
					return;
				}
				sum += Integer.parseInt(stack.pop().toString());
			}
		 System.out.println(sum);
	}
	
		static int stackLoop(Stack stack, char ch){
			int result = 0;
			
			while(!stack.isEmpty()){
				if(ch == ')'){
					if(stack.peek().equals('(')){
						stack.pop();
						result *= 2;
						
						stack.push(result);
						break;
					}
					else if(stack.peek().equals('['))
						return result;
					else
						result += Integer.parseInt(stack.pop().toString());
				}
				else if(ch ==']'){
					if(stack.peek().equals('[')){
						stack.pop();
						result *= 3;
						
						stack.push(result);
						break;
					}
					else if(stack.peek().equals('('))
						return result;
					else{
						result += Integer.parseInt(stack.pop().toString());
				}
				
				}
			}
			return result;
		}
			
}
