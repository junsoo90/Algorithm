package Algorithm.beakjoon.chapter3;

import java.util.Scanner;

public class Main_11721 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		for(int i=0; i<str.length(); i++){
			
			System.out.print(str.charAt(i));
			if(i%10 == 9)
				System.out.println();
		}
	}

}
