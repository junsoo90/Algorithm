package Algorithm.beakjoon.chapter3;
import java.util.Scanner;

public class Main_2741 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		while(true){
			a=input.nextInt();
			if(a<=100000)
				break;
		}

		for(int i=1; i<=a;i++)
			System.out.println(i);
	}

}
