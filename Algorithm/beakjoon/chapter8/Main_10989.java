package Algorithm.beakjoon.chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main_10989 {
    static int n;
    static int arr[];
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(buf.readLine());
        arr = new int[10001];

        for(int i=0; i<n; i++){
            arr[i] =  Integer.parseInt(buf.readLine());
        }
        quick_sort(0, n-1);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++)
            sb.append(arr[i] + "\n");
            //System.out.println(arr[i]);

        System.out.println(sb);

    }

    public static void quick_sort(int L,int R) {
        int left = L;
        int right = R;
        int pivot = arr[(L + R) / 2];

        while (left <= right) {
            while (arr[left] < pivot) left++;
            while (arr[right] > pivot) right--;
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        if (L < right) quick_sort(L, right);
        if (R > left) quick_sort(left, R);
    }
}
