package Algorithm.beakjoon.chapter6;

import java.util.*;

public class Main_2920 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] n = new int[9];
		int ase = 0, des = 0;
		
		for(int i=0; i<8; i++){
			n[i] = input.nextInt();
			
			if (n[i] == i + 1) 
				ase++;

			else if (n[i] == 8 - i) 
				des++;
		}
		
		if (ase == 8) 
			System.out.println("ascending");
		
		else if (des == 8) 
			System.out.println("descending");
		
		else 
			System.out.println("mixed");
		
		
	}

}
