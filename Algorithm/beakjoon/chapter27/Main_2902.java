package Algorithm.beakjoon.chapter27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2902 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        StringTokenizer token = new StringTokenizer(str, "-");

        while(token.hasMoreTokens()){
            System.out.print(token.nextToken().charAt(0));
        }

    }

}
