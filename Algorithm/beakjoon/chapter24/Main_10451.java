package Algorithm.beakjoon.chapter24;

import java.util.*;

public class Main_10451 {
    static int arr[][];
    static boolean visit[];
    static int count = 0;
    static int start, m;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();


        for(int i=0; i<n; i++){
            count = 0;
            m = input.nextInt();
            arr = new int[m][m];
            visit = new boolean[m];

            for(int j=0; j<m; j++){
                int t = input.nextInt();
                arr[j][t-1] = 1;
            }

            for(int j=0; j<m; j++){
                start = j;
                for(int k=0; k<m; k++){
                    if(!visit[k] && arr[j][k] == 1)
                        dfs(k);
                }
            }
            System.out.println(count);
        }


    }

    public static void dfs(int t){

        if(start == t)
            count++;
        visit[t] = true;

        for(int i=0; i<m; i++){
            if(!visit[i] && arr[t][i] == 1){
                dfs(i);
            }
        }

    }

}
