package Algorithm.beakjoon.chapter6;

import java.util.*;

public class Main_8958 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String arr[] = new String[n];
	
		for(int i=0; i<n; i++){
			arr[i] = input.next();
		}
		
		for(int i=0; i<arr.length; i++){
			int temp = 0, cnt = 0;
			for(int j=0; j<arr[i].length(); j++){
				if(arr[i].charAt(j) == 'O'){					
					temp++;
					cnt += temp;
				}
				
				if(arr[i].charAt(j) == 'X'){
					temp = 0;
				}
			}
			
			System.out.println(cnt);
			
		}
		
	}

}
