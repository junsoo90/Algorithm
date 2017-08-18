package Algorithm.beakjoon.chapter7;

import java.util.*;

public class Main_5622 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		String arr[] = {"ABC", "DEF", "GHI", "JKL", "MNO", "QPRS", "TUV","WXYZ"};
		int cnt[] = new int[9];
		
		for(int i=0; i<str.length(); i++){
			for(int j=0; j<arr.length; j++){
				for(int k=0; k<arr[j].length(); k++){
					if(str.charAt(i) == arr[j].charAt(k)){
						cnt[j]++;
						break;
					}
				}
			}
		}

		 int sum = 0;
	        for(int i=0; i<cnt.length; i++){
	            if(cnt[i] != 0){
	                sum = sum + ((i+3)*cnt[i]);
	            }
	        }
	        
	        System.out.println(sum);
	}

}
