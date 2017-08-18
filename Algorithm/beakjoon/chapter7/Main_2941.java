package Algorithm.beakjoon.chapter7;

import java.util.*;

public class Main_2941 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		String cro[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
	
		//StringBuilder sb = new StringBuilder();
		int cnt = 0;

        for(int i=0; i<cro.length; i++){
            str = str.replaceAll(cro[i], "1");
        }
 
        System.out.println(str.length());
        
        
	}

}
