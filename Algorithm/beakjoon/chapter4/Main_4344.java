package Algorithm.beakjoon.chapter4;
import java.util.Scanner;

public class Main_4344 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		double sco_cnt[][] = new double[n][];
		double cnt = 0, avg = 0;
		int sum = 0;
		
		for(int i=0; i<n; i++){
			int temp = input.nextInt();
			sco_cnt[i] = new double[temp];
			
			for(int j=0; j<temp; j++){
				sco_cnt[i][j] = input.nextInt();
			}
	            
		}
		
		for(int i=0; i<n; i++){
			sum = 0;
			avg = 0;
			cnt = 0;
			 for(int j=0; j<sco_cnt[i].length;j++){
	                avg = (sum+=sco_cnt[i][j])/sco_cnt[i].length;
	         }
			 System.out.println("avg = " + avg);
             for(int j=0; j<sco_cnt[i].length;j++){
                if(avg<sco_cnt[i][j]){
                    cnt++;
                }
            }
	            System.out.printf("%.3f%% \n",(double)((cnt*100)/(sco_cnt[i].length)));
		}

		
	}

}
