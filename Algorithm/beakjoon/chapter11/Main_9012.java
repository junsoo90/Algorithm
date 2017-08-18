package Algorithm.beakjoon.chapter11;

import java.util.Scanner;

public class Main_9012 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for(int i=0; i<n; i++){
			int cnt=0;
			String str = input.next();
			if(str.length() < 2 || str.length() > 50)
				return;
			if(str.charAt(0) != '(' || str.charAt(str.length()-1) != ')'){
				System.out.println("NO");
				continue;
			}
				
			for(int j=0; j<str.length(); j++){
				
				if(str.charAt(j) == '(')
					cnt++;
				else if (str.charAt(j) == ')' && cnt > 0){
					cnt--;
					
					
				}
				// (()))(()
	            else if (str.charAt(j) == ')' && cnt <= 0) 
	            	cnt--;
				if(cnt < 0 ){
					break;
				}
				//System.out.println(cnt);
	        }
			if(cnt == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
	}
	
}
