package Algorithm.beakjoon.chapter10;

import java.util.Scanner;

public class Main_1978 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1 = input.nextInt();
		int n2 = input.nextInt();

		for(int i=n1; i<=n2; i++){
			for(int j=2; j<=i; j++){
				if(i%j == 0){
					 if(i==j){
						 System.out.println(i);
 
					 }
                     else
                        break;
				}
			}
		}
			
		
	}

}
