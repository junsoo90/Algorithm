package Algorithm.beakjoon.chapter6;

import java.util.*;

public class Main_10039 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n[] = new int[5];
		int sum = 0;
		for(int i=0; i<5; i++){
			n[i] = input.nextInt();
			if(n[i] <= 40)
				n[i] = 40;
			sum += n[i];
		}
		System.out.println(sum/5);
	}

}
