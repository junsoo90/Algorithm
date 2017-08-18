package Algorithm.beakjoon.chapter4;

import java.util.Scanner;

public class Main_1110 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);		
		int n = input.nextInt();
		int newnum, cnt = 0;
		int temp = n;
		while(true){
			
			if(n < 10){
				newnum = n + n*10;
			}
			else{
				int first = n / 10;
				int second = n % 10;
				int result = first + second;
				
				newnum = result%10 + second*10;
			}

			n = newnum;
			cnt++;	
			if(temp == n)
				break;
		}
		System.out.println(cnt);
	}

}
