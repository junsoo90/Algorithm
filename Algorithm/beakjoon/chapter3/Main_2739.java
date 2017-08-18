package Algorithm.beakjoon.chapter3;

import java.util.Scanner;

public class Main_2739 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		while(true){
			a=input.nextInt();
			if(a<=9 && a>=1)
				break;
		}

		for(int i=1; i<=9; i++){
			System.out.printf("%d * %d = %d\n", a , i , a*i);
		}
	}

}
