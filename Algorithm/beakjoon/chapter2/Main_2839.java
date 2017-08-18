package Algorithm.beakjoon.chapter2;

import java.util.Scanner;

public class Main_2839 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, cnt=0;
		while(true){
			a = input.nextInt();
			if(a>=3 && a<=5000)
				break;
		}
		

		if( a % 5 == 0){
			cnt = a/5;			
		}
		
		else{
			for(int i=a/5; i>0; i--){
				if(  ( a-(5*i) ) % 3 == 0){
					cnt = i + (a-(5*i)) / 3;
					
					System.out.println(cnt);
					return;
				}
				else 
					continue;
			}

			if(a%3==0)
				cnt = a/3;
			else
				cnt = -1;
		}
	
		System.out.println(cnt);
	}
}
