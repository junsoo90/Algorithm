package Algorithm.beakjoon.chapter7;

import java.util.*;

public class Main_10809 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int alpha[] = new int[26];
		
		for(int i=0; i<26; i++)
			alpha[i] = -1;
		
		for(int i = 0; i < str.length(); i ++){
			if(alpha[str.charAt(i) - 'a'] >= 0)
				continue;
			else
				alpha[str.charAt(i) - 'a'] = i;
		}
	
		for(int i=0; i<alpha.length; i++)
			System.out.print(alpha[i] + " ");
			
		
	}

}
