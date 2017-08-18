package Algorithm.beakjoon.chapter3;
import java.util.Scanner;

public class Main_11720 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String num = input.next();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++){
			 sum = sum + (num.charAt(i-1)-'0');
		}
		System.out.println(sum);
			
	}

}
