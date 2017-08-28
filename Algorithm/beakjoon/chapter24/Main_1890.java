package Algorithm.beakjoon.chapter24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1890 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buf.readLine());
        int arr[][] = new int[n][n];
        long temp[][]= new long[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer token = new StringTokenizer(buf.readLine(), " ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(token.nextToken());
            }
        }
        temp[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( temp[i][j] == 0 || (i == n - 1 && j == n - 1)) {
                    continue;
                }
                int dist = arr[i][j];

                int down = dist + i;
                int right = dist + j;

                if(down < n)
                    temp[down][j] += temp[i][j];
                if(right < n)
                    temp[i][right] += temp[i][j];
            }
        }

        System.out.println(temp[n-1][n-1]);

    }
}




