package Algorithm.beakjoon.chapter7;

import java.util.*;

public class Main_2908 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		n1 = n1/100 + ((n1/10)%10) * 10 + (n1%10) * 100;
		n2 = n2/100 + ((n2/10)%10) * 10 + (n2%10) * 100;
		
		if(n1>n2)
			System.out.println(n1);
		else
			System.out.println(n2);

	}

}
