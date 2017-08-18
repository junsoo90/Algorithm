package Algorithm.beakjoon.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.*;

public class Main_11866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(System.in);
//		int n1 = Integer.parseInt(input.readLine());
//		int n2 = Integer.parseInt(input.readLine());
		
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		
		int arr[] = new int[n1];
		Deque q = new ArrayDeque();
		
		for(int i=1; i<=n1; i++){
			q.add(i);
		}
		
		int cnt = 0;
		while(!q.isEmpty()){
			
			for(int i=0; i<n2-1; i++){
				q.addLast(q.removeFirst());				
			}
			arr[cnt] = (int) q.removeFirst();
			cnt++;
		}
		System.out.print("<");
		for(int i=0; i<n1; i++){
			System.out.print(arr[i]);
			if(i == cnt-1)
				System.out.print(">");
			else
				System.out.print(", ");
		}
	}

}
