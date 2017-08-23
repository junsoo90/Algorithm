package Algorithm.beakjoon.chapter7;

import java.util.Scanner;

public class Main_1316 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //입력할 문자열의 개수 입력
        int cnt = 0;
        for(int i=0; i<n; i++){
            String temp = scan.next();
            char ch[] = new char[temp.length()];
            int intch[] = new int[26];
            int chcnt = 0;
            ch[0] = temp.charAt(0);
            intch[ch[0] - 97]++;

            for(int j=0; j<temp.length(); j++) {
                if(ch[chcnt] != temp.charAt(j)){
                    chcnt++;
                    ch[chcnt] = temp.charAt(j);
                    intch[temp.charAt(j) - 97]++;
                }
            }

            for(int j=0; j<26; j++){
                if(intch[j] > 1) {
                    break;
                }
                else if(j == 25) {
                    cnt++;
                }
            }
        }

        System.out.println("cnt = " + cnt);
    }
}
