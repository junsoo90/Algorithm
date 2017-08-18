package Algorithm.beakjoon.chapter3;

import java.util.Scanner;

public class Main_1924 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int mon, day, total=0;
	
	
		int year[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String week[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		while(true){
			mon = input.nextInt();
			day = input.nextInt();
			
			if(mon == 1 || mon == 3 || mon == 5 || mon == 7 ||mon == 8 || mon == 10 || mon == 12 ){
				if(day <= 31 && day >= 1 )
					break;
			}
			else if(mon == 4 || mon == 6 || mon == 9 || mon == 11){
				if(day <= 30 && day >= 1)
					break;
			}
			else if(mon == 2){
				if(day <= 28 && day >= 1)
					break;
			}
		}
		
		for(int i=0; i<mon-1; i++){		
			total = total + year[i];
		}
		total = total + day;
		System.out.println(week[total%7]);
	}

}
