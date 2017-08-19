package Algorithm.beakjoon.chapter24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main_2667 {

    static int n;
    static int nx[] = {1,-1,0,0};
    static int ny[] = {0,0,1,-1};
    static int cnt[];
    static int count=0;
    static boolean arr[][];
    static boolean visit[][];

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(in.readLine());
        arr = new boolean[n][n];
        cnt = new int[n*n];
        visit = new boolean[n][n];

        ArrayList list = new ArrayList<>();
        for(int i=0; i<n; i++){
            String str = in.readLine();
            for(int j=0; j<n; j++){
                if(str.charAt(j) == '1')
                    arr[i][j] = true;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                count=0;
                if(!visit[i][j] && arr[i][j]){
                    dfs(i,j);
                    list.add(count);
                }
            }
        }
        System.out.println(list.size());
        Collections.sort(list);

        for(int i=0; i<list.size(); i++)
            System.out.println(list.get(i));
    }

    public static void dfs(int x, int y){

        count++;
        visit[x][y] = true;


        for(int i=0; i<4; i++){
            int xx = x + nx[i];
            int yy = y + ny[i];

            if(xx >= 0 && yy >= 0 && xx < n && yy < n){
                if(arr[xx][yy] && !visit[xx][yy])
                    dfs(xx,yy);
            }
        }

    }
}
