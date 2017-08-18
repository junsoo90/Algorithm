package Algorithm.beakjoon.chapter11;

import java.util.Scanner;

public class Main_1874 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int big = 0, top = 0, idx = 0, num;
		int stack[] = new int[1000000];
		String ans[] = new String[100000*2];
		
		for (int i = 0; i < n; i++)
		{
			int num1 = input.nextInt();
			if (stack[top]<num1)
			{
				for (int j = big; j < num1; j++)
				{
					stack[top++] = j + 1;
					ans[idx++] = "+";
				}
				big = num1;
			}

			if (stack[--top] == num1)
				ans[idx++] = "-";
			else
			{
				System.out.println("NO");
				return ;
			}
		}
		for (int i = 0; i < idx; i++)
			System.out.println(ans[i]);
	
		
		
		
	}
}
