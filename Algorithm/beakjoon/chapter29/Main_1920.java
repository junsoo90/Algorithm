package Algorithm.beakjoon.chapter29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1920{
    static int first[];
    static int sec[];

    public static void main(String args[]) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        first = new int[n];

        StringTokenizer token = new StringTokenizer(in.readLine(), " ");
        for (int i = 0; i < n; i++) {
            first[i] = Integer.parseInt(token.nextToken());
        }

        int m = Integer.parseInt(in.readLine());
        sec = new int[m];

        token = new StringTokenizer(in.readLine(), " ");
        for (int i = 0; i < m; i++) {
            sec[i] = Integer.parseInt(token.nextToken());
        }

        Arrays.sort(first);

        for (int i = 0; i < m; i++) {
            System.out.println(bst(0, n - 1, sec[i]));

        }
    }

    public static int bst(int left, int right, int temp) {
        int mid = (left + right) / 2;
        int result = 0;

        if (left > right)
            return 0;
        else{
            if (first[mid] > temp)
                result = bst(left, mid-1, temp);

            else if (first[mid] < temp)
                result= bst(mid+1, right, temp);

            else
                return 1;
            return result;
        }
    }

}
