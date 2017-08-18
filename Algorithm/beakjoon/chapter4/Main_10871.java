package Algorithm.beakjoon.chapter4;
import java.util.Scanner;

public class Main_10871 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double max = 0;
		double avg = 0, sum = 0;
		double arr[] = new double[n];
		double result[] = new double[n];
		
		for(int i=0; i<n; i++){
			arr[i] = input.nextInt();
		}
		
		for(int i=0; i<n; i++){
			if(arr[i] > max)
				max = arr[i];
		}
	
		for(int i=0; i<n; i++){
			result[i] = (arr[i] / max) * 100;
			sum = sum + result[i];
		}
		
		avg = sum / n;
		System.out.format("%.2f%n", avg);
	}

}
