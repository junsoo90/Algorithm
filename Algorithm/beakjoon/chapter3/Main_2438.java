package Algorithm.beakjoon.chapter3;

import java.util.Scanner;

public class Main_2438 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		while(true){
			a=input.nextInt();
			if(a<=100 && a>=1)
				break;
		}

		for(int i=0; i<a; i++){
			for(int j=0; j<=i; j++)
				System.out.print("*");
			System.out.print("\n");
		}
	}

}