package Algorithm.beakjoon.chapter9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(buf.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(buf.readLine()));
        }

        Collections.sort(list);
        for(int printlist : list)
            System.out.println(printlist);
        // 한글테스트
    }
}
