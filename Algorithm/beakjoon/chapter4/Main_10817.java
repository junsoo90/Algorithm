package Algorithm.beakjoon.chapter4;

import java.util.Arrays;
import java.util.Scanner;

public class Main_10817 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int arr[] = new int[3];
		for(int i=0; i<arr.length; i++){
			arr[i] = input.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println(arr[1]);
	}
}
