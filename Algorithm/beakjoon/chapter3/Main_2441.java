package Algorithm.beakjoon.chapter3;

import java.util.Scanner;

public class Main_2441 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,i,j,k;
		while(true){
			a=input.nextInt();
			if(a<=100 && a>=1)
				break;
		}

		for(i=0; i<=a; i++){
			for(k=0; k<i; k++)
                System.out.print(" ");
            
			for(j=0; j<a-k; j++)
				System.out.print("*");
			
			System.out.print("\n");
		}
	}

}