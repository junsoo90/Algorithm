package Algorithm.beakjoon.chapter7;

import java.util.*;

public class Main_1157 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		int alph_cnt[] = new int[26];
		char alph[] = new char[26];
		int max = 0;
		
		alph[0] = 'A';
		alph_cnt[0] = 0;
		
		for(int i=1; i<26; i++){
			alph[i] = (char)(alph[i-1]+1);			
		}
		
		for(int i=0; i<str.length(); i++){
			for(int j=0; j<26; j++){
				if(alph[j] == Character.toUpperCase(str.charAt(i))){
					alph_cnt[j]++;
				}
			}
		}
		
		int[] copy_alph = Arrays.copyOf(alph_cnt, 27);
		Arrays.sort(alph_cnt);
		
		if(alph_cnt[25] == alph_cnt[24])
			System.out.println("?");
		else{
			for(int i=0; i<26; i++){
				if(alph_cnt[25] == copy_alph[i])
					System.out.println(alph[i]);
			}
		}

	}

}
