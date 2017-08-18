package Algorithm.beakjoon.chapter6;
import java.util.*;

public class Main_1152 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		String strarr[] = str.split(" ");
		int cnt = 0;
		if(strarr.length < 1000000)
			cnt = strarr.length;
		
		for(int i=0; i<strarr.length; i++){
			if(strarr[i].equals(""))
				cnt--;
		}
			

		System.out.println(cnt);
	}

}
