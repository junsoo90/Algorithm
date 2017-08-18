package Algorithm.beakjoon.chapter5;

import java.util.Scanner;

public class Main_1065 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int arr[] = new int[1001];
		int cnt = 0;
		for(int i=1; i<=n; i++){
			cnt += hansu(i);
		}
		System.out.println(cnt);
	}
	static int hansu(int n){		
		if(n <= 99)
			return 1;
		else{
			
			int t1 = n%10 - (n/10)%10;
			int t2 = (n/10)%10 - n/100;
			
			if(t1 != t2)		
				return 0;
			else
				return 1;
		}
	}

}
