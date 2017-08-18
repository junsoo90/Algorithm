package Algorithm.beakjoon.chapter8;

import java.util.*;

public class Main_2292 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int cnt = 1, temp = 1;
		
		for(int i=1; i<=n; i++){
			if(n==1){				
				break;
			}			
			temp += i*6;
			cnt++;
			if(temp >= n)
				break;
		}
		System.out.println(cnt);
	}

}
