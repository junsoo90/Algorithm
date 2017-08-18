package Algorithm.beakjoon.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_10866 {

	static int arr[];
	static int size = -1;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(input.readLine());
		arr = new int[n];
		String num = null;
		for(int i=0; i<n; i++){
			String str = input.readLine();
			StringTokenizer sb = new StringTokenizer(str);
			
			try{
				while(sb.hasMoreTokens()){
					str = sb.nextToken();
					num = sb.nextToken();
				}
			}catch(Exception e){}
			
			System.out.println(num);
			if(str.equals("push_back")){
				push_back(Integer.parseInt(num));
				
			}
			
			else if(str.equals("push_front")){
				push_front(Integer.parseInt(num));
			}
			
			else if(str.equals("front")){
				front();
			}
			
			else if(str.equals("back")){
				back();
			}
			
			else if(str.equals("size")){
				size();
			}
			
			
			else if(str.equals("empty")){
				empty();
			}
			
			else if(str.equals("pop_front")){
				pop_front();
			}
			
			else if(str.equals("pop_back")){
				pop_back();
			}
		}
	}

	public static void push_front(int n){
		
		size++;
		for(int i=size; i>0; i--)
			arr[i] = arr[i-1];
		arr[0] = n;
		
	}
	
	public static void push_back(int n){
		
		size++;	
		arr[size] = n;
		
	}
	
	public static void pop_back(){
		int temp = arr[size];
		if(size == 0){
			System.out.println(-1);
			return;
		}
		
		arr[size] = 0;
		size--;
		System.out.println(temp);
	}
	
	public static void pop_front(){
		int temp = arr[0];
		if(size < 0){
			System.out.println(-1);
			return;
		}
		for(int i=0; i<size; i++){
			arr[i] = arr[i+1];
		}
		
		size--;
		System.out.println(temp);
	}
	
	


	
	public static void size(){
		if(size<0){  
            System.out.println("0");  
            return;  
        } 


		System.out.println(size+1);
	}
	
	public static void empty(){
		if(size < 0)
			System.out.println(1);
		else
			System.out.println(0);
	}
	
	public static void front(){
		if(size < 0){
			System.out.println(-1);
			return;
		}
		
		System.out.println(arr[0]);
	}
	
	public static void back(){
		if(size < 0){
			System.out.println(-1);
			return;
		}
		System.out.println(arr[size]);
	}


}

