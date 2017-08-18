package Algorithm.beakjoon.chapter5;

public class Main_4673 {
	public static void main(String[] args) {
		
		int arr[] = new int[12000];
		int selfn[] = new int[12000];
		int a = 1234;

		for(int i=0; i<=10000; i++){
			selfn[i] = 1;
		}
			
		for(int i=0; i<=10000; i++){
			selfn[d(i)] = 0;
			if(selfn[i] != 0)
				System.out.println(i);
		}
		
		
		
	}
	
	static int d(int n){
		int selfnum = 0;
		
		if(n/10 == 0){ // 1�ڸ�
			selfnum = n+n;
		}
		else if(n / 100 == 0){ // 10�ڸ�
			selfnum = n + n%10 + n/10;
		}
		
		else if(n / 1000 == 0){ // 100�ڸ� 
			selfnum = n + n/100 + (n%100)/10 + (n%100)%10;
		}
		else if(n / 10000 == 0){ // 1000�ڸ�
			selfnum = n + n/1000 + (n%1000)/100 + (n%100)/10 + n%10; 
		}
		
		return selfnum;
				
	}

}
