package Algorithm.beakjoon.chapter12;

import java.util.Scanner;

public class Main_10845 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		CQueue quere = new CQueue(n);
		
		
		for(int i=0; i<=n; i++){
			String input_str = input.nextLine();
			String[] split = input_str.split(" ");
			String str = split[0];
			
			if(str.equals("push")){ 
				quere.push(Integer.parseInt(split[1]));
			}
			
			else if(str.equals("pop")){
				quere.pop();
			}
			
			else if(str.equals("size")){
				quere.size();
			}
			
			else if(str.equals("empty")){
				quere.empty();
			}
			
			else if(str.equals("front")){
				quere.front();
			}
			
			else if(str.equals("back")){
				quere.back();
			}
			
		}
	}
}


class CQueue {

	private int size = 0;
	private int queue[];
	private int front = 0;
	
	public CQueue(){}
	
	public CQueue(int n){
		queue = new int[n];
	}
	
	public void push(int n){
		queue[front+size] = n;
		size++;
	}
	
	public void pop(){
		if(size <= 0)
			System.out.println(-1);
		else{
			System.out.println(queue[front]);
			front++;
			size--;
		}
	}
	
	public void size(){
		System.out.println(size);
	}
	
	public void empty(){
		if(size <= 0)
			System.out.println(1);
		else
			System.out.println(0);
	}
	
	public void front(){
		if(size <= 0)
			System.out.println(-1);
		else			
			System.out.println(queue[front]);
	}
	
	public void back(){
		if(size <= 0)
			System.out.println(-1);
		else
			System.out.println(queue[front+size-1]);
	}
}
