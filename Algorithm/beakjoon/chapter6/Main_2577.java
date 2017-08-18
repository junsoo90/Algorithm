package Algorithm.beakjoon.chapter6;

import java.util.*;

public class Main_2577 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt() * input.nextInt() * input.nextInt();
		int arr[] = new int[10];
		int ten = 1;
		System.out.println(n);
		while(n / ten != 0){
			int temp = n/ten % 10;
			arr[temp]++;
			ten *= 10;
		}
		for(int i=0; i<10; i++)
			System.out.println(i + " = " + arr[i]);
		
	}

}
