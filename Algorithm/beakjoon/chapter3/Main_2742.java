package Algorithm.beakjoon.chapter3;
import java.util.Scanner;

public class Main_2742 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		while(true){
			a=input.nextInt();
			if(a<=100000)
				break;
		}

		for(int i=a; i>=1;i--)
			System.out.println(i);
	}

}
