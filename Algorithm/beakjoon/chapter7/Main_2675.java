package Algorithm.beakjoon.chapter7;

import java.util.*;

public class Main_2675 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int cnt;
		String str;
		
		for(int i=0; i<n; i++){
			cnt = input.nextInt();
			str = input.next();
			for(int j=0; j<str.length(); j++){
				for(int k=0; k<cnt; k++){
						System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
		
	}

}
