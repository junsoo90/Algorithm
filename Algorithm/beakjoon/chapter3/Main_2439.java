package Algorithm.beakjoon.chapter3;

import java.util.Scanner;

public class Main_2439 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,i,j,k;
		while(true){
			a=input.nextInt();
			if(a<=100 && a>=1)
				break;
		}

		for(i=1; i<=a; i++){
			for(j=a-i; j>0; j--)
				System.out.print(" ");
			for(k=i; k>0; k--)
				System.out.print("*");
			System.out.print("\n");
		}
	
		
	}

}
