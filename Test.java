import java.util.*;
public class Test {

    public static void main(String[] args) {

        String temp = "aabbbbcdeeefgggabcdefg";

        char ch[] = new char[temp.length()];
        int chcnt = 0;

        ch[0] = temp.charAt(0);

        for(int j=0; j<temp.length(); j++) {
            if(ch[chcnt] != temp.charAt(j)){
                chcnt++;
                ch[chcnt] = temp.charAt(j);
            }
            System.out.println(ch[chcnt]);
        }
    }
}