package Algorithm.beakjoon.chapter1;

import java.util.Scanner;

public class Main_11718 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
		
		while(input.hasNextLine()){ 
			String a = input.nextLine();
			if (!(a.isEmpty() | a.length() > 100))
		

            System.out.println(a);
		}
		
	}
}
